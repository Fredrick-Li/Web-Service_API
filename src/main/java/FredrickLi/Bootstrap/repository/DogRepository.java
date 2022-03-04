package FredrickLi.Bootstrap.repository;

import FredrickLi.Bootstrap.entity.Dog;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface DogRepository extends CrudRepository<Dog, Long> {
    @Query("SELECT d.id, d.breed from Dog d where d.id=:id") // no spacing and table name should start with CAP and all the rest should be lower cases
    String getBreedFromId(Long id);

    @Query("select d.id, d.breed from Dog d")
    List<String> getAllBreed();

    @Query("SELECT d.id, d.name FROM Dog d")
    List<String> getAllName();

}
