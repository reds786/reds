package com.ettas.reds.model;

import javax.persistence.*;
import javax.validation.constraints.*;
import java.util.UUID;

@Entity
@Table
public class Car {



    @Id
    /*@SequenceGenerator(
            name = "car_id_sequence",
            sequenceName = "car_id_sequence",
            allocationSize = 1,
            initialValue = 5001
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "car_id_sequence"
    )*/
    private UUID id = UUID.randomUUID();
    @NotBlank(message = "Maker can't be blank")
    @NotEmpty(message = "Maker may not be empty")
    @Size(min = 2, max = 32, message = "Maker must be between 2 and 32 characters long")
    private String make;
    @NotBlank(message = "Model can't be blank")
    @NotEmpty(message = "Model may not be empty")
    @Size(min = 2, max = 32, message = "Model must be between 2 and 32 characters long")
    private String model;

    public Car(UUID id, String make, String model, double price, String email) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.price = price;
        this.email = email;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Car(String make, String model, double price, String email) {
        this.make = make;
        this.model = model;
        this.price = price;
        this.email = email;
    }
    @DecimalMin(value = "1000.0", message = "Please Enter a valid Price Amount(Min > 9999)")
    private double price;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @NotEmpty(message = "{email.notempty}")
    @Email
    private String email;
}
