package com.liroa.budget.entity.client;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "Client")
@Table(name = "clients")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idClient")
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_client")
    private Long idClient;
    private String name;
    private String rfc;
    private String address;
    private String phone;


}
