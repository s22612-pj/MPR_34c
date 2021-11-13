package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SandwichRepository extends JpaRepository<Sandwich, Integer> {

    @Modifying
    @Query("update  Sandwich  s set s.name = :name where s.id = :id")
    void modifyMe(String name, Integer id);

}
