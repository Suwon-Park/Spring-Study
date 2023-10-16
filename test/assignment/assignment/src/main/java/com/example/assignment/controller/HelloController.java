package com.example.assignment.controller;

import com.example.assignment.domain.MemberEntity;
import com.example.assignment.domain.People;
import com.example.assignment.domain.Person;
import com.example.assignment.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@RestController
@Controller
public class HelloController {

    @Autowired
    private MemberService memberService; //왜 final로 선언하면 오류가 날까?

    // 페이지 반환
    @GetMapping("/hello")
    public String hello() {
        return "hello.html";
    }

    // API 방식 - @ResponseBody 문자 반환 (String 반환)
    @GetMapping("/hi")
    @ResponseBody
    public String hi(@RequestParam String name) {

        return "hi " + name;
    }

    // API 방식 - @ResponseBody 객체 반환 (JSON 반환 / GET 방식)
    @GetMapping("/person")
    @ResponseBody
    public Person person(@RequestParam String name, int age) {

//        Person person = new Person();
//        person.setName(name);
//        person.setAge(age);

        return new Person(name, age);
    }

    // API 방식 - @ResponseBody 객체 반환 (JSON 반환 / POST 방식)
    @PostMapping("/people")
    @ResponseBody
    public People people(@RequestBody People people) {
        return people;
    }

    // POST - INSERT
    @PostMapping("/member")
    public void member(@RequestBody MemberEntity member) {

        memberService.join(member);

    }

    //GET - SELECT
//    @GetMapping("/member/{id}")
//    public MemberEntity member2(@PathVariable Long id) {
//        Optional<MemberEntity>  member = memberService.findMember(id);
//
//        if(!member.isPresent()) {
//            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "해당 데이터가 존재하지 않습니다.");
//        }
//
//        return member;
//    }
    //GET - SELECT
    @GetMapping("/member/{id}")
    public MemberEntity member(@PathVariable Long id) {

        return memberService.findMember(id);

    }

    //PATCH - UPDATE
    @PatchMapping("/member/{id}")
    public void memberUpdate(@PathVariable Long id, @RequestBody MemberEntity member) {

        memberService.updateMember(id, member.getName());

    }

    //DELETE
    @DeleteMapping("/member/{id}")
    public void memberDelete(@PathVariable Long id) {

        memberService.deleteMember(id);

    }

}
