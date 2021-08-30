package com.bit.x4.model.vo_dto_entity;

import javax.persistence.*;

@Entity
@NamedQuery(
        name = "Account.findByusername",
        query = "select a from  Account a where a.name = : name"
)
public class Account {
    @Id
    @GeneratedValue
    @Column(name = "accountId")
    private Long id;
    private String name;
    private String password;
    private String email;
}
