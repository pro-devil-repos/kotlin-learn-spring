package pro.devil.taskmanagement

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.service.impl.ProjectService
import java.time.LocalDate
import javax.annotation.PostConstruct

@SpringBootApplication(
    scanBasePackages = ["pro.devil.taskmanagement.config", "pro.devil.taskmanagement.persistence", "pro.devil.taskmanagement.service"]
)
class TMApplication(
    @Autowired val projectService: ProjectService
) {

    @PostConstruct
    fun postConstruct() {
        projectService.save(
            Project(
                1L,
                "Project 1",
                LocalDate.now()
            )
        )
    }
}

fun main(args: Array<String>) {
    runApplication<TMApplication>(*args)
}
