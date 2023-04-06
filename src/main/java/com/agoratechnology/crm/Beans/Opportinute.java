package com.agoratechnology.crm.Beans;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Entity
@Data

public class Opportinute implements Serializable {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private Date dateDebutOpportunite;
    private Date dateFinOpportunite;
    private String nomOpportunite;
    private String prioriteOpportunite;
    private String statueOpportunite;
}
