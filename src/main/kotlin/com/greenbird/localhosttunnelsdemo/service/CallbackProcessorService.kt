package com.greenbird.localhosttunnelsdemo.service

import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Service

@Service
class CallbackProcessorService {

    private val callbacks = mutableSetOf<String>()

    fun register(callback: String) {
        callbacks.add(callback)
    }

    fun unregister(callback: String) {
        callbacks.remove(callback)
    }

    @Scheduled(fixedDelay = 3000)
    fun invokeCallbacks() {
        val notification = "{\"created\": true}"

        for (callback in callbacks) {
            khttp.post(
                url = callback,
                json = notification
            )
        }
    }
}