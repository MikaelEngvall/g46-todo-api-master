package se.lexicon.g46todoapi.converter;

import org.springframework.stereotype.Repository;
import se.lexicon.todoapi.domain.dto.TaskDTOView;
import se.lexicon.todoapi.domain.entity.Task;

@Repository
public interface TaskConverter {

    TaskDTOView toTaskDTOView(Task entity);

    Task toTaskEntity(TaskDTOView dtoView);
}
