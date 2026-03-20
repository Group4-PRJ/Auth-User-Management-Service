
package bt.edu.gcit.authmicroservice.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import bt.edu.gcit.authmicroservice.dao.RoleDAO;
import bt.edu.gcit.authmicroservice.entity.Role;

@Service
public class RoleServiceImpl implements RoleService {
    private RoleDAO roleDAO;

    public RoleServiceImpl(RoleDAO roleDAO) {
        this.roleDAO = roleDAO;
    }

    @Transactional
    @Override
    public void addRole(Role role) {
        // TODO Auto-generated method stub
        roleDAO.addRole(role);
    }
}
