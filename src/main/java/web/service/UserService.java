package web.service;

import web.model.User;

import java.util.List;

public interface UserService {

    List<User> listUsers();

    User userById(Long id);

    void save(User user);

    void delete (Long id);

}
