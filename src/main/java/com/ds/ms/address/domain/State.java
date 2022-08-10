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
@Table(name = "states", uniqueConstraints = {
        @UniqueConstraint(name = "uc_state_id", columnNames = {"id"})
})
public class State {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @Type(type = "org.hibernate.type.TextType")
    private String name;

    @Column(name = "country_id")
    private Integer countryId;

    @Column(name = "country_code")
    @Type(type = "org.hibernate.type.TextType")
    private String countryCode;

    @Column(name = "country_name")
    @Type(type = "org.hibernate.type.TextType")
    private String countryName;

    @Column(name = "state_code")
    @Type(type = "org.hibernate.type.TextType")
    private String stateCode;

    @Column(name = "type")
    @Type(type = "org.hibernate.type.TextType")
    private String type;

    @Column(name = "latitude")
    private BigDecimal latitude;

    @Column(name = "longitude")
    private BigDecimal longitude;

    @ManyToOne
    @JoinColumn(name = "country_id", updatable = false, insertable = false)
    private Country country;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        State state = (State) o;
        return id != null && Objects.equals(id, state.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
