package com.ibn.ibnproject.model;

import java.util.Collection;

import javax.persistence.Entity;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.URL;

import jakarta.persistence.OneToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Departmento extends DomainEntity{
    private String name;
    private String area;
    private Empleado headOfDepartment;
    private Collection<Empleado> employees;

    @NotBlank
    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    @NotBlank
    public String getArea() {
        return area;
    }

    public void setArea(final String description) {
        this.area = description;
    }

    public void setHeadOfDepartment(final Empleado headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }

    @NotBlank
    @OneToOne(optional = false)
    public Empleado getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setEmployees(final Collection<Empleado> employees) {
        this.employees = employees;
    }
    
    @OneToMany(mappedBy = "Empleado")
    public Collection<Empleado> getEmployees() {
        return employees;
    }
}
