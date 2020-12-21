package pro.devil.taskmanagement.service

import pro.devil.taskmanagement.persistence.model.Project

interface IProjectService {
    fun findById(id: Long?): Project?
    fun save(project: Project): Project
}