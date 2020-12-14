package com.example.petclinicspring.repositories;

import com.example.petclinicspring.model.Visit;
import org.springframework.data.repository.CrudRepository;

/**
 * @author I-Chung, Wang
 * @date 2020/12/14 下午 07:24
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}
