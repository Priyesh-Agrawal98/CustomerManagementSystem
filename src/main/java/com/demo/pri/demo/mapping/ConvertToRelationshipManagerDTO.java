package com.demo.pri.demo.mapping;

import com.demo.pri.demo.entity.RelationshipManager;
import com.demo.pri.demo.entity.RelationshipManagerBO;
import org.springframework.stereotype.Component;

@Component
public class ConvertToRelationshipManagerDTO {

    public RelationshipManager convertToRelationshipManagerDTO(RelationshipManagerBO relationshipManagerBO) {

        RelationshipManager relationshipManager = RelationshipManager.builder()
            .relationshipManagerId(relationshipManagerBO.getRelationshipManagerId())
            .organisation(relationshipManagerBO.getOrganisation())
            .email(relationshipManagerBO.getEmail())
            .name(relationshipManagerBO.getName())
            .pan(relationshipManagerBO.getPan())
            .phoneNumber(relationshipManagerBO.getPhoneNumber())
            .addedOnTimeStamp(relationshipManagerBO.getAddedOnTimeStamp())
            .lastUpdatedTimeStamp(relationshipManagerBO.getLastUpdatedTimeStamp())
            .isInternal(relationshipManagerBO.getIsInternal())
            .type(relationshipManagerBO.getType())
            .build();

        return  relationshipManager;
    }

}
