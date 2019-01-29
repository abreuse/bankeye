package fr.alexis.breuse.bankeye.service

import fr.alexis.breuse.bankeye.aggregate.AccountAggregate
import fr.alexis.breuse.bankeye.command.AddExpenseCommand

interface IExpenseService {
    fun handle(command: AddExpenseCommand)

    fun getAggregate(): AccountAggregate
}