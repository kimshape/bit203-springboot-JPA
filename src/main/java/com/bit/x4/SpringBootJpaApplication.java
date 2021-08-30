package com.bit.x4;


import com.bit.x4.model.dao.MemberRepository;
import com.bit.x4.model.dao.PhoneRepository;
import com.bit.x4.model.vo_dto_entity.Member2;
import com.bit.x4.model.vo_dto_entity.Phone2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJpaApplication implements CommandLineRunner {

    @Autowired
    private MemberRepository memberRepository;

    @Autowired
    private PhoneRepository phoneRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootJpaApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Member2 member2 = new Member2();
        member2.setName("Jung"); // (1)
        member2.addPhone(new Phone2("010-XXXX-XXXX"));
        member2.addPhone(new Phone2("010-YYYY-YYYY"));

//        Member second = new Member("Dong");
//        second.addPhone(new Phone("010-ZZZZ-ZZZZ"));

//        Member third = new Member("Min"); // (2)

        memberRepository.save(member2); // (3)
//        memberRepository.save(second);
//        memberRepository.save(third); // (4)

//        List<Member> list = mr.findAll(); // (5)
//
//        for( Member m : list ){
//            System.out.println(m.toString());
//        } // (6)
//
//        mr.deleteAll(); // (7)
    }
}

