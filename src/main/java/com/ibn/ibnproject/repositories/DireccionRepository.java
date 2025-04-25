package com.ibn.ibnproject.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import model.Direccion;

public interface DireccionRepository extends JpaRepository<Direccion, Integer>{
  @Query("select * from Direccion d")
  public Direccion findAll();

  @Query("select d from Direccion d where d.id = ?1")
  public Direccion findById(int id);

  @Query("select d from Direccion d where d.pais = ?1")
  public Direccion findByPais(String pais);

  @Query("select d from Direccion d where d.ciudad = ?1")
  public Direccion findByCiudad(String ciudad);

  @Query("select d from Direccion d where d.calle = ?1")
  public Direccion findByCalle(String calle);

  @Query("select d from Direccion d where d.numero = ?1")
  public Direccion findByNumero(String numero);

  @Query("select d from Direccion d where d.codigoPostal = ?1")
  public Direccion findByCodigoPostal(String codigoPostal);

  @Query("select d from Direccion d where d.edificio = ?1")
  public Direccion findByEdificio(String edificio);

  @Query("select d from Direccion d where d.piso = ?1")
  public Direccion findByPiso(String piso);

  @Query("select d from Direccion d where d.letra = ?1")
  public Direccion findByLetra(String letra);

  @Query("select d from Direccion d where d.departamento = ?1")
  public Direccion findByDepartamento(String departamento);

  @Query("select d from Direccion d where d.empleados = ?1")
  public Direccion findByEmpleados(String empleados);

  @Query("select d from Direccion d where d.empleados = ?1 and d.departamento = ?2")
  public Direccion findByEmpleadosAndDepartamento(String empleados, String departamento);

  @Query("select d from Direccion d where d.empleados = ?1 and d.pais = ?2")
  public Direccion findByEmpleadosAndPais(String empleados, String pais);


}
