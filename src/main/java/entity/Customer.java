package entity;

import javax.persistence.*;

/**
 * Represents a model of a customer
 *
 * @author Danuta Hering
 */

@Entity
@Table (name = "customers")
public class Customer {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )

    @Column(name = "customer_id")
    private Long customerId;

    @Column
    private String name;

    @Column
    private String phone;

    @Column
    private String email;

    @Column
    private String address;


    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer id:" + customerId +
                ", name ='" + name + '\'' +
                ", phone ='" + phone + '\'' +
                ", email ='" + email + '\'' +
                ", address ='" + address + '\'' +
                "";
    }
}

