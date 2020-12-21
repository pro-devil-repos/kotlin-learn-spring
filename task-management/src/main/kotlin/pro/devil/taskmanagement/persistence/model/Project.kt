package pro.devil.taskmanagement.persistence.model

import java.time.LocalDate

open class Project(
    var id: Long?,
    var name: String,
    var dateCreated: LocalDate?
) {
    constructor(project: Project) : this(project.id, project.name, project.dateCreated)

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Project

        if (id != other.id) return false
        if (name != other.name) return false
        if (dateCreated != other.dateCreated) return false

        return true
    }

    override fun hashCode(): Int {
        var result = id?.hashCode() ?: 0
        result = 31 * result + name.hashCode()
        result = 31 * result + (dateCreated?.hashCode() ?: 0)
        return result
    }

    override fun toString(): String {
        return "Project(id=$id, name='$name', dateCreated=$dateCreated)"
    }
}