package com.arun.ag_backend.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Admin_assigned_Users {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    private String email;

    private int roll ;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Class aClass;

    @Column(name = "User_Role")
    private String user_role;


}
