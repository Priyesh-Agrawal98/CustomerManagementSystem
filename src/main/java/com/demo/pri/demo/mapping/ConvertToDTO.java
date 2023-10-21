package com.demo.pri.demo.mapping;

import com.demo.pri.demo.entity.CustomerAccountBO;
import com.demo.pri.demo.entity.CustomerAccount;
import org.springframework.stereotype.Component;

@Component
public class ConvertToDTO {

    public CustomerAccount convertToDTO(CustomerAccountBO customerAccountBO) {

    CustomerAccount customerAccount = CustomerAccount.builder()
            .accountId(customerAccountBO.getAccountId())
            .accountTier(customerAccountBO.getAccountTier())
            .accountHolderEmail(customerAccountBO.getAccountHolderEmail())
            .accountState(customerAccountBO.getAccountState())
            .accountHolderName(customerAccountBO.getAccountHolderName())
            .accountHolderPAN(customerAccountBO.getAccountHolderPAN())
            .accountHolderPhoneNumber(customerAccountBO.getAccountHolderPhoneNumber())
            .addedOnTimeStamp(customerAccountBO.getAddedOnTimeStamp())
            .lastUpdatedTimeStamp(customerAccountBO.getLastUpdatedTimeStamp())
            .isInternal(customerAccountBO.getIsInternal())
            .build();

        return  customerAccount;
    }

}
