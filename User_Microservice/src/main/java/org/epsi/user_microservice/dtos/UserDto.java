package org.epsi.user_microservice.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {

    private String nom;

    private String prenom;

    private String adresse;

    private String mail;

    private String genre;

    private String dateDeNaissance;
}
