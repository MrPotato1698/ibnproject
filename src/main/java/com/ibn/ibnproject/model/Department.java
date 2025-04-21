package com.ibn.ibnproject.model;

public class Department {
    private int id;
    private String name;
    private String area;
    private String headOfDepartment;

    public Department(int id, String name, String area, String headOfDepartment) {
        this.id = id;
        this.name = name;
        this.area = area;
        this.headOfDepartment = headOfDepartment;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String description) {
        this.area = description;
    }

    public String getHeadOfDepartment() {
        return headOfDepartment;
    }

    public void setHeadOfDepartment(String headOfDepartment) {
        this.headOfDepartment = headOfDepartment;
    }
}
