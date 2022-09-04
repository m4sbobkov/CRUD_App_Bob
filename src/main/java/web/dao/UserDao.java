package web.dao;

import web.model.User;

import java.util.List;

public interface UserDao {

    List<User> listUsers();

    User userById(Long id);

    void save(User user);

    void update (Long id, User upUser);

    void delete (Long id);

}
