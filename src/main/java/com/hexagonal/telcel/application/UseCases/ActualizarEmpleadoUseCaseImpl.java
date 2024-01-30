package com.hexagonal.telcel.application.UseCases;

import com.hexagonal.telcel.domain.Models.Empleado;
import com.hexagonal.telcel.domain.Ports.Inputs.ActualizarEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;

import java.util.Optional;

public class ActualizarEmpleadoUseCaseImpl implements ActualizarEmpleadoUseCase {

    private final EmpleadoRepositoryPort empleadoRepositoryPort;

    public ActualizarEmpleadoUseCaseImpl(EmpleadoRepositoryPort empleadoRepositoryPort) {
        this.empleadoRepositoryPort = empleadoRepositoryPort;
    }

    @Override
    public Optional<Empleado> actualizarEmpleado(Long id, Empleado actualizarEmpleado) {
        return empleadoRepositoryPort.update(actualizarEmpleado);
    }
}
