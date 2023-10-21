package com.demo.pri.demo.controller;

import com.demo.pri.demo.entity.CustomerAccount;
import com.demo.pri.demo.service.CrudOpsCustomerAccount;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.demo.pri.demo.entity.CustomerAccountBO;
import com.demo.pri.demo.mapping.ConvertToDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerAccountController {

    @Autowired
    ConvertToDTO ConvertToDTO;

    @Autowired
    CrudOpsCustomerAccount crudOpsCustomerAccount;

    @PostMapping()
    public ResponseEntity<CustomerAccountBO> createCustomerAccount(@RequestBody CustomerAccountBO customerAccountBO) throws JsonProcessingException {
        customerAccountBO = crudOpsCustomerAccount.createCustomerAccount(customerAccountBO);
        return ResponseEntity.ok(customerAccountBO);
    }

    @PutMapping()
    public ResponseEntity<CustomerAccountBO> updateCustomerAccount(@RequestBody CustomerAccountBO customerAccountBO) {
         customerAccountBO = crudOpsCustomerAccount.updateCustomerAccount(customerAccountBO);
        return ResponseEntity.ok(customerAccountBO);
    }

    @DeleteMapping()
    public void deleteCustomerAccount(@RequestBody CustomerAccountBO customerAccountBO) {
        crudOpsCustomerAccount.deleteCustomerAccount(customerAccountBO);
    }
}
