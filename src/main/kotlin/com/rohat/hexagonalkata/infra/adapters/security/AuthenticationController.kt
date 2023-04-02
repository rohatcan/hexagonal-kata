package com.rohat.hexagonalkata.infra.adapters.security

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class AuthenticationController {


    @GetMapping("/welcome")
    fun unsecure(): String {

        return "Hello world"
    }

    @GetMapping("/protected")
    fun secure(): String {

        return "Congratz you passed the login form"
    }
}