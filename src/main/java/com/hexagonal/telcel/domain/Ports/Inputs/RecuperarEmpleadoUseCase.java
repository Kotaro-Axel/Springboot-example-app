package com.hexagonal.telcel.domain.Ports.Inputs;

import com.hexagonal.telcel.domain.Models.Empleado;
import java.util.List;
import java.util.Optional;

public interface RecuperarEmpleadoUseCase {

    Optional<Empleado> obtenerEmpleadoById(Long id);
    List<Empleado> obtenerTodosLosEmpleados();
}
