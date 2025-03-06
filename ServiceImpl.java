package in.springbootfirstproject.serviceImpl; 
import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import in.springbootfirstproject.entity.Student; 
import in.springbootfirstproject.service.StudentService; 
@Service 
public class ServiceImpl implements StudentService
{ @Autowired 
in.springbootfirstproject.repository.Studentrepository 
Studentrepository;
@Override public List<Student> getAllStudents() 
{ 
	List<Student> list=Studentrepository.findAll(); 
return list; 
} 
@Override 
public Student saveStudent(Student student) { 
	return Studentrepository.save(student); 
	} 
@Override 
public Student getById(int id) { 
	return Studentrepository.findById(id).get(); }
@Override 
public void deleteById(int id) 
{ 
	Studentrepository.deleteById(id); 
	} 
}