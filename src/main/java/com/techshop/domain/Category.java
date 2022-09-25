package com.techshop.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="tblCategory")
public class Categoory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    @Column(length = 50)
    private String name;
    @OneToMany(mappedBy = "categoory",cascade = CascadeType.ALL)//khi del cate thì pro del theo dung cascade.all
    private Set<Product> productSet;
}
