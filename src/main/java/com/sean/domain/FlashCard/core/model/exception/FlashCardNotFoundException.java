package com.sean.domain.FlashCard.core.model.exception;

/*
  Thrown when searching for a FlashCard by Id, but it is not found
 */
public class FlashCardNotFoundException extends RuntimeException {
    public FlashCardNotFoundException(String message) {
        super(message);
    }
}
