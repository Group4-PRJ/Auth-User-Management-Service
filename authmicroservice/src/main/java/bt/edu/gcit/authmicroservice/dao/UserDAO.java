package bt.edu.gcit.authmicroservice.dao;

import bt.edu.gcit.authmicroservice.entity.User;
import java.util.List;

public interface UserDAO {
    User save(User user);

    List<User> findAll();

    User findById(Long id);

    void deleteById(Long id);
}
