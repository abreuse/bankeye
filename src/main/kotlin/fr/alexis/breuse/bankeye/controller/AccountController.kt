package fr.alexis.breuse.bankeye.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("api/account")
class AccountController {

    @GetMapping("/{id}")
    fun getAccountInfos(@PathVariable("id") id: String) : String {
        return id
    }

    fun test() {}
}