package pro.devil.taskmanagement

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class TMApplication

fun main(args: Array<String>) {
    runApplication<TMApplication>(*args)
}
