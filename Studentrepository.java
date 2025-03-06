package in.springbootfirstproject.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.springbootfirstproject.entity.Student;
@Repository
public interface Studentrepository extends JpaRepository<Student,Integer>{

}
