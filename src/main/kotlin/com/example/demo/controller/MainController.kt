package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody

import java.time.LocalDateTime

import kotlin.random.Random

@Controller
class MainController {

    @GetMapping({"/","/about","/test"})
    fun main(): String {
        return "index"
    }

    @GetMapping("/data")
    @ResponseBody
    fun data(): String{
        return """{
            'value' : ${Random.nextInt(10)},
            'date' : '${LocalDateTime.now()}'
        }"""
    }

}
