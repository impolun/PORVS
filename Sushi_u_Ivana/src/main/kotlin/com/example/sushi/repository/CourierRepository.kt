package com.example.sushi.repository

import com.example.sushi.model.storage.Courier
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface CourierRepository : CrudRepository<Courier, Long>