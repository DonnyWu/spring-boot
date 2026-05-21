package donnywu.github.io.springboot;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface SoftwareEngineerRepository
        extends JpaRepository<SoftwareEngineer, Integer>{

    List<SoftwareEngineer> id(Integer id);
}
