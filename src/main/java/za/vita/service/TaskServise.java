package za.vita.service;

import java.util.List;

import za.vita.dto.TaskDTO;
import za.vita.entity.ZaVitaTask;

public interface TaskServise {
    ZaVitaTask create(TaskDTO dto);
    
    List<ZaVitaTask> readAll();

    ZaVitaTask update(ZaVitaTask task);

    void delete(Long id);
}
