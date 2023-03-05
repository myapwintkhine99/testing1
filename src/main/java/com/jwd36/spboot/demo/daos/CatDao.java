package com.jwd36.spboot.demo.daos;

import com.jwd36.spboot.demo.models.Categories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatDao extends JpaRepository<Categories, Integer> {

}
