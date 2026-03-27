package bt.edu.gcit.authmicroservice.service;

import bt.edu.gcit.authmicroservice.entity.User;
import java.util.List;

public interface UserService {
    User save(User user);

    List<User> saveAll(List<User> users);

    List<User> findAll();

    User findById(Long id);

    User update(Long id, User user);

    void deleteById(Long id);
}
