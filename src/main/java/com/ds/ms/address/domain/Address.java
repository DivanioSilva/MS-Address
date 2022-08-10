package com.ds.ms.address.domain;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Objects;

@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    @Column(name = "street")
    private String street;
    @Column(name = "doorNumber")
    private String doorNumber;
    @Column(name = "zipCode")
    private String zipCode;
    @ManyToOne
    @JoinColumn(name = "city_id", insertable = false, updatable = false)
    private City city;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Address address = (Address) o;
        return id != null && Objects.equals(id, address.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
