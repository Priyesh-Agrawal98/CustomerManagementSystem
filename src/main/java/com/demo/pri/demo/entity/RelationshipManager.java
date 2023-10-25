package com.demo.pri.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;
import javax.persistence.*;
import java.util.Date;

@Entity
@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "RelationshipManager")
public class RelationshipManager {

        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid", strategy = "uuid")
        private String relationshipManagerId;

        @Column(name = "organisation")
        protected String organisation;

        @Column(name = "isInternal")
        protected Boolean isInternal;

        @Column(name = "type")
        protected String type;

        @Column(name = "addedOnTimeStamp")
        protected Date addedOnTimeStamp;

        @Column(name = "lastUpdatedTimeStamp")
        protected Date lastUpdatedTimeStamp;

        @Column(name = "phoneNumber")
        private String phoneNumber;

        @Column(name = "email")
        private String email;

        @Column(name = "pan")
        private String pan;

        @Column(name = "name")
        private String name;

    }
