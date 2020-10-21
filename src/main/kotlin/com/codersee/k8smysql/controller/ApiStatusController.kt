package com.codersee.k8smysql.controller

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/status")
class ApiStatusController {
    @GetMapping
    fun getStatus(): ResponseEntity<String> = ResponseEntity.ok("OK")
}
