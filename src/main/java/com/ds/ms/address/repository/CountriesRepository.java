package com.ds.ms.address.repository;

import com.ds.ms.address.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountriesRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByName(String stateName);
}
