package pro.devil.taskmanagement.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import pro.devil.taskmanagement.tmp.BeanA
import pro.devil.taskmanagement.tmp.BeanB

@Configuration
class TMAppConfig {

    @Bean
    fun beanA(): BeanA {
        return BeanA()
    }

    @Bean(initMethod = "initialize")
    fun beanB(): BeanB {
        return BeanB()
    }
}