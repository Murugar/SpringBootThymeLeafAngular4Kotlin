package com.iqmsoft.boot.thymeleaf3.angular4.kotlin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody


@Controller
class PortController {

    @GetMapping("/")
    fun index() = "index"

    @GetMapping("/rest/welcome")
    @ResponseBody
    fun welcome() = "welcome"

    @GetMapping("/rest/json")
    @ResponseBody
    fun jsonData(): Map<String, Any> {
        return mapOf("id" to 1, "nick" to "Jackie from Spring Boot");
    }
}
