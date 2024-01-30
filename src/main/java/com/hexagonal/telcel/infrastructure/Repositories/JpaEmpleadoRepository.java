package com.hexagonal.telcel.infrastructure.Repositories;

import com.hexagonal.telcel.infrastructure.Entities.EmpleadoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaEmpleadoRepository extends JpaRepository<EmpleadoEntity, Long> { }
