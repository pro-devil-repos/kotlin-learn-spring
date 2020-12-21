package pro.devil.taskmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication(
    scanBasePackages = ["pro.devil.taskmanagement.config", "pro.devil.taskmanagement.persistence", "pro.devil.taskmanagement.service"]
)
class TMApplication

fun main(args: Array<String>) {
    runApplication<TMApplication>(*args)
}
