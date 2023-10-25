package com.demo.pri.demo.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EnquiryBO {
    private String enquiryId;
    private String relationshipManagerId;
    private String organisation;
    private Boolean isInternal;
    private String type;
    private Date addedOnTimeStamp;
    private Date lastUpdatedTimeStamp;
    private String state;
    private String city;
    private String pin;
    private String accountId;
}