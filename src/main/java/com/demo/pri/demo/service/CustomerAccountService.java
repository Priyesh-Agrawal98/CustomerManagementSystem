package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.CustomerAccount;
import com.demo.pri.demo.repo.CustomerAccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerAccountService {

    @Autowired
    private CustomerAccountRepo customerAccountRepo;

    public CustomerAccount saveEntity(CustomerAccount entity) {
        return customerAccountRepo.save(entity);
    }

    public Optional<CustomerAccount> findByAccountId(String id) {
        return customerAccountRepo.findByAccountId(id);
    }

    public void delete(String accountId) {
        customerAccountRepo.deleteById(accountId);
    }

    public CustomerAccount get(String accountId) {
        return customerAccountRepo.getById(accountId);
    }

    public List<CustomerAccount> getAllEntities() {
        return customerAccountRepo.findAll();
    }
}
