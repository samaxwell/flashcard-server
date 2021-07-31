package com.sean.domain.FlashCard.core.ports.outgoing;

import com.sean.domain.FlashCard.core.model.FlashCard;
import com.sean.domain.FlashCard.core.model.FlashCardIdentifier;

public interface FlashCardDatabase {

    FlashCardIdentifier save(FlashCard flashCard);
}
