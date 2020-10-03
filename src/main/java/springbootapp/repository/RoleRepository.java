package springbootapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import springbootapp.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {

    //Set<Role> getRolesById(Long id);

    Role getRoleById(Long aLong);
}
