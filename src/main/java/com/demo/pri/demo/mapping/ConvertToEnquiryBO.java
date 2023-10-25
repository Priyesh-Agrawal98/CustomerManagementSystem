package com.demo.pri.demo.mapping;


import com.demo.pri.demo.entity.Enquiry;
import com.demo.pri.demo.entity.EnquiryBO;
import org.springframework.stereotype.Component;

@Component
public class ConvertToEnquiryBO {
    public EnquiryBO convertToEnquiryBO(Enquiry enquiry) {

        return EnquiryBO.builder()
                .enquiryId(enquiry.getEnquiryId())
                .relationshipManagerId(enquiry.getRelationshipManagerId())
                .type(enquiry.getType())
                .state(enquiry.getState())
                .city(enquiry.getCity())
                .pin(enquiry.getPin())
                .accountId(enquiry.getAccountId())
                .isInternal(enquiry.getIsInternal())
                .lastUpdatedTimeStamp(enquiry.getLastUpdatedTimeStamp())
                .organisation(enquiry.getOrganisation())
                .addedOnTimeStamp(enquiry.getAddedOnTimeStamp())
                .build();
    }
}