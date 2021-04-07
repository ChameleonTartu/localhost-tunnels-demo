package com.greenbird.localhosttunnelsdemo.controller

import com.greenbird.localhosttunnelsdemo.service.CallbackProcessorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("")
class CallbackRegistrationController @Autowired constructor(val callbackProcessorService: CallbackProcessorService) {

    @PostMapping("/register/callback")
    fun register(@RequestParam callback: String) {
        callbackProcessorService.register(callback)
    }
}
