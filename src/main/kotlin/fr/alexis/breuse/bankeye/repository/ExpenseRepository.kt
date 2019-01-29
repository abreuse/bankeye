package fr.alexis.breuse.bankeye.repository

import fr.alexis.breuse.bankeye.event.ExpenseAdded
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository
import org.springframework.stereotype.Repository

@Repository
interface ExpenseRepository : ElasticsearchRepository<ExpenseAdded, String> {
}