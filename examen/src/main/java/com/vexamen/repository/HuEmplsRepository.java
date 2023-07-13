package com.vexamen.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.vexamen.entity.HuEmpls;

@Repository
public interface HuEmplsRepository extends JpaRepository<HuEmpls, Integer> {

	@Query("SELECT e FROM HuEmpls e WHERE e.cia = :cia")
	List<HuEmpls> buscarPorCia(@Param("cia") int cia);

	@Query("SELECT e FROM HuEmpls e WHERE e.empleado = :empleado")
	Optional<HuEmpls> buscarPorEmpl(@Param("empleado") int empleado);

	@Query("SELECT e FROM HuEmpls e WHERE e.cia = :cia AND e.empleado = :empleado")
	List<HuEmpls> buscarPorCiaEmpl(@Param("cia") int cia, @Param("empleado") int empleado);

}