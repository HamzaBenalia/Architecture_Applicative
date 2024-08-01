package org.epsi.web_interface_flowerstore.clients;
import org.epsi.web_interface_flowerstore.domain.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@FeignClient(name = "user-service", url = "${user-service.url}")
public interface UserClient {


    @GetMapping
    List<User> getAllUsers();

    @GetMapping("/{id}")
    User getUserById(@PathVariable("id") Long id);

    @PostMapping
    User createOrUpdateUser(@RequestBody User user);

    @DeleteMapping("/{id}")
    void deleteUser(@PathVariable("id") Long id);
}
