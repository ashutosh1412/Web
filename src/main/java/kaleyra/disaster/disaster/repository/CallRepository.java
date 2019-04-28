package kaleyra.disaster.disaster.repository;

import org.springframework.data.repository.CrudRepository;

import kaleyra.disaster.disaster.DatabaseModel.CallDB;

public interface CallRepository extends CrudRepository<CallDB, Integer> {

}
