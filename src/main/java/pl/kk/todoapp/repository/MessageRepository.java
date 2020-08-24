package pl.kk.todoapp.repository;

import org.springframework.data.repository.CrudRepository;
import pl.kk.todoapp.model.Message;

public interface MessageRepository extends CrudRepository<Message, Long> {
}
