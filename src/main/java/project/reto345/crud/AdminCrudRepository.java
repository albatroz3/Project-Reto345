package project.reto345.crud;

import org.springframework.data.repository.CrudRepository;
import project.reto345.model.Admin;

public interface AdminCrudRepository extends CrudRepository<Admin, Integer> {
}
