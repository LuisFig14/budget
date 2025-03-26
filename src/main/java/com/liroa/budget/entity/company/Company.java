package com.liroa.budget.entity.company;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Company")
@Table(name = "companies")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idCompany")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long idCompany;
    @Column(name = "name_company")
    private String nameCompany;
    private String address;
    private String phone;
    private String mail;



}
