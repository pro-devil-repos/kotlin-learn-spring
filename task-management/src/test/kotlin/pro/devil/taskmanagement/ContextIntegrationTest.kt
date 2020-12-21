package pro.devil.taskmanagement

import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.context.ApplicationContext
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig

@SpringJUnitConfig
class ContextIntegrationTest(
    @Autowired val applicationContext: ApplicationContext
) {

    @Test
    fun whenContextIsLoaded_thenNoExceptions() {

    }

    @Test
    fun whenContextIsLoaded_thenNoExceptions2() {

    }
}