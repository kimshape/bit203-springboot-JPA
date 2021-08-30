package com.bit.x4.model.vo_dto_entity;


import javax.persistence.*;


@Entity
public class Phone2 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seq")
    private int seq;
    @Column(name = "memberId")
    private int memberId;
    @Column(name = "phoneNo")
    private String phoneNo;


    public Phone2() {
        // TODO Auto-generated constructor stub
    }

    public Phone2(String phoneNo) {
        this.phoneNo =phoneNo;
    }

    public int getSeq() {
        return seq;
    }
    public void setSeq(int seq) {
        this.seq = seq;
    }
    public int getMemberId() {
        return memberId;
    }
    public void setMemberId(int memberId) {
        this.memberId = memberId;
    }
    public String getPhoneNo() {
        return phoneNo;
    }
    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }
    @Override
    public String toString() {
        return "Phone [seq=" + seq + ", memberId=" + memberId + ", phoneNo=" + phoneNo + "]";
    }

}