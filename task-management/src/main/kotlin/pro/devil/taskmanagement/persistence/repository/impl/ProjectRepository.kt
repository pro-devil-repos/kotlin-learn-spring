package pro.devil.taskmanagement.persistence.repository.impl

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Repository
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.persistence.repository.IProjectRepository

@Repository
class ProjectRepository : IProjectRepository {

    @Value("\${project.prefix}")
    private lateinit var prefix: String

    @Value("\${project.suffix}")
    private var suffix: Int? = null

    private val projects: MutableList<Project> = arrayListOf()

    override fun findById(id: Long?): Project? = projects.firstOrNull() { it.id == id }

    override fun save(project: Project): Project {
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