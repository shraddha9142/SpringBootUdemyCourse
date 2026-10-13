package com.example.SpringUdemy

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping("/")
    fun helloWorld(): String {
        return "Hello, World!"
    }

    // Adding a new endpoint to demonstrate dev tools live reload
    @GetMapping("/hellodevtools")
    fun helloDevTools(): String {
        return "Hello, Dev Tools!"
    }
}