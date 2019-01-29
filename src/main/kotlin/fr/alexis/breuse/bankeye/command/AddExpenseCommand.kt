package fr.alexis.breuse.bankeye.command

import java.lang.IllegalArgumentException

class AddExpenseCommand(val amount: Int, val accountId : String) {

    init {
        if(amount < 0) throw IllegalArgumentException("amount < 0")
        if(amount == 0) throw IllegalArgumentException("amount == 0")
        if(accountId.isEmpty()) throw IllegalArgumentException("accountId vide")
    }
}