package za.vita.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.vita.entity.Task;

@Repository
public interface TaskRepository extends JpaRepository<Task, Long>{

    
} 
