package com.bit.x4.model.vo_dto_entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Data
public class MemberJpa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private @Column(name = "uid") int id;
    private @Column(name = "email") String email;
    private String password;
    @CreationTimestamp
    private @Column(name = "cdate")
    Timestamp cdate;
    @UpdateTimestamp
    private @Column(name = "udate") Timestamp udate;
}
