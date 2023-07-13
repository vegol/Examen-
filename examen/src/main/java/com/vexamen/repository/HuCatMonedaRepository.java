package com.vexamen.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vexamen.entity.HuCatMoneda;

@Repository
public interface HuCatMonedaRepository extends JpaRepository<HuCatMoneda, String> {

}
