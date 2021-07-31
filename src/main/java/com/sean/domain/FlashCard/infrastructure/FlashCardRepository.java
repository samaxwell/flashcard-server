package com.sean.domain.FlashCard.infrastructure;

import com.sean.domain.FlashCard.core.model.FlashCard;
import org.springframework.data.repository.CrudRepository;

public interface FlashCardRepository extends CrudRepository<FlashCard, Long> {
    
}
