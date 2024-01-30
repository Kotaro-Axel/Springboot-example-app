package com.hexagonal.telcel.infrastructure.Controllers;


import com.hexagonal.telcel.application.Services.EmpleadoService;
import com.hexagonal.telcel.domain.Models.Empleado;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/business/empleados")
public class EmpleadoController {

    private final EmpleadoService empleadoService;

    public EmpleadoController(EmpleadoService empleadoService) {
        this.empleadoService = empleadoService;
    }

    @PostMapping
    public ResponseEntity<Empleado> crearEmpleado(@RequestBody Empleado empleado){
        Empleado nuevoEmpleado = empleadoService.crearEmpleado(empleado);
        return new ResponseEntity<>(nuevoEmpleado, HttpStatus.CREATED);
    }

    @GetMapping("/{empleadoId}")
    public ResponseEntity<Empleado> obtenerEmpleadoById (@PathVariable Long empleadoId){
        return empleadoService.obtenerEmpleadoById(empleadoId)
                .map(empleado -> new ResponseEntity<>(empleado, HttpStatus.OK))
                        .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public ResponseEntity<List<Empleado>> obtenerTodosLosEmpleados(){
        List<Empleado> empleados = empleadoService.obtenerTodosLosEmpleados();
        return new ResponseEntity<>(empleados, HttpStatus.OK);
    }

    @PutMapping("/{empleadoId}")
    public ResponseEntity<Empleado> actualizarEmpleadoById(@PathVariable Long empleadoId,
                                                       @RequestBody Empleado actualizarEmpleado){
        return empleadoService.actualizarEmpleado(empleadoId, actualizarEmpleado)
                .map(empleado -> new ResponseEntity<>(empleado, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/{empleadoId}")
    public ResponseEntity<Void> eliminarEmpleadoById (@PathVariable Long empleadoId){
        if (empleadoService.eliminarEmpleado(empleadoId)){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    /*
    @GetMapping("/{empleadoId}/additionalModelInfo")
    public ResponseEntity<AdditionalModelInfo> obtenerDetallesdeModelo(@PathVariable Long empleadoId){
        AdditionalModelInfo additionalModelInfo = empleadoService.obtenerInformacionAdicional(empleadoId);
        return new ResponseEntity<>(additionalModelInfo, HttpStatus.OK);
    }
    */
}
