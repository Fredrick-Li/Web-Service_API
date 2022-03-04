package FredrickLi.Bootstrap.service;

import FredrickLi.Bootstrap.entity.Dog;

import java.util.List;

public interface DogService {
    List<Dog> retrieveAllDogs();
    String getBreedFromId(Long id);
    List<String> getAllBreed();
    List<String> getAllName();
}
