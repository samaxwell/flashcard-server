package com.sean.domain.FlashCard.core.ports.incoming;

import com.sean.domain.FlashCard.core.model.AddFlashCardCommand;
import com.sean.domain.FlashCard.core.model.FlashCardIdentifier;

public interface AddNewFlashCard {
    FlashCardIdentifier handle(AddFlashCardCommand addFlashCardCommand);
}
