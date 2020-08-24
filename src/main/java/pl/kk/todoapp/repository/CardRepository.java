package pl.kk.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kk.todoapp.model.Card;

public interface CardRepository extends CrudRepository<Card, Long> {
}
