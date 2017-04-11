package com.iqmsoft.boot.thymeleaf3.angular4.kotlin

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication


@SpringBootApplication
open class DemoApp {

}

fun main(args: Array<String>) {
    SpringApplication.run(DemoApp::class.java, *args)
}