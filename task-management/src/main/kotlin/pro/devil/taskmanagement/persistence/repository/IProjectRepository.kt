package pro.devil.taskmanagement.persistence.repository

import pro.devil.taskmanagement.persistence.model.Project

interface IProjectRepository {
    fun findById(id: Long?): Project?
    fun save(project: Project): Project
}