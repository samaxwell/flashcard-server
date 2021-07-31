package com.sean.domain.FlashCard.application;

import com.sean.domain.FlashCard.core.model.AddFlashCardCommand;
import com.sean.domain.FlashCard.core.ports.incoming.AddNewFlashCard;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/flashcards")
@RequiredArgsConstructor
public class FlashCardCommandController {

    private final AddNewFlashCard addNewFlashCard;

    @PostMapping("")
    public ResponseEntity<String> addNewFlashCard(@RequestBody AddFlashCardCommand addFlashCardCommand) {
        Long id = addNewFlashCard.handle(addFlashCardCommand)
                .getAsLong();
        return ResponseEntity.ok("Successfully Created flash card with id " + id);
    }

}
