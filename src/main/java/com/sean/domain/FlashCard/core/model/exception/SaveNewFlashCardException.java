package com.sean.domain.FlashCard.core.model.exception;

import org.springframework.dao.DataAccessException;

public class SaveNewFlashCardException extends RuntimeException {
    public SaveNewFlashCardException(DataAccessException e) {
        super("Unable to save new Flash Card with exception " + e.getMessage());
    }
}
