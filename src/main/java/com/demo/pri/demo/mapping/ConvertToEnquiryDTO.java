package com.demo.pri.demo.mapping;

import com.demo.pri.demo.entity.Enquiry;
import com.demo.pri.demo.entity.EnquiryBO;
import com.demo.pri.demo.entity.RelationshipManager;
import com.demo.pri.demo.entity.RelationshipManagerBO;
import org.springframework.stereotype.Component;

@Component
public class ConvertToEnquiryDTO {

    public Enquiry convertToEnquiryDTO(EnquiryBO enquiryBO) {

        Enquiry enquiry = Enquiry.builder()
            .enquiryId(enquiryBO.getEnquiryId())
            .relationshipManagerId(enquiryBO.getRelationshipManagerId())
            .organisation(enquiryBO.getOrganisation())
            .state(enquiryBO.getState())
            .city(enquiryBO.getCity())
            .pin(enquiryBO.getPin())
            .accountId(enquiryBO.getAccountId())
            .addedOnTimeStamp(enquiryBO.getAddedOnTimeStamp())
            .lastUpdatedTimeStamp(enquiryBO.getLastUpdatedTimeStamp())
            .isInternal(enquiryBO.getIsInternal())
            .type(enquiryBO.getType())
            .build();

        return  enquiry;
    }

}
