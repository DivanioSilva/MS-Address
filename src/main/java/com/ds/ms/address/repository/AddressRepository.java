package com.ds.ms.address.repository;

import com.ds.ms.address.domain.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
