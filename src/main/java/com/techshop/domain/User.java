package com.techshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblCustomer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50,nullable = false)
    private String name;
    @Column(length = 20,nullable = false)
    private String email;
    @Column(length = 20,nullable = false)
    private String password;
    @Column(length = 200)
    private String photo;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date registerDate;
    @Column(nullable = false)
    private short status;

    @OneToMany(mappedBy = "customer",cascade = CascadeType.ALL)
    private Set<Order> orderSet;
}
