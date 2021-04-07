package com.greenbird.localhosttunnelsdemo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.scheduling.annotation.EnableScheduling

@SpringBootApplication
@EnableScheduling
open class LocalhostTunnelsDemoApplication

fun main(args: Array<String>) {
	runApplication<LocalhostTunnelsDemoApplication>(*args)
}
