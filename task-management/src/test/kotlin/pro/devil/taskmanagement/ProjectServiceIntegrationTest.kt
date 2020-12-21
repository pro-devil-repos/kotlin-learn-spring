package pro.devil.taskmanagement

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.CoreMatchers.notNullValue
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import pro.devil.taskmanagement.config.TestConfiguration
import pro.devil.taskmanagement.persistence.model.Project
import pro.devil.taskmanagement.service.IProjectService
import java.time.LocalDate

@SpringBootTest(classes = [TestConfiguration::class])
class ProjectServiceIntegrationTest(
    @Autowired val projectService: IProjectService
) {

    @Test
    fun whenSavingProject_itsOK() {
        val savedProject: Project = projectService.save(Project(1L, "Project One", LocalDate.now()))
        assertThat(savedProject, `is`(notNullValue()))
    }
}