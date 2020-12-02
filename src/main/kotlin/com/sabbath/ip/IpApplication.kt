package com.sabbath.ip

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import java.net.InetAddress

@SpringBootApplication
@RestController
class IpApplication {
    @GetMapping
    fun getIp() = InetAddress.getLocalHost().hostAddress
}

fun main(args: Array<String>) {
    runApplication<IpApplication>(*args)
}
