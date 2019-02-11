package com.example.sushi.model.api

import com.example.sushi.model.storage.OrderStatus

data class Order(
    val id: Long,
    val products: ArrayList<String> = arrayListOf(),
    var status: OrderStatus,
    val operatorId: Long? = null,
    val clientId: Long,
    var courierId: Long? = null
)