package io.github.deutschesschweizermesser.dictionaryservice

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DictionaryServiceApplication

fun main(args: Array<String>) {
    runApplication<DictionaryServiceApplication>(*args)
}
