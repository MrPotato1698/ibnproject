package com.ibn.ibnproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ibn.ibnproject.model.Empleado;

public interface EmpleadoRepository extends JpaRepository<Empleado, Integer>{

  @Query("select * from Empleado e")
  public Empleado findAll();

  @Query("select e from Empleado e where e.id = ?1")
  public Empleado findById(int id);

  @Query("select e from Empleado e where e.nombre = ?1")
  public Empleado findByNombre(String nombre);

  @Query("select e from Empleado e where e.apellido = ?1")
  public Empleado findByApellido(String apellido);

  @Query("select e from Empleado e where e.direccion = ?1")
  public Empleado findByDireccion(String direccion);

  @Query("select e from Empleado e where e.departamento = ?1")
  public Empleado findByDepartamento(String departamento);

  @Query("select e from Empleado e where e.fechaNacimiento = ?1")
  public Empleado findByFechaNacimiento(String fechaNacimiento);
  
}
