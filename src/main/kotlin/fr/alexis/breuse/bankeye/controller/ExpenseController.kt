package fr.alexis.breuse.bankeye.controller

import fr.alexis.breuse.bankeye.aggregate.AccountAggregate
import fr.alexis.breuse.bankeye.command.AddExpenseCommand
import fr.alexis.breuse.bankeye.service.ExpenseHandler
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("api/expense")
class ExpenseController(@Autowired val expenseHandler: ExpenseHandler) {

    @PostMapping
    fun handle(@RequestBody command: AddExpenseCommand) {
        expenseHandler.handle(command)
    }

    @GetMapping
    fun getAggregate(): AccountAggregate {
        return expenseHandler.getAggregate()
    }
}