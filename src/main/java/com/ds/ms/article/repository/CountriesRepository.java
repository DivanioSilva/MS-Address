package com.ds.ms.article.repository;

import com.ds.ms.article.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CountriesRepository extends JpaRepository<Country, Long> {
    Optional<Country> findByName(String stateName);
}
