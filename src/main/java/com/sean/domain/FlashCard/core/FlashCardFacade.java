package com.sean.domain.FlashCard.core;

import com.sean.domain.FlashCard.core.model.AddFlashCardCommand;
import com.sean.domain.FlashCard.core.model.FlashCard;
import com.sean.domain.FlashCard.core.model.FlashCardIdentifier;
import com.sean.domain.FlashCard.core.model.GetAllFlashCards;
import com.sean.domain.FlashCard.core.ports.incoming.AddNewFlashCard;
import com.sean.domain.FlashCard.core.ports.outgoing.FlashCardDatabase;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FlashCardFacade implements AddNewFlashCard, GetAllFlashCards {

    private final FlashCardDatabase flashCardDatabase;

    @Override
    public FlashCardIdentifier handle(AddFlashCardCommand addFlashCardCommand) {
        // build the flashcard appropriately
        FlashCard flashCard = new FlashCard(addFlashCardCommand);

        return flashCardDatabase.save(flashCard);
    }

    @Override
    public List<FlashCard> handle() {
        return flashCardDatabase.getAllFlashCards();
    }
}
