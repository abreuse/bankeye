package fr.alexis.breuse.bankeye.service

import fr.alexis.breuse.bankeye.aggregate.AccountAggregate
import fr.alexis.breuse.bankeye.command.AddExpenseCommand
import fr.alexis.breuse.bankeye.event.ExpenseAdded
import fr.alexis.breuse.bankeye.repository.ExpenseRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ExpenseHandler(@Autowired val expenseRepository: ExpenseRepository) : IExpenseService {

    override fun getAggregate(): AccountAggregate {
        val accountAggregate = AccountAggregate()
        expenseRepository.findAll().forEach {
            accountAggregate.on(it)
        }

        return accountAggregate
    }

    override fun handle(command: AddExpenseCommand) {
        //Add ExpenseAdded event to ElasticSearch with link to account_id = expense.accountId
        val event = ExpenseAdded(command.accountId, command.amount)
        expenseRepository.save(event)
    }


}