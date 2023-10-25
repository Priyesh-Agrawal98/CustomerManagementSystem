package com.demo.pri.demo.mapping;

import com.demo.pri.demo.entity.CustomerAccount;
import com.demo.pri.demo.entity.CustomerAccountBO;
import org.springframework.stereotype.Component;

@Component
public class ConvertToBO {

    public CustomerAccountBO convertToBO(CustomerAccount customerAccount) {

        return CustomerAccountBO.builder()
                .accountId(customerAccount.getAccountId())
                .accountTier(customerAccount.getAccountTier())
                .accountHolderEmail(customerAccount.getAccountHolderEmail())
                .accountHolderName(customerAccount.getAccountHolderName())
                .accountState(customerAccount.getAccountState())
                .accountHolderPAN(customerAccount.getAccountHolderPAN())
                .isInternal(customerAccount.getIsInternal())
                .lastUpdatedTimeStamp(customerAccount.getLastUpdatedTimeStamp())
                .accountHolderPhoneNumber(customerAccount.getAccountHolderPhoneNumber())
                .addedOnTimeStamp(customerAccount.getAddedOnTimeStamp())
                .build();
    }
}