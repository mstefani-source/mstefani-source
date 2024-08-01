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
import org.springframework.web.bind.annotation.GetMapping;



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
    
}
