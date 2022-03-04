package FredrickLi.Bootstrap.web;

import FredrickLi.Bootstrap.entity.Dog;
import FredrickLi.Bootstrap.service.DogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DogController {
    private DogService dogService;

    @Autowired
    public void setDogService(DogService dogService){
        this.dogService = dogService;
    }

    @GetMapping("/dog")
    public ResponseEntity<List<Dog>> getAllDogs(){
        List<Dog> dogs = dogService.retrieveAllDogs();
        return new ResponseEntity<List<Dog>>(dogs, HttpStatus.OK);
    }

    @GetMapping("/{id}/breed")
    public ResponseEntity<String> getBreedById(@PathVariable Long id){
        String breed = dogService.getBreedFromId(id);
        return new ResponseEntity<String>(breed, HttpStatus.OK);
    }

    @GetMapping("/dog/breed")
    public ResponseEntity<List<String>> getAllBreed(){
        List<String> breeds = dogService.getAllBreed();
        return new ResponseEntity<List<String>>(breeds, HttpStatus.OK);
    }

    @GetMapping("/Dog/name")
    public ResponseEntity<List<String>> getAllName(){
        List<String> names = dogService.getAllName();
        return new ResponseEntity<List<String>>(names, HttpStatus.OK);
    }

}
