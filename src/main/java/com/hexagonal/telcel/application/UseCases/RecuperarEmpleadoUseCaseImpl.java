package com.hexagonal.telcel.application.UseCases;

import com.hexagonal.telcel.domain.Models.Empleado;
import com.hexagonal.telcel.domain.Ports.Inputs.RecuperarEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;

import java.util.List;
import java.util.Optional;

public class RecuperarEmpleadoUseCaseImpl implements RecuperarEmpleadoUseCase {
    private final EmpleadoRepositoryPort empleadoRepositoryPort;


    public RecuperarEmpleadoUseCaseImpl(EmpleadoRepositoryPort empleadoRepositoryPort) {
        this.empleadoRepositoryPort = empleadoRepositoryPort;
    }

    @Override
    public Optional<Empleado> obtenerEmpleadoById(Long id) {
        return empleadoRepositoryPort.findById(id);
    }

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return empleadoRepositoryPort.findAll();
    }
}
