package thkimshop.domain;

import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.*;

@Entity
@Getter @Setter
public class Member {
    @Id @GeneratedValue
    private Long memberId;
    private String name;
    private String phone;
    private String email;

    @Embedded
    private Address address;



}
