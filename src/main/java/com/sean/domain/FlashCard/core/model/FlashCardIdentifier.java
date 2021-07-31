package com.sean.domain.FlashCard.core.model;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class FlashCardIdentifier {

    private final Long id;

    public Long getAsLong() {
        return id;
    }
}
