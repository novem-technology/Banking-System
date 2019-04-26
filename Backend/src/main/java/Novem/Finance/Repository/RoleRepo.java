package Novem.Finance.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import Novem.Finance.Model.Role;
import Novem.Finance.Model.RoleName;

import java.util.Optional;




@Repository
public interface RoleRepo extends CrudRepository<Role, Long> {
    Optional<Role> findByName(RoleName roleName);
}