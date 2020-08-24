package pl.kk.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kk.todoapp.model.Account;

public interface AccountRepository extends CrudRepository<Account, Long> {
}
