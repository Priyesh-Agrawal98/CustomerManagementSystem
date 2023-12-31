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
@Table(name = "CustomerAccount")
public class CustomerAccount {

        @Id
        @GeneratedValue(generator = "system-uuid")
        @GenericGenerator(name = "system-uuid", strategy = "uuid")
        private String accountId;

        @Column(name = "accountState")
        protected String accountState;

        @Column(name = "isInternal")
        protected Boolean isInternal;

        @Column(name = "accountTier")
        protected String accountTier;

        @Column(name = "addedOnTimeStamp")
        protected Date addedOnTimeStamp;

        @Column(name = "lastUpdatedTimeStamp")
        protected Date lastUpdatedTimeStamp;

        @Column(name = "accountHolderPhoneNumber")
        private String accountHolderPhoneNumber;

        @Column(name = "accountHolderEmail")
        private String accountHolderEmail;

        @Column(name = "accountHolderPAN")
        private String accountHolderPAN;

        @Column(name = "accountHolderName")
        private String accountHolderName;

    }
