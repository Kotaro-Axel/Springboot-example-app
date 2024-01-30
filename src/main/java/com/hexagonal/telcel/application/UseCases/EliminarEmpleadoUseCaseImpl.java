package com.hexagonal.telcel.application.UseCases;

import com.hexagonal.telcel.domain.Ports.Inputs.EliminarEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;

public class EliminarEmpleadoUseCaseImpl implements EliminarEmpleadoUseCase {

    private final EmpleadoRepositoryPort empleadoRepositoryPort;


    public EliminarEmpleadoUseCaseImpl(EmpleadoRepositoryPort empleadoRepositoryPort) {
        this.empleadoRepositoryPort = empleadoRepositoryPort;
    }

    @Override
    public boolean eliminarEmpleado(Long id) {
        return empleadoRepositoryPort.deleteById(id);
    }
}
