package com.hexagonal.telcel.infrastructure.Repositories;

import com.hexagonal.telcel.domain.Models.Empleado;
import com.hexagonal.telcel.domain.Ports.Outputs.EmpleadoRepositoryPort;
import com.hexagonal.telcel.infrastructure.Entities.EmpleadoEntity;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class JpaEmpleadoRepositoryAdapter implements EmpleadoRepositoryPort {

    //CRUD Empleado
    private final JpaEmpleadoRepository jpaEmpleadoRepository;

    public JpaEmpleadoRepositoryAdapter(JpaEmpleadoRepository jpaEmpleadoRepository) {
        this.jpaEmpleadoRepository = jpaEmpleadoRepository;
    }

    @Override
    public Empleado save(Empleado empleado) {
        EmpleadoEntity empleadoEntity = EmpleadoEntity.fromDomainModel(empleado);
        EmpleadoEntity savedEmpleadoEntity = jpaEmpleadoRepository.save(empleadoEntity);
        return savedEmpleadoEntity.toDomainModel();
    }

    @Override
    public Optional<Empleado> findById(Long id) {
        return jpaEmpleadoRepository.findById(id).map(EmpleadoEntity::toDomainModel);
    }

    @Override
    public List<Empleado> findAll() {
        return jpaEmpleadoRepository.findAll().stream()
                .map(EmpleadoEntity::toDomainModel)
                .collect(Collectors.toList());
    }

    @Override
    public Optional<Empleado> update(Empleado empleado) {

        if (jpaEmpleadoRepository.existsById(empleado.getId())){
            EmpleadoEntity empleadoEntity = EmpleadoEntity.fromDomainModel(empleado);
            EmpleadoEntity updateEmpleadoEntity = jpaEmpleadoRepository.save(empleadoEntity);
            return Optional.of(updateEmpleadoEntity.toDomainModel());
        }
        return Optional.empty();
    }

    @Override
    public boolean deleteById(Long id) {
        if (jpaEmpleadoRepository.existsById(id)){
            jpaEmpleadoRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
