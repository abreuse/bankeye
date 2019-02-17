package fr.alexis.breuse.bankeye.aggregate

import fr.alexis.breuse.bankeye.event.ExpenseAdded
import java.util.*

class AccountAggregate() {
    val id: String = UUID.randomUUID().toString()

    var balance: Int = 0

    var favorite: Boolean = true;

    fun on(event: ExpenseAdded) {
        balance -= event.amount
    }
}