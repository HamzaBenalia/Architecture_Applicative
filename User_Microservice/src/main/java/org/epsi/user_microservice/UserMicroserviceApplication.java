package org.epsi.user_microservice;

import org.epsi.user_microservice.domain.User;
import org.epsi.user_microservice.repositories.UserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserMicroserviceApplication.class, args);

    }

    @Bean
    CommandLineRunner commandLineRunner(UserRepository userRepository){
        return args -> {
        User user = User.builder()
                .firstName("Steven")
                .lastName("Stev")
                .address("34000")
                .email("steven.stev@gmail.com")
                .build();
        userRepository.save(user);

            User user2 = User.builder()
                    .firstName("Hamza")
                    .lastName("Ben")
                    .address("34000")
                    .email("Hamza.ben@gmail.com")
                    .build();
            userRepository.save(user2);


        };

    }

}
