package id.alian.managementtiket.domain.model

import id.alian.managementtiket.data.remote.dto.TicketDto
import id.alian.managementtiket.data.remote.dto.UserDto

data class Order(
    val id: Int,
    val user_id: Int,
    val ticket_id: Int,
    val ticket_count: Int,
    val price: Int,
    val status: String,
    val users: UserDto,
    val ticket: TicketDto
)