package com.bit.x4.model.vo_dto_entity;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.*;


@Entity
public class Member2 {
    @Id
    @Column(name="memberId")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int memberId;


    @Column(name="name")
    private String name;

    @OneToMany(fetch=FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinColumn(name ="memberId" )
    private Collection<Phone2> phone2s = new ArrayList<Phone2>();

    public int getMemberId() {
        return memberId;
    }


    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Collection<Phone2> getPhones() {
        return phone2s;
    }


    public void setPhones(Collection<Phone2> phone2s) {
        this.phone2s = phone2s;
    }


    public void addPhone(Phone2 phone2) {
        phone2s.add(phone2);
    }


    @Override
    public String toString() {
        return "Member [memberId=" + memberId + ", name=" + name + "]";
    }

}