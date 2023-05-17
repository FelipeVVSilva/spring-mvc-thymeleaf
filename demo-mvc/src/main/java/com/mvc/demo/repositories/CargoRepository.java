package com.mvc.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mvc.demo.domain.Cargo;

@Repository
public interface CargoRepository extends JpaRepository<Cargo, Long>{

}
