package com.ddsample.doordockersample.service;

import com.ddsample.doordockersample.model.Doors;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

import java.util.List;

public interface DoorsRepository extends CrudRepository<Doors, Long>{

    List<Doors> findAll();

   Doors save(Doors doors);
}
