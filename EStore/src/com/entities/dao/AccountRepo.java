package com.entities.dao;

import org.springframework.data.repository.CrudRepository;

import com.entities.Account;

public interface AccountRepo extends CrudRepository<Account, Long>{

}
