package org.epsi.web_interface_flowerstore.domain;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Long id;
    private String firstName;
    private String lastName;
    private String address;
    private String email;
    private String birthDate;
    private String userName;
}
