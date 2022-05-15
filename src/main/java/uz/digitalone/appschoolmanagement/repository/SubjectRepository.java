package uz.digitalone.appschoolmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.digitalone.appschoolmanagement.entity.Address;
import uz.digitalone.appschoolmanagement.entity.Subject;


@Repository
public interface SubjectRepository extends JpaRepository<Subject, Long> {
}
