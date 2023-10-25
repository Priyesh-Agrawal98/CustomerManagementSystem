package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.RelationshipManager;
import com.demo.pri.demo.repo.RelationshipManagerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RelationshipManagerService {

    @Autowired
    private RelationshipManagerRepo relationshipManagerRepo;

    public RelationshipManager saveEntity(RelationshipManager entity) {
        return relationshipManagerRepo.save(entity);
    }

    public Optional<RelationshipManager> findByAccountId(String id) {
        return relationshipManagerRepo.findById(id);
    }

    public void delete(String id) {
        relationshipManagerRepo.deleteById(id);
    }

    public RelationshipManager get(String id) {
        return relationshipManagerRepo.getById(id);
    }

    public List<RelationshipManager> getAllEntities() {
        return relationshipManagerRepo.findAll();
    }
}
