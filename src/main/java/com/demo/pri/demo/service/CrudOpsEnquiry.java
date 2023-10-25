package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.Enquiry;
import com.demo.pri.demo.entity.EnquiryBO;
import com.demo.pri.demo.entity.RelationshipManager;
import com.demo.pri.demo.mapping.ConvertToEnquiryBO;
import com.demo.pri.demo.mapping.ConvertToEnquiryDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CrudOpsEnquiry {

    @Autowired
    ConvertToEnquiryDTO convertToEnquiryDTO;
    @Autowired
    ConvertToEnquiryBO convertToEnquiryBO;
    @Autowired
    EnquiryService enquiryService;

    public EnquiryBO createEnquiry(EnquiryBO enquiryBO){
        Enquiry enquiry = convertToEnquiryDTO.convertToEnquiryDTO(enquiryBO);
        enquiry = enquiryService.saveEntity(enquiry);
        enquiryBO = convertToEnquiryBO.convertToEnquiryBO(enquiry);
        return enquiryBO;
    }
    public EnquiryBO updateEnquiry(EnquiryBO enquiryBO){
        Enquiry enquiry = convertToEnquiryDTO.convertToEnquiryDTO(enquiryBO);
        Optional<Enquiry> enquiry1 = enquiryService.findByEnquiryId(enquiry.getEnquiryId());
        if(enquiry1.isPresent()){
            enquiryService.saveEntity(enquiry);
        }
        else{
            return null;
        }
        enquiryBO = convertToEnquiryBO.convertToEnquiryBO(enquiry);
        return enquiryBO;
    }

    public void deleteEnquiry(String id){
        enquiryService.delete(id);
    }

    public EnquiryBO getEnquiry(String accountId){
        return convertToEnquiryBO.convertToEnquiryBO(enquiryService.get(accountId));
    }
}
