package com.example.sushi.repository

import com.example.sushi.model.storage.Operator
import org.springframework.data.repository.CrudRepository
import org.springframework.stereotype.Repository

@Repository
interface OperatorRepository : CrudRepository<Operator, Long>