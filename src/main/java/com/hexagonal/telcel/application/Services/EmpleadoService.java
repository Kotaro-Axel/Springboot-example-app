package com.hexagonal.telcel.application.Services;

import com.hexagonal.telcel.domain.Models.Empleado;
import com.hexagonal.telcel.domain.Ports.Inputs.ActualizarEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Inputs.CrearEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Inputs.EliminarEmpleadoUseCase;
import com.hexagonal.telcel.domain.Ports.Inputs.RecuperarEmpleadoUseCase;

import java.util.List;
import java.util.Optional;

public class EmpleadoService implements CrearEmpleadoUseCase, RecuperarEmpleadoUseCase, ActualizarEmpleadoUseCase, EliminarEmpleadoUseCase {

    private final CrearEmpleadoUseCase crearEmpleadoUseCase;
    private final RecuperarEmpleadoUseCase recuperarEmpleadoUseCase;
    private final ActualizarEmpleadoUseCase actualizarEmpleadoUseCase;
    private final EliminarEmpleadoUseCase eliminarEmpleadoUseCase;

    public EmpleadoService(CrearEmpleadoUseCase crearEmpleadoUseCase, RecuperarEmpleadoUseCase recuperarEmpleadoUseCase, ActualizarEmpleadoUseCase actualizarEmpleadoUseCase, EliminarEmpleadoUseCase eliminarEmpleadoUseCase) {
        this.crearEmpleadoUseCase = crearEmpleadoUseCase;
        this.recuperarEmpleadoUseCase = recuperarEmpleadoUseCase;
        this.actualizarEmpleadoUseCase = actualizarEmpleadoUseCase;
        this.eliminarEmpleadoUseCase = eliminarEmpleadoUseCase;
    }

    @Override
    public Optional<Empleado> actualizarEmpleado(Long id, Empleado actualizarEmpleado) {
        return actualizarEmpleadoUseCase.actualizarEmpleado(id, actualizarEmpleado);
    }

    @Override
    public Empleado crearEmpleado(Empleado empleado) {
        return crearEmpleadoUseCase.crearEmpleado(empleado);
    }

    @Override
    public boolean eliminarEmpleado(Long id) {
        return eliminarEmpleadoUseCase.eliminarEmpleado(id);
    }

    @Override
    public Optional<Empleado> obtenerEmpleadoById(Long id) {
        return recuperarEmpleadoUseCase.obtenerEmpleadoById(id);
    }

    @Override
    public List<Empleado> obtenerTodosLosEmpleados() {
        return recuperarEmpleadoUseCase.obtenerTodosLosEmpleados();
    }
}
