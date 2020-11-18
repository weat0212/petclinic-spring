package com.example.petclinicspring.service;

import com.example.petclinicspring.model.Vet;

import java.util.Set;

/**
 * @author weat0212@gmail.com
 * @project petclinic-spring
 * @package com.example.petclinicspring.service
 * @date 2020/11/18 下午 03:47
 */
public interface VetService {
    Vet findById(Long id);
    Vet save(Vet vet);
    Set<Vet> findAll();
}
