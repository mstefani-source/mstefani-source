package za.vita.controllers;

import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import za.vita.dto.TaskDTO;
import za.vita.entity.ZaVitaTask;
import za.vita.service.TaskServise;
import za.vita.service.impl.TaskServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@AllArgsConstructor
public class TaskController {

    private final TaskServiceImpl taskService;


    @PostMapping (value = "/create")
    public ResponseEntity<ZaVitaTask> create(@RequestBody TaskDTO dto){
        return new ResponseEntity<>(taskService.create(dto), HttpStatus.OK);
    }
    
    @GetMapping (value = "/tasks")
    public ResponseEntity<List<ZaVitaTask>> getAllTask () {
        return new ResponseEntity<>(taskService.readAll(),HttpStatus.OK);
    }

    @PutMapping
    public ResponseEntity<ZaVitaTask> update(@RequestBody ZaVitaTask taskToUpdate) {
        return new ResponseEntity<>(taskService.update(taskToUpdate), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public HttpStatus delete(@PathVariable Long id){
        taskService.delete(id);
        return HttpStatus.OK;
    }
    
}
