package id.alian.managementtiket.data.repository

import id.alian.managementtiket.data.remote.TicketApi
import id.alian.managementtiket.data.remote.dto.OrdersDto
import id.alian.managementtiket.domain.repository.OrderRepository
import javax.inject.Inject

class OrderRepositoryImpl @Inject constructor(
    private val api: TicketApi
) : OrderRepository {
    override suspend fun getOrders(): List<OrdersDto> {
        return api.getOrders()
    }
}