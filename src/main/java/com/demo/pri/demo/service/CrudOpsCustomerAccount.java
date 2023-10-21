package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.CustomerAccount;
import com.demo.pri.demo.entity.CustomerAccountBO;
import com.demo.pri.demo.mapping.ConvertToBO;
import com.demo.pri.demo.mapping.ConvertToDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CrudOpsCustomerAccount {

    @Autowired
    ConvertToDTO convertToDTO;
    @Autowired
    ConvertToBO convertToBO;
    @Autowired
    CustomerAccountService customerAccountService;

    public CustomerAccountBO createCustomerAccount(CustomerAccountBO customerAccountBO){
        CustomerAccount customerAccount = convertToDTO.convertToDTO(customerAccountBO);
        customerAccount = customerAccountService.saveEntity(customerAccount);
        customerAccountBO = convertToBO.convertToBO(customerAccount);
        return customerAccountBO;
    }
    public CustomerAccountBO updateCustomerAccount(CustomerAccountBO customerAccountBO){
        CustomerAccount customerAccount = convertToDTO.convertToDTO(customerAccountBO);
        Optional<CustomerAccount> customerAccount1 = customerAccountService.findByAccountId(customerAccount.getAccountId());
        if(customerAccount1.isPresent()){
            customerAccountService.saveEntity(customerAccount);
        }
        else{
            return null;
        }
        customerAccountBO = convertToBO.convertToBO(customerAccount);
        return customerAccountBO;
    }

    public void deleteCustomerAccount(String accountId){
        customerAccountService.delete(accountId);
    }

    public CustomerAccountBO getCustomerAccount(String accountId){
        return convertToBO.convertToBO(customerAccountService.get(accountId));
    }
}
