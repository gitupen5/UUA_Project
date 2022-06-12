package mongodbproject.Repo;

import mongodbproject.Models.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

//As we are using mongo db so now we have to use mongo repository
public interface StudentRepository extends MongoRepository<Student, Integer> {
}
