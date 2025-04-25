package com.ibn.ibnproject.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibn.ibnproject.repositories.DepartamentoRepository;

import model.Departamento;
import repositories.DepartamentoRepository;
//import security.LoginService;
//import security.UserAccount;

@Service
@Transactional
public class DepartamentoService {

  private DepartamentoRepository departamentoRepository;

  public Collection<Departamento> findAll() {
    return departamentoRepository.findAll();
  }

  public Departamento findById(int id) {
    return departamentoRepository.findById(id);
  }

  public Departamento findByName(String name) {
    return departamentoRepository.findByName(name);
  }

  public Departamento findByArea(String area) {
    return departamentoRepository.findByArea(area);
  }

  public Departamento findByHeadOfDepartment(String headOfDepartment) {
    return departamentoRepository.findByHeadOfDepartment(headOfDepartment);
  }

  public Departamento findByEmployees(String employees) {
    return departamentoRepository.findByEmployees(employees);
  }

  public Departamento findByEmployeesAndHeadOfDepartment(String employees, String headOfDepartment) {
    return departamentoRepository.findByEmployeesAndHeadOfDepartment(employees, headOfDepartment);
  }

  public void save(Departamento departamento) {
    departamentoRepository.save(departamento);
  }

  public void delete(Departamento departamento) {
    departamentoRepository.delete(departamento);
  }


  
}
