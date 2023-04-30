package com.vasaviClass.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.vasaviClass.DMS.Models.Dog;

/**
 * @author S554779 Vasavi Devineni
 */
public interface DogRepository extends CrudRepository<Dog, Integer> {
	List<Dog> findByName(String name);

}
