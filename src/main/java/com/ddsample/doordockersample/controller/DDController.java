package com.ddsample.doordockersample.controller;

import com.ddsample.doordockersample.model.Doors;
import com.ddsample.doordockersample.service.DoorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;


import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class DDController {

    @Autowired
    DoorsRepository doorsrepository;

    private static List<Doors> doors = new ArrayList<>();

    @CrossOrigin(origins="*")
    @GetMapping("/getAllDoors")
    public List<Doors> getall(){

        doors= doorsrepository.findAll();

        return doors;
    }


    @PostMapping("/addDoor")
    public ResponseEntity addDoor(@RequestParam (value = "name") String name ){
        try {
            doorsrepository.save(new Doors(name));

            return new ResponseEntity(HttpStatus.CREATED);
        }catch(Exception e) {
            return new ResponseEntity(HttpStatus.BAD_REQUEST);
        }
    }

}
