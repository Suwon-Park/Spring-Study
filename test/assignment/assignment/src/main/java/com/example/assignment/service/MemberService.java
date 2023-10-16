package com.example.assignment.service;

import com.example.assignment.domain.MemberEntity;
import com.example.assignment.repository.MemberRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;

@Service
@AllArgsConstructor
@Transactional
public class MemberService {

    private final MemberRepository memberRepository; //final로 선언하면 에러나는 이유? - variable memberRepository not initialized in the default constructor

    public void join (MemberEntity member){

        memberRepository.save(member);

    }

//    public Optional<MemberEntity> findMember(Long id) {
//
//        return memberRepository.findById(id);
//
//    }
    public MemberEntity findMember(Long id) {
        MemberEntity member = memberRepository.findById(id)
            .orElseThrow(() -> new ResponseStatusException(HttpStatus.NOT_FOUND, "해당 데이터가 존재하지 않습니다."));

        return member;
    }

    public void updateMember(Long id, String name) {

        Optional<MemberEntity> oMember = memberRepository.findById(id);
        MemberEntity member = oMember.get();
        member.setName(name);

    }

    public void deleteMember(Long id) {

        memberRepository.deleteById(id);

    }
}
