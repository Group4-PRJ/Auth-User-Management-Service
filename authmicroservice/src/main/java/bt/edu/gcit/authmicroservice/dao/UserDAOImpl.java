package bt.edu.gcit.authmicroservice.dao;

import bt.edu.gcit.authmicroservice.entity.User;
import org.springframework.stereotype.Repository;
import jakarta.persistence.EntityManager;

@Repository
public class UserDAOImpl implements UserDAO {
    private EntityManager entityManager;

    public UserDAOImpl(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public User save(User user) {
        return entityManager.merge(user);
    }
}
