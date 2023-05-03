package english.todo.repository;

import english.todo.entity.ListEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ListRepo extends CrudRepository<ListEntity, Long> {
    Optional<ListEntity> getListEntityById(Long id);
}
