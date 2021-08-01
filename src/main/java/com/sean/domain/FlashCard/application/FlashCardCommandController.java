package com.sean.domain.FlashCard.application;

import com.sean.domain.FlashCard.core.model.AddFlashCardCommand;
import com.sean.domain.FlashCard.core.model.FlashCard;
import com.sean.domain.FlashCard.core.model.GetAllFlashCards;
import com.sean.domain.FlashCard.core.ports.incoming.AddNewFlashCard;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/flashcards")
@RequiredArgsConstructor
public class FlashCardCommandController {

    private final AddNewFlashCard addNewFlashCard;
    private final GetAllFlashCards getAllFlashCards;

    @PostMapping("")
    public ResponseEntity<String> addNewFlashCard(@RequestBody AddFlashCardCommand addFlashCardCommand) {
        Long id = addNewFlashCard.handle(addFlashCardCommand)
                .getAsLong();
        return ResponseEntity.ok("Successfully Created flash card with id " + id);
    }

    @GetMapping("")
    public ResponseEntity<List<FlashCard>> getAllFlashCards() {
        return ResponseEntity.ok(getAllFlashCards.handle());
    }
}
