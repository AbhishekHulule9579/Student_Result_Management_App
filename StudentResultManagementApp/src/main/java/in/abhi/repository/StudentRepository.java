package in.abhi.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.entity.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

	Optional<Student> findByRollNumber(String roll);

	List<Student> findByNameContainingIgnoreCaseOrRollNumberContainingIgnoreCase(String keyword, String roll);

	
	
}
