package com.demo.pri.demo.service;

import com.demo.pri.demo.entity.RelationshipManager;
import com.demo.pri.demo.entity.RelationshipManagerBO;
import com.demo.pri.demo.mapping.ConvertToRelationshipManagerBO;
import com.demo.pri.demo.mapping.ConvertToRelationshipManagerDTO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Slf4j
public class CrudOpsRelationshipManager {

    @Autowired
    ConvertToRelationshipManagerDTO convertToRelationshipManagerDTO;
    @Autowired
    ConvertToRelationshipManagerBO convertToRelationshipManagerBO;
    @Autowired
    RelationshipManagerService relationshipManagerService;

    public RelationshipManagerBO createRelationshipManager(RelationshipManagerBO relationshipManagerBO){
        RelationshipManager relationshipManager = convertToRelationshipManagerDTO.convertToRelationshipManagerDTO(relationshipManagerBO);
        relationshipManager = relationshipManagerService.saveEntity(relationshipManager);
        relationshipManagerBO = convertToRelationshipManagerBO.convertToRelationshipManagerBO(relationshipManager);
        return relationshipManagerBO;
    }
    public RelationshipManagerBO updateRelationshipManager(RelationshipManagerBO relationshipManagerBO){
        RelationshipManager relationshipManager = convertToRelationshipManagerDTO.convertToRelationshipManagerDTO(relationshipManagerBO);
        Optional<RelationshipManager> relationshipManager1 = relationshipManagerService.findByAccountId(relationshipManager.getRelationshipManagerId());
        if(relationshipManager1.isPresent()){
            relationshipManagerService.saveEntity(relationshipManager);
        }
        else{
            return null;
        }
        relationshipManagerBO = convertToRelationshipManagerBO.convertToRelationshipManagerBO(relationshipManager);
        return relationshipManagerBO;
    }

    public void deleteRelationshipManager(String id){
        relationshipManagerService.delete(id);
    }

    public RelationshipManagerBO getRelationshipManager(String accountId){
        return convertToRelationshipManagerBO.convertToRelationshipManagerBO(relationshipManagerService.get(accountId));
    }
}
