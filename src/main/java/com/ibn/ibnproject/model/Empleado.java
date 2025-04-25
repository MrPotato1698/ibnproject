package com.ibn.ibnproject.model;

@Entity
public class Empleado extends DomainEntity {
	
	String dni;
	String nombre;
	String apellidos;
	String fechaNacimiento;
	Direccion direccion;
	Departamento departamento;
	
	@NotBlank
	@Column(unique = true)
	public String getDni() { return this.dni; }
	public void setDni(String dni) { this.dni = dni; }
	
	@NotBlank
	public String getNombre() { return this.nombre; }
	public void setNombre(String nombre) { this.nombre = nombre; }
	
	@NotBlank
	public String getApellidos() { return this.apellidos; }
	public void setApellidos(String apellidos) { this.apellidos = apellidos; }
	
	@NotBlank
	public String getFechaNacimiento() { return this.fechaNacimiento; }
	public void setFechaNacimiento(String fechaNacimiento) { this.fechaNacimiento = fechaNacimiento; }
	
    @OneToOne(optional = true)
	public Direccion getDireccion() { return this.direccion; }
	public void setDireccion(Direccion direccion) {this.direccion = direccion; }

	@ManyToOne(optional = false)
	public Direccion getDireccion() { return this.direccion; }
	public void setDireccion(Direccion direccion) {this.direccion = direccion; }
}
