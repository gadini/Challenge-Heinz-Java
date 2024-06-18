package com.github.gadini.challenge_heinz.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.gadini.challenge_heinz.model.Consumo;

@Repository
public interface ConsumoRepository extends JpaRepository<Consumo, Long>{

}
