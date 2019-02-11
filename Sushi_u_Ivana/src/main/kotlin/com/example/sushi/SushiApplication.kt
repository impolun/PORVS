package com.example.sushi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class SushiApplication

fun main(args: Array<String>) {
    runApplication<SushiApplication>(*args)
}

