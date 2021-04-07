package com.greenbird.localhosttunnelsdemo.controller

import com.greenbird.localhosttunnelsdemo.service.CallbackProcessorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("")
class CallbackRegistrationController @Autowired constructor(val callbackProcessorService: CallbackProcessorService) {

    @PostMapping("/register")
    fun register(@RequestParam("callback") callback: String) {
        callbackProcessorService.register(callback)
    }

    @DeleteMapping("/unregister")
    fun unregister(@RequestParam("callback") callback: String) {
        callbackProcessorService.unregister(callback)
    }
}
