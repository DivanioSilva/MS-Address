package com.ds.ms.article.domain;

import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;

@Data
@Table(name = "countries")
@Entity
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private String iso3;
    private String iso2;
    @Column(name = "numeric_code")
    private int numericCode;
    private String capital;
    private String currency;
    @Column(name = "currency_name")
    private String currencyName;
    @Column(name = "currency_symbol")
    private String currencySymbol;
    private String tld;
    @Column(name = "native")
    private String nativeC;
    private String region;
    @Column(name = "subregion")
    private String subRegion;
    @Column(name = "timezones")
    private String timeZone;
    private BigDecimal latitude;
    private BigDecimal longitude;
    private String emoji;
}
