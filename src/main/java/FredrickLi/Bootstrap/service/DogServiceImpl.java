package FredrickLi.Bootstrap.service;

import FredrickLi.Bootstrap.entity.Dog;
import FredrickLi.Bootstrap.repository.DogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DogServiceImpl implements DogService{

    @Autowired
    DogRepository dogRepository;

    public List<Dog> retrieveAllDogs() {
        return (List<Dog>) dogRepository.findAll();
    }

    public String getBreedFromId(Long id){
        Optional<String> optional = Optional.ofNullable(dogRepository.getBreedFromId(id));
        String breed = optional.orElseThrow(DogNotFoundException::new);
        return breed;
    }

    public List<String> getAllBreed(){
        return (List<String>) dogRepository.getAllBreed();
    }

    public List<String> getAllName(){
        return (List<String>) dogRepository.getAllName();
    }
}
