package donnywu.github.io.springboot;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class SoftwareEngineerService {

    private final SoftwareEngineerRepository softwareEngineerRepository;

    public SoftwareEngineerService (SoftwareEngineerRepository softwareEngineerRepository)
    {
        this.softwareEngineerRepository = softwareEngineerRepository;
    }

    public List<SoftwareEngineer> getAllSoftwareEngineers()
    {
        return softwareEngineerRepository.findAll();
    }

    public SoftwareEngineer getAllSoftwareEngineerById(Integer id) {
        return softwareEngineerRepository.findById(id).orElseThrow(() -> new IllegalStateException(id + " not found"));
    }

    public void insertSoftwareEngineer(SoftwareEngineer softwareEngineer) {
        softwareEngineerRepository.save(softwareEngineer);
    }
}
