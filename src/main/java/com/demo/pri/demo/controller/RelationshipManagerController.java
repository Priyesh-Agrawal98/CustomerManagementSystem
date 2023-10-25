package com.demo.pri.demo.controller;

import com.demo.pri.demo.entity.RelationshipManagerBO;
import com.demo.pri.demo.service.CrudOpsRelationshipManager;
import com.fasterxml.jackson.core.JsonProcessingException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/relationshipManager")
@Slf4j
public class RelationshipManagerController {

    @Autowired
    CrudOpsRelationshipManager crudOpsRelationshipManager;

    @PostMapping()
    public ResponseEntity<RelationshipManagerBO> createRelationshipManager(@RequestBody RelationshipManagerBO relationshipManagerBO) throws JsonProcessingException {
        relationshipManagerBO = crudOpsRelationshipManager.createRelationshipManager(relationshipManagerBO);
        return ResponseEntity.ok(relationshipManagerBO);
    }

    @PutMapping()
    public ResponseEntity<RelationshipManagerBO> updateRelationshipManager(@RequestBody RelationshipManagerBO relationshipManagerBO) {
         relationshipManagerBO = crudOpsRelationshipManager.updateRelationshipManager(relationshipManagerBO);
        return ResponseEntity.ok(relationshipManagerBO);
    }

    @DeleteMapping("/{id}")
    public void deleteRelationshipManager(@PathVariable String id) {
        crudOpsRelationshipManager.deleteRelationshipManager(id);
    }

    @GetMapping("/{id}")
    public ResponseEntity<RelationshipManagerBO> getRelationshipManager(@PathVariable String id) {
        RelationshipManagerBO relationshipManagerBO =  crudOpsRelationshipManager.getRelationshipManager(id);
        return ResponseEntity.ok(relationshipManagerBO);
    }
}
