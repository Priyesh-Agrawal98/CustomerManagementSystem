package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.Enquiry;
import com.demo.pri.demo.repo.EnquiryRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnquiryService {

    @Autowired
    private EnquiryRepo enquiryRepo;

    public Enquiry saveEntity(Enquiry entity) {
        return enquiryRepo.save(entity);
    }

    public Optional<Enquiry> findByEnquiryId(String id) {
        return enquiryRepo.findById(id);
    }

    public void delete(String id) {
        enquiryRepo.deleteById(id);
    }

    public Enquiry get(String id) {
        return enquiryRepo.getById(id);
    }

    public List<Enquiry> getAllEntities() {
        return enquiryRepo.findAll();
    }
}
