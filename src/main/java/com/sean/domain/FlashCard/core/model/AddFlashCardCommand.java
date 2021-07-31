package com.sean.domain.FlashCard.core.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AddFlashCardCommand {

    private Category category;
    private String frontText;
    private String backText;
}
