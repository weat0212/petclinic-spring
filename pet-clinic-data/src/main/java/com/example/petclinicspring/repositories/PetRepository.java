package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Pet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:21
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}
