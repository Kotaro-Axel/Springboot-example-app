package com.hexagonal.telcel.domain.Ports.Outputs;

import com.hexagonal.telcel.domain.Models.Empleado;

import java.util.List;
import java.util.Optional;

public interface EmpleadoRepositoryPort {

    Empleado save(Empleado empleado);

    Optional<Empleado> findById(Long id);

    List<Empleado> findAll();

    Optional<Empleado>update(Empleado empleado);

    boolean deleteById(Long id);
}
