package com.gourdetinc.SpringBootPractice.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gourdetinc.SpringBootPractice.entities.Deck;

@Repository
public interface DeckRepository extends JpaRepository<Deck, Long> {
	
	Optional<Deck> findById(Long id);
}
