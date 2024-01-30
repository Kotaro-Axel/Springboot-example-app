package com.hexagonal.telcel.infrastructure.config;

import com.hexagonal.telcel.application.Services.EmpleadoService;
import com.hexagonal.telcel.application.UseCases.ActualizarEmpleadoUseCaseImpl;
import com.hexagonal.telcel.application.UseCases.CrearEmpleadoUseCaseImpl;
import com.hexagonal.telcel.application.UseCases.EliminarEmpleadoUseCaseImpl;
import com.hexagonal.telcel.application.UseCases.RecuperarEmpleadoUseCaseImpl;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;
import com.hexagonal.telcel.domain.Ports.Outputs.ExternalServicePort;
import com.hexagonal.telcel.infrastructure.Adapters.ExternalServiceAdapter;
import com.hexagonal.telcel.infrastructure.Repositories.JpaEmpleadoRepositoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfig {

    @Bean
    public EmpleadoService empleadoService(EmpleadoRepositoryPort empleadoRepositoryPort){
        return new EmpleadoService(
                new CrearEmpleadoUseCaseImpl(empleadoRepositoryPort),
                new RecuperarEmpleadoUseCaseImpl(empleadoRepositoryPort),
                new ActualizarEmpleadoUseCaseImpl(empleadoRepositoryPort),
                new EliminarEmpleadoUseCaseImpl(empleadoRepositoryPort)
        );
    }

    @Bean
    public EmpleadoRepositoryPort empleadoRepositoryPort(JpaEmpleadoRepositoryAdapter jpaEmpleadoRepositoryAdapter){
        return jpaEmpleadoRepositoryAdapter;
    }

    @Bean
    public ExternalServicePort externalServicePort(){
        return new ExternalServiceAdapter();
    }
}
