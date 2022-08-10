package com.ds.ms.address.domain;

import lombok.*;
import org.hibernate.Hibernate;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
@Table(name = "cities")
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @Column(name = "state_id")
    private Integer stateId;

    @Column(name = "state_code")
    @Type(type = "org.hibernate.type.TextType")
    private String stateCode;

    @Column(name = "state_name")
    @Type(type = "org.hibernate.type.TextType")
    private String stateName;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_code")
    @Type(type = "org.hibernate.type.TextType")
    private String countryCode;

    @Column(name = "country_name")
    @Type(type = "org.hibernate.type.TextType")
    private String countryName;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @ManyToOne
    @JoinColumn(name = "state_id", insertable = false, updatable = false)
    private State state;

    @Column(name = "wikiDataId")
    @Type(type = "org.hibernate.type.TextType")
    private String wikiDataId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        City city = (City) o;
        return id != null && Objects.equals(id, city.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
