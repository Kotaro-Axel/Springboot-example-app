package com.hexagonal.telcel.domain.Ports.Inputs;

import com.hexagonal.telcel.domain.Models.Empleado;
import java.util.Optional;
public interface ActualizarEmpleadoUseCase {

    Optional<Empleado> actualizarEmpleado(Long id, Empleado actualizarEmpleado);

}
