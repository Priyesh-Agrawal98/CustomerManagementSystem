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
@Table(name = "Enquiry")
public class Enquiry {

        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid", strategy = "uuid")
        private String enquiryId;

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

        @Column(name = "state")
        private String state;

        @Column(name = "city")
        private String city;

        @Column(name = "pin")
        private String pin;

        @Column(name = "relationshipManagerId")
        private String relationshipManagerId;

        @Column(name = "accountId")
        private String accountId;

    }
