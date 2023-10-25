package com.demo.pri.demo.mapping;


import com.demo.pri.demo.entity.RelationshipManagerBO;
import com.demo.pri.demo.entity.RelationshipManager;
import org.springframework.stereotype.Component;
@Component
public class ConvertToRelationshipManagerBO {
    public RelationshipManagerBO convertToRelationshipManagerBO(RelationshipManager relationshipManager) {

        return RelationshipManagerBO.builder()
                .relationshipManagerId(relationshipManager.getRelationshipManagerId())
                .type(relationshipManager.getType())
                .email(relationshipManager.getEmail())
                .name(relationshipManager.getName())
                .pan(relationshipManager.getPan())
                .phoneNumber(relationshipManager.getPhoneNumber())
                .isInternal(relationshipManager.getIsInternal())
                .lastUpdatedTimeStamp(relationshipManager.getLastUpdatedTimeStamp())
                .organisation(relationshipManager.getOrganisation())
                .addedOnTimeStamp(relationshipManager.getAddedOnTimeStamp())
                .build();
    }
}