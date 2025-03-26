package com.liroa.budget.entity.user;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity(name = "User")
@Table (name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(of = "idUser")
public class User {

    @Id
    @Column(name = "id_user")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String name;
    private String password;
    private String role;


}
