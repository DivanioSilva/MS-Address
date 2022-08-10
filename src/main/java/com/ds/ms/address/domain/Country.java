package com.ds.ms.address.domain;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "countries", uniqueConstraints = {
        @UniqueConstraint(name = "uc_country_id", columnNames = {"id"})
})
public class Country {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @Column(name = "iso3")
    @Type(type = "org.hibernate.type.TextType")
    private String iso3;

    @Column(name = "iso2")
    @Type(type = "org.hibernate.type.TextType")
    private String iso2;

    @Column(name = "numeric_code")
    private Integer numericCode;

    @Column(name = "phone_code")
    @Type(type = "org.hibernate.type.TextType")
    private String phoneCode;

    @Column(name = "capital")
    @Type(type = "org.hibernate.type.TextType")
    private String capital;

    @Column(name = "currency")
    @Type(type = "org.hibernate.type.TextType")
    private String currency;

    @Column(name = "currency_name")
    @Type(type = "org.hibernate.type.TextType")
    private String currencyName;

    @Column(name = "currency_symbol")
    @Type(type = "org.hibernate.type.TextType")
    private String currencySymbol;

    @Column(name = "tld")
    @Type(type = "org.hibernate.type.TextType")
    private String tld;

    @Column(name = "native")
    @Type(type = "org.hibernate.type.TextType")
    private String nativeField;

    @Column(name = "region")
    @Type(type = "org.hibernate.type.TextType")
    private String region;

    @Column(name = "subregion")
    @Type(type = "org.hibernate.type.TextType")
    private String subregion;

    @Column(name = "timezones")
    @Type(type = "org.hibernate.type.TextType")
    private String timezones;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @Column(name = "emoji")
    @Type(type = "org.hibernate.type.TextType")
    private String emoji;

    @OneToMany(mappedBy = "country", orphanRemoval = true)
    @OrderBy("name")
    private List<State> states = new ArrayList<>();

/*
    @Column(name = "\"emojiU\"")
    @Type(type = "org.hibernate.type.TextType")
    private String emojiU;
     */

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Country country = (Country) o;
        return id != null && Objects.equals(id, country.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
