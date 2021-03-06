package com.ds.ms.article.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Table(name = "states")
@Data
@Entity
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Basic
    @Column(name = "name")
    private String name;
    @Basic
    @Column(name = "country_id")
    private Integer countryId;
    @Basic
    @Column(name = "country_code")
    private String countryCode;
    @Basic
    @Column(name = "country_name")
    private String countryName;
    @Basic
    @Column(name = "state_code")
    private String stateCode;
    @Basic
    @Column(name = "type")
    private String type;
    @Basic
    @Column(name = "latitude")
    private BigDecimal latitude;
    @Basic
    @Column(name = "longitude")
    private BigDecimal longitude;
    @ManyToOne
    @JoinColumn(name = "country_id", insertable = false, updatable = false)
    private Country country;

}
