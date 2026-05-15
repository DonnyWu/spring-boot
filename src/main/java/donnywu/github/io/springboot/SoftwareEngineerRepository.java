package donnywu.github.io.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface SoftwareEngineerRepository
        extends JpaRepository<SoftwareEngineer, Integer>{

}
