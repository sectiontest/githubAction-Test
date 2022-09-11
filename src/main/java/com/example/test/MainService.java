package com.example.test;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class MainService {

    private final MemberRepository memberRepository;

    public String MemberName(String name) {
        return String.valueOf(memberRepository.findByName(name));
    }

}
