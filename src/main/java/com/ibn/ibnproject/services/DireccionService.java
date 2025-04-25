package com.ibn.ibnproject.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibn.ibnproject.repositories.DepartamentoRepository;

import model.Direccion;
import repositories.DireccionRepository;
//import security.LoginService;
//import security.UserAccount;

@Service
@Transactional
public class DireccionService {
  private DireccionRepository direccionRepository;

  public Collection<Direccion> findAll() {
    return direccionRepository.findAll();
  }

  public Direccion findById(int id) {
    return direccionRepository.findById(id);
  }

  public Direccion findByPais(String pais) {
    return direccionRepository.findByPais(pais);
  }

  public Direccion findByCiudad(String ciudad) {
    return direccionRepository.findByCiudad(ciudad);
  }

  public Direccion findByCalle(String calle) {
    return direccionRepository.findByCalle(calle);
  }

  public Direccion findByNumero(String numero) {
    return direccionRepository.findByNumero(numero);
  }

  public Direccion findByCodigoPostal(String codigoPostal) {
    return direccionRepository.findByCodigoPostal(codigoPostal);
  }

  public Direccion findByEdificio(String edificio) {
    return direccionRepository.findByEdificio(edificio);
  }

  public Direccion findByPiso(String piso) {
    return direccionRepository.findByPiso(piso);
  }

  public Direccion findByLetra(String letra) {
    return direccionRepository.findByLetra(letra);
  }

  public Direccion findByDepartamento(String departamento) {
    return direccionRepository.findByDepartamento(departamento);
  }

  public Direccion findByEmpleados(String empleados) {
    return direccionRepository.findByEmpleados(empleados);
  }

  public Direccion findByEmpleadosAndDepartamento(String empleados, String departamento) {
    return direccionRepository.findByEmpleadosAndDepartamento(empleados, departamento);
  }

  public Direccion findByEmpleadosAndPais(String empleados, String pais) {
    return direccionRepository.findByEmpleadosAndPais(empleados, pais);
  }

  public void save(Direccion direccion) {
    direccionRepository.save(direccion);
  }

  public void delete(Direccion direccion) {
    direccionRepository.delete(direccion);
  }
}
