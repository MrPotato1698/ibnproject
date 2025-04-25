package com.ibn.ibnproject.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibn.ibnproject.repositories.DepartamentoRepository;

import model.Empleado;
import repositories.EmpleadoRepository;
//import security.LoginService;
//import security.UserAccount;

@Service
@Transactional
public interface EmpleadoService {
  private EmpleadoRepository empleadoRepository;

  public Collection<Empleado> findAll() {
    return empleadoRepository.findAll();
  }
  public Empleado findById(int id) {
    return empleadoRepository.findById(id);
  }

  public Empleado findByNombre(String nombre) {
    return empleadoRepository.findByNombre(nombre);
  }

  public Empleado findByApellido(String apellido) {
    return empleadoRepository.findByApellido(apellido);
  }

  public Empleado findByDireccion(String direccion) {
    return empleadoRepository.findByDireccion(direccion);
  }

  public Empleado findByDepartamento(String departamento) {
    return empleadoRepository.findByDepartamento(departamento);
  }

  public Empleado findByFechaNacimiento(String fechaNacimiento) {
    return empleadoRepository.findByFechaNacimiento(fechaNacimiento);
  }

  public void save(Empleado empleado) {
    empleadoRepository.save(empleado);
  }

  public void delete(Empleado empleado) {
    empleadoRepository.delete(empleado);
  }

}
