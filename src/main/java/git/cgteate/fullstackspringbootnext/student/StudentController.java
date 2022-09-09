package git.cgteate.fullstackspringbootnext.student;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/v1/students")
public class StudentController {
    
    @GetMapping
    public List<Student> getAllStudents(){
        List<Student> students = Arrays.asList(
            new Student(
                1L, 
                "Calvin", 
                "calvin.teater@washburn.edu",
                Gender.MALE),
            new Student(
                2L, 
                "Je'Shon", 
                "jeshon.edwards@washburn.edu",
                Gender.MALE)
        );
        return students;
    }

}
