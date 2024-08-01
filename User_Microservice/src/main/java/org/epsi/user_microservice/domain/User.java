package org.epsi.user_microservice.domain;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Builder
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    @Column(name="firstName")
    private String firstName;

    @Column(name="lastName")
    private String lastName;

    @Column(name="address")
    private String address;

    @Column(name="email", unique = true)
    private String email;

    @Column(name="birthDate")
    private String birthDate;

    @Column(name="userName", unique = true)
    private String userName;

//    @Column(name="password", nullable = false)
//    private String password;

}
