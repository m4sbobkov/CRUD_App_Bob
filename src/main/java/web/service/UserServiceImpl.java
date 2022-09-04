package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.UserDao;
import web.model.User;

import java.util.List;


@Component
public class UserServiceImpl implements UserService {

    private final UserDao dao;

    @Autowired
    public UserServiceImpl(UserDao dao) {
        this.dao = dao;
    }


    @Override
    public List<User> listUsers() {

        return dao.listUsers();
    }

    @Override
    public User userById(Long id) {
        return dao.userById(id);
    }

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public void update(Long id, User upUser) {
        dao.update(id, upUser);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }
}
