package fr.alexis.breuse.bankeye

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class BankeyeApplication

fun main(args: Array<String>) {
	runApplication<BankeyeApplication>(*args)
}

