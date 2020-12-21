package pro.devil.taskmanagement.tmp

import javax.annotation.PostConstruct

class BeanA {
    @PostConstruct
    fun post() {
        println("Do Smth on beanA creation")
    }
}