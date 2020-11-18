package com.example.petclinicspring.service;

import com.example.petclinicspring.model.Pet;

import java.util.Set;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.service
 * @date 2020/11/18 下午 03:46
 */
public interface PetService {
    Pet findById(Long id);
    Pet save(Pet pet);
    Set<Pet> findAll();
}
