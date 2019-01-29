package fr.alexis.breuse.bankeye.event

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType
import java.util.*

@Document(indexName = "expense")
data class ExpenseAdded(@Field(type = FieldType.Text) val accountId: String = "",
                        @Field(type = FieldType.Long) val amount: Int = 0) {

    @Id val id: String = UUID.randomUUID().toString()


}