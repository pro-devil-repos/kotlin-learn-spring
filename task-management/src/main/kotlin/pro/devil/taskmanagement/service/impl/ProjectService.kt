package pro.devil.taskmanagement.service.impl

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.persistence.repository.IProjectRepository
import pro.devil.taskmanagement.service.IProjectService

@Service
class ProjectService constructor(
    @Autowired val projectRepository: IProjectRepository
) : IProjectService {
    override fun findById(id: Long?): Project? = projectRepository.findById(id)

    override fun save(project: Project): Project = projectRepository.save(project)
}