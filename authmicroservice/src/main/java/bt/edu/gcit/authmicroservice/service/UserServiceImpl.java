package bt.edu.gcit.authmicroservice.service;

import bt.edu.gcit.authmicroservice.dao.UserDAO;
import bt.edu.gcit.authmicroservice.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
}
