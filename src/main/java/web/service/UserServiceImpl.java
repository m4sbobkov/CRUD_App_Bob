package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;
import web.repositories.UsersRepository;

import java.util.List;


@Service
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {

    private final UsersRepository repository;

    @Autowired
    public UserServiceImpl(UsersRepository repository) {
        this.repository = repository;
    }


    @Override
    public List<User> listUsers() {
        return repository.findAll();
    }

    @Override
    public User userById(Long id) {
        return repository.findById(id).get();
    }

    @Override
    @Transactional
    public void save(User user) {
        repository.save(user);
    }

    @Override
    @Transactional
    public void update(Long id, User upUser) {
        upUser.setId(id);
        repository.save(upUser);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }
}
