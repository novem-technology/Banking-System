package Novem.Finance.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import Novem.Finance.Models.BankEmployee;

public interface BankEmployeeRepo extends CrudRepository<BankEmployee,Long> {

    Optional<BankEmployee> findByEmail(String email);

    Optional<BankEmployee> findByUserNameOrEmail(String username, String email);

   // List<BankEmployee> findByIdIn(List<Long> userIds);

    Optional<BankEmployee> findByUserName(String username);

    Boolean existsByUserName(String username);

    Boolean existsByEmail(String email);

	
}
