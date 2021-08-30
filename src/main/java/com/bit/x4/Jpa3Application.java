//package com.bit.x4;
//
//import com.bit.x4.model.dao.MemberRepository;
//import com.bit.x4.model.dao.PhoneRepository;
//import com.bit.x4.model.vo_dto_entity.Member;
//import com.bit.x4.model.vo_dto_entity.Phone;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.List;
//
//@SpringBootApplication
//public class Jpa3Application implements CommandLineRunner {
//    @Autowired
//    private MemberRepository mr;
//    @Autowired
//    private PhoneRepository pr;
//
//    public static void main(String[] args) {
//        SpringApplication.run(Jpa3Application.class, args);
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        Member first = new Member("Jung"); // (1)
//        first.addPhone(new Phone("010-XXXX-XXXX"));
//        first.addPhone(new Phone("010-YYYY-YYYY"));
//        Member second = new Member("Dong");
//        second.addPhone(new Phone("010-ZZZZ-ZZZZ"));
//        Member third = new Member("Min"); // (2)
//        mr.save(first); // (3)
//        mr.save(second);
//        mr.save(third); // (4)
//        List<Member> list = mr.findAll(); // (5)
//        for (Member m : list) {
//            System.out.println(m.toString());
//        } // (6)
//        mr.deleteAll(); // (7)
//    }
//}