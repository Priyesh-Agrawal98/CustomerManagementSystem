package com.demo.pri.demo.entity;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class RelationshipManagerBO {

    private String relationshipManagerId;
    private String organisation;
    private Boolean isInternal;
    private String type;
    private Date addedOnTimeStamp;
    private Date lastUpdatedTimeStamp;
    private String phoneNumber;
    private String email;
    private String pan;
    private String name;
}