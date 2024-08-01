package za.vita.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import za.vita.dto.TaskDTO;
import za.vita.entity.ZaVitaTask;
import za.vita.repository.interfaces.TaskRepository;
import za.vita.service.TaskServise;

@Service
@AllArgsConstructor
public class TaskServiceImpl implements TaskServise {
    
    private final TaskRepository taskRepository;


    public ZaVitaTask create(TaskDTO dto) {
        ZaVitaTask task = ZaVitaTask.builder() 
            .name(dto.getName())
            .context(dto.getContext())
            .build();
        return taskRepository.save(task);
    }

    public List<ZaVitaTask> readAll(){
        return taskRepository.findAll();
    }

    public ZaVitaTask update(ZaVitaTask task){
        return taskRepository.save(task);
    }

    public void delete(Long id){
        taskRepository.deleteById(id);
    }

}
