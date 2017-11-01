package com.joaoabrodrigues.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joaoabrodrigues.model.OperationType;

public interface OperationTypeRepository extends MongoRepository<OperationType, String> {

}
