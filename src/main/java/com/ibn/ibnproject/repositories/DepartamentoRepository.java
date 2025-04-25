package com.ibn.ibnproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import model.Departamento;

public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{
  
  @Query("select * from Departamento d")
  public Departamento findAll();

  @Query("select d from Departamento d where d.id = ?1")
  public Departamento findById(int id);

  @Query("select d from Departamento d where d.name = ?1")
  public Departamento findByName(String name);

  @Query("select d from Departamento d where d.area = ?1")
  public Departamento findByArea(String area);

  @Query("select d from Departamento d where d.headOfDepartment = ?1")
  public Departamento findByHeadOfDepartment(String headOfDepartment);

  @Query("select d from Departamento d where d.employees = ?1")
  public Departamento findByEmployees(String employees);

  @Query("select d from Departamento d where d.employees = ?1 and d.headOfDepartment = ?2")
  public Departamento findByEmployeesAndHeadOfDepartment(String employees, String headOfDepartment);

}
