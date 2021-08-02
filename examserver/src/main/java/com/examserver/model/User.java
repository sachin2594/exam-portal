package com.examserver.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private boolean enabled = true;
    private String profile;
    private String role = "NORMAL";

//    user may have many roles eg admin normal

//    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER,mappedBy = "user")
//    @JsonIgnore
//    private Set<UserRole> userRoles = new HashSet<>();
}
