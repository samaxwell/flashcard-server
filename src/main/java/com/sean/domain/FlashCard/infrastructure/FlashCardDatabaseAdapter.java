package com.sean.domain.FlashCard.infrastructure;

import com.sean.domain.FlashCard.core.model.FlashCard;
import com.sean.domain.FlashCard.core.model.FlashCardIdentifier;
import com.sean.domain.FlashCard.core.model.exception.SaveNewFlashCardException;
import com.sean.domain.FlashCard.core.ports.outgoing.FlashCardDatabase;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class FlashCardDatabaseAdapter implements FlashCardDatabase {

    private final FlashCardRepository flashCardRepository;

    @Override
    public FlashCardIdentifier save(FlashCard flashCard) {
        try {
            FlashCard savedFlashCard = flashCardRepository.save(flashCard);
            return new FlashCardIdentifier((savedFlashCard.getIdentifierAsLong()));
        } catch (DataAccessException e) {
            throw new SaveNewFlashCardException(e);
        }
    }

    @Override
    public List<FlashCard> getAllFlashCards() {
        try {
            return flashCardRepository.findAll();
        }
        catch (DataAccessException e) {
            throw new RuntimeException("Something bad happened: " + e.getMessage());
        }
    }

}
