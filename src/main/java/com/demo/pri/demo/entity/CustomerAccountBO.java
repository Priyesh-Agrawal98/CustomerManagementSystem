package com.demo.pri.demo.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CustomerAccountBO {
    private String accountId;
    private String accountState;
    private Boolean isInternal;
    private String accountTier;
    private Date addedOnTimeStamp;
    private Date lastUpdatedTimeStamp;
    private String accountHolderPhoneNumber;
    private String accountHolderEmail;
    private String accountHolderPAN;
    private String accountHolderName;
    
}
