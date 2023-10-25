package com.demo.pri.demo.controller;

import com.demo.pri.demo.entity.EnquiryBO;
import com.demo.pri.demo.service.CrudOpsEnquiry;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/enquiry")
@Slf4j
public class EnquiryController {

    @Autowired
    CrudOpsEnquiry crudOpsEnquiry;

    @PostMapping()
    public ResponseEntity<EnquiryBO> createEnquiry(@RequestBody EnquiryBO enquiryBO) throws JsonProcessingException {
        enquiryBO = crudOpsEnquiry.createEnquiry(enquiryBO);
        return ResponseEntity.ok(enquiryBO);
    }

    @PutMapping()
    public ResponseEntity<EnquiryBO> updateEnquiry(@RequestBody EnquiryBO enquiryBO) {
         enquiryBO = crudOpsEnquiry.updateEnquiry(enquiryBO);
        return ResponseEntity.ok(enquiryBO);
    }

    @DeleteMapping("/{id}")
    public void deleteEnquiry(@PathVariable String id) {
        crudOpsEnquiry.deleteEnquiry(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EnquiryBO> getEnquiryDetails(@PathVariable String id) {
        EnquiryBO enquiryBO =  crudOpsEnquiry.getEnquiry(id);
        return ResponseEntity.ok(enquiryBO);
    }
}
