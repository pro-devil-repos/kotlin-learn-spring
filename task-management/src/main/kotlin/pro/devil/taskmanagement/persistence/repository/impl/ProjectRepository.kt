package pro.devil.taskmanagement.persistence.repository.impl

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Repository
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.persistence.repository.IProjectRepository

@Repository
@Profile("prod")
class ProjectRepository : IProjectRepository {

    @Value("\${project.prefix}")
    private lateinit var prefix: String

    @Value("\${project.suffix}")
    private var suffix: Int? = null

    companion object {
        val LOG: Logger = LoggerFactory.getLogger(ProjectRepository::class.java)
    }

    private val projects: MutableList<Project> = arrayListOf()

    override fun findById(id: Long?): Project? = projects.firstOrNull() { it.id == id }

    override fun save(project: Project): Project {
        LOG.debug("Project Repository: Finding By Id {}", project.id)
        val existingProject = findById(project.id)

        updateInternalId(project)

        if (existingProject == null) {
            projects.add(project)
        } else {
            projects.remove(existingProject)
            projects.add(Project(project))
        }

        return project
    }

    private fun updateInternalId(project: Project) {
        project.internalId = "$prefix-${project.id}-${if (suffix == null) 1 else suffix}"
    }

}