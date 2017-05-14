package com.preslavrachev.bidmeister

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class BidmeisterApplication

fun main(args: Array<String>) {

    SpringApplication.run(BidmeisterApplication::class.java, *args)
}
