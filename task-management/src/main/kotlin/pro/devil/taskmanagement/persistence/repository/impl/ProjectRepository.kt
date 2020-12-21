package pro.devil.taskmanagement.persistence.repository.impl

import org.springframework.stereotype.Repository
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.persistence.repository.IProjectRepository

@Repository
class ProjectRepository : IProjectRepository {
    private val projects: MutableList<Project> = arrayListOf()

    override fun findById(id: Long?): Project? = projects.firstOrNull() { it.id == id }

    override fun save(project: Project): Project {
        val existingProject = findById(project.id)

        if (existingProject == null) {
            projects.add(project)
        } else {
            projects.remove(existingProject)
            projects.add(Project(project))
        }




        return project
    }

}