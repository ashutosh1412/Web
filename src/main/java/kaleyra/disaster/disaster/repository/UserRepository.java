package kaleyra.disaster.disaster.repository;



import org.springframework.data.repository.CrudRepository;

import kaleyra.disaster.disaster.DatabaseModel.UserDB;


public interface UserRepository extends CrudRepository<UserDB, Integer> {

} 
