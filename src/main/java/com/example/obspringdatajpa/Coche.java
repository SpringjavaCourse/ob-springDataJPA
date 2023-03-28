package com.example.obspringdatajpa;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity // Establece que la clase es una entidad para proceder a trabajar con la BD
public class Coche {

    // atributos
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // se agenda un Id automaticamente
    private Long id;
    private String manufacture;
    private String model;
    private Integer year;


    // contructores

    public Coche() {
    }

    public Coche(Long id, String manufacture, String model, Integer year) {
        this.id = id;
        this.manufacture = manufacture;
        this.model = model;
        this.year = year;
    }


    // getter y setter

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }


    // toString

    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacture='" + manufacture + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }

}
