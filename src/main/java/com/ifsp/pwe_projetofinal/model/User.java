package com.ifsp.pwe_projetofinal.model;

import lombok.*;
import javax.persistence.*;

@Data  @NoArgsConstructor  @AllArgsConstructor
@Entity(name = "Usuario")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true)
    private String username;
    private String password;
    @JoinColumn
    @OneToOne
    private UsersData usersData;
    private String token;
}
