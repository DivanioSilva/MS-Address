package com.ds.ms.article.repository;

import com.ds.ms.article.domain.State;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StatesRepository extends JpaRepository<State, Long> {
    Optional<State> findByName(String stateName);
}
