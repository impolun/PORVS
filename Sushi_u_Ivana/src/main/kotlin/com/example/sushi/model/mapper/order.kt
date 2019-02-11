package com.example.sushi.model.mapper

import com.example.sushi.model.storage.Order
import com.example.sushi.repository.ClientRepository
import com.example.sushi.repository.OperatorRepository
import com.example.sushi.repository.CourierRepository
import com.example.sushi.model.api.Order as ApiOrder

fun Order.toApi() = ApiOrder(
    id = id,
    status = status,
    products = products,
    operatorId = operator?.id,
    clientId = client.id,
    courierId = courier?.id
)

fun ApiOrder.toDomain(couriers: CourierRepository, clients: ClientRepository, operators: OperatorRepository) = Order(
    id = id,
    status = status,
    products = products,
    operator = operatorId?.let { operators.findById(it).get() },
    client = clientId.let { clients.findById(it).get() },
    courier = courierId?.let { couriers.findById(it).get() }
)