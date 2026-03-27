package bt.edu.gcit.authmicroservice.service;

import bt.edu.gcit.authmicroservice.dao.UserDAO;
import bt.edu.gcit.authmicroservice.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserDAO userDAO;

    public UserServiceImpl(UserDAO userDAO) {
        this.userDAO = userDAO;
    }

    @Override
    @Transactional
    public User save(User user) {
        return userDAO.save(user);
    }

    @Override
    @Transactional
    public List<User> saveAll(List<User> users) {
        return users.stream().map(userDAO::save).toList();
    }

    @Override
    public List<User> findAll() {
        return userDAO.findAll();
    }

    @Override
    public User findById(Long id) {
        return userDAO.findById(id);
    }

    @Override
    @Transactional
    public User update(Long id, User user) {
        User existing = userDAO.findById(id);
        if (existing == null) {
            return null;
        }
        existing.setEmail(user.getEmail());
        existing.setFullName(user.getFullName());
        existing.setPassword(user.getPassword());
        existing.setPhoneNumber(user.getPhoneNumber());
        existing.setRoles(user.getRoles());
        return userDAO.save(existing);
    }

    @Override
    @Transactional
    public void deleteById(Long id) {
        userDAO.deleteById(id);
    }
}
