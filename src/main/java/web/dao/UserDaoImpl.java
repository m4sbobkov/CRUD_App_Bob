package web.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import web.model.User;

import java.util.List;

//@Component
public class UserDaoImpl implements UserDao {

//    private final SessionFactory sessionFactory;
//
//    public UserDaoImpl(SessionFactory sessionFactory) {
//        this.sessionFactory = sessionFactory;
//    }
//
//
//    @Override
//    @Transactional(readOnly = true)
//    public List<User> listUsers() {
//
//        Session session = sessionFactory.getCurrentSession();
//
//        return session.createQuery("from User", User.class).getResultList();
//    }
//
//    @Override
//    @Transactional(readOnly = true)
//    public User userById(Long id) {
//        Session session = sessionFactory.getCurrentSession();
//        return session.get(User.class, id);
//    }
//
//    @Override
//    @Transactional
//    public void save(User user) {
//        Session session = sessionFactory.getCurrentSession();
//        session.save(user);
//    }
//
//    @Override
//    @Transactional
//    public void update(Long id, User upUser) {
//        Session session = sessionFactory.getCurrentSession();
//
//        User exUser = session.get(User.class, id);
//
//        exUser.setName(upUser.getName());
//        exUser.setAge(upUser.getAge());
//        exUser.setEmail(upUser.getEmail());
//    }
//
//    @Override
//    @Transactional
//    public void delete(Long id) {
//        Session session = sessionFactory.getCurrentSession();
//        session.remove(session.get(User.class, id));
//
//    }


}