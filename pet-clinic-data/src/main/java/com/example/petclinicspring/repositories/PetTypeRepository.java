package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.PetType;
import org.springframework.data.repository.CrudRepository;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:22
 */
public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
