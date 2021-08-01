package com.sean.domain.FlashCard.core.ports.incoming;

import com.sean.domain.FlashCard.core.model.FlashCard;

public interface GetFlashCardById {

    public FlashCard handle(Long id);
}
