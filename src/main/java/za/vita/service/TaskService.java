package za.vita.service;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import za.vita.dto.TaskDTO;
import za.vita.entity.ZaVitaTask;
import za.vita.repository.TaskRepository;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskRepository taskRepository;

    public ZaVitaTask create(TaskDTO dto) {
        ZaVitaTask task = ZaVitaTask.builder()
            .name(dto.getName())
            .context(dto.getContext())
            .build();
        return taskRepository.save(task);
    }

    public List<ZaVitaTask> realAll(){
        return taskRepository.findAll();
    }
}
