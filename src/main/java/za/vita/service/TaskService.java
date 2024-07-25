package za.vita.service;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import za.vita.dto.TaskDTO;
import za.vita.entity.Task;
import za.vita.repository.TaskRepository;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public Task create(TaskDTO dto) {
        Task task = Task.builder()
            .name(dto.getName())
            .context(dto.getContext())
            .build();
        return taskRepository.save(task);
    }
}
