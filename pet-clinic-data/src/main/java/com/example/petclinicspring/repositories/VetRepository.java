package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Vet;
import org.springframework.data.repository.CrudRepository;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:23
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}
