package com.hexagonal.telcel.application.UseCases;

import com.hexagonal.telcel.domain.Models.Empleado;
import com.hexagonal.telcel.domain.Ports.Inputs.CrearEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;

public class CrearEmpleadoUseCaseImpl implements CrearEmpleadoUseCase {

    private final EmpleadoRepositoryPort empleadoRepositoryPort;

    public CrearEmpleadoUseCaseImpl(EmpleadoRepositoryPort empleadoRepositoryPort) {
        this.empleadoRepositoryPort = empleadoRepositoryPort;
    }

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return empleadoRepositoryPort.save(empleado);
    }
}
