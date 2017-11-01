package com.joaoabrodrigues.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.joaoabrodrigues.model.Account;

public interface AccountRepository extends MongoRepository<Account, String> {

}
