package za.vita.repository.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import za.vita.entity.ZaVitaTask;

@Repository
public interface TaskRepository extends JpaRepository<ZaVitaTask, Long>{
    
} 
