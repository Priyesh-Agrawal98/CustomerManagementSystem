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
        log.info("Inside update method in crudOps");
        CustomerAccount customerAccount = convertToDTO.convertToDTO(customerAccountBO);
        log.info("customerAccount : {} ",customerAccount);
        Optional<CustomerAccount> customerAccount1 = customerAccountService.findByAccountId(customerAccount.getAccountId());
        log.info("customerAccount1 exists : {} ", customerAccount1.isPresent());
        if(customerAccount1.isPresent()){
            log.info("inside if");
            customerAccountService.saveEntity(customerAccount);
        }
        else{
            log.info("inside else");
            return null;
        }
        customerAccountBO = convertToBO.convertToBO(customerAccount);
        return customerAccountBO;
    }

    public void deleteCustomerAccount(CustomerAccountBO customerAccountBO){
        CustomerAccount customerAccount = convertToDTO.convertToDTO(customerAccountBO);
        customerAccountService.delete(customerAccount);
    }
}
