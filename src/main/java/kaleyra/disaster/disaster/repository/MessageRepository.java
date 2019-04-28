package kaleyra.disaster.disaster.repository;

import org.springframework.data.repository.CrudRepository;

import kaleyra.disaster.disaster.DatabaseModel.MessageDB;

public interface MessageRepository extends CrudRepository<MessageDB, Integer>{

}
