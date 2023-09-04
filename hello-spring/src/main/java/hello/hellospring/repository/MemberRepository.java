package hello.hellospring.repository;

import hello.hellospring.domain.Member;

import java.util.List;
import java.util.Optional;

public interface MemberRepository {
    Member save(Member member);
    Optional<Member> findById(Long id); //Optional 요즘 null 값을 처리하는 방법 감싸서 처리한다.
    Optional<Member> findByName(String name);
    List<Member> findAll();


}
