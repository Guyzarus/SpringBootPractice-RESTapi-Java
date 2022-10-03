package com.gourdetinc.SpringBootPractice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gourdetinc.SpringBootPractice.entities.Card;

@Repository
public interface CardRepository extends JpaRepository<Card, String> {
	
	Optional<Card> findById(String id);

}
