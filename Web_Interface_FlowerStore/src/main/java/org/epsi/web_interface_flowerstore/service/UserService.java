package org.epsi.web_interface_flowerstore.service;

import org.epsi.web_interface_flowerstore.clients.UserClient;
import org.epsi.web_interface_flowerstore.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {


    @Autowired
    private UserClient userClient;


    public User getUserById(Long id) {
        return userClient.getUserById(id);
    }
}
