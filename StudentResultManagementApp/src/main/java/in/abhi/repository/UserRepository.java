package in.abhi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.abhi.entity.User;

public interface UserRepository extends JpaRepository<User,Long>{

	//boolean existsByEmail(String email);
	
	 User findByEmail(String email);

}
