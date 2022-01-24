package hello.hellospring.repository;

import hello.hellospring.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface SpringDataJpaMemberRepository extends JpaRepository<Member, Long>, MemberRepository{

    // JPQL select m from Member m where m.name = ?
    // findByName 은 name이 컬럼명 (하나의 약속)
    // 인터페이스 정의만 잘 해줘도, 자동으로 CRUD 로직을 생성해준다.
    @Override
    Optional<Member> findByName(String name);

}
