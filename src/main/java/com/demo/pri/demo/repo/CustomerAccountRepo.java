package com.demo.pri.demo.repo;

import com.demo.pri.demo.entity.CustomerAccount;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CustomerAccountRepo extends JpaRepository<CustomerAccount, String> {
    public Optional<CustomerAccount> findByAccountId(String accountId);

}
