package repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.howtodoinjava.demo.model.User;

@Repository
public interface UserRepo extends CrudRepository<User, Integer> {
      
	//public List<User> findAllUsers()
}
