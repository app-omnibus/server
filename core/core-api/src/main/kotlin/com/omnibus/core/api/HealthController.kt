package com.omnibus.core.api

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity


@RestController
class HealthController {

    @GetMapping("/health")
    fun health(): ResponseEntity<*> {
        return ResponseEntity.status(HttpStatus.OK).build<Any>()
    }
}