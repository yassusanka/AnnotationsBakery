package com.zipcodewilmington.bakery.Repositories;

import com.zipcodewilmington.bakery.Models.Baker;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BakerRepository extends CrudRepository<Baker, Long> {


}
