package com.sean.domain.FlashCard.core.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table
public class FlashCard {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Enumerated(EnumType.STRING)
//    private Category category;
    @Column
    private String frontText;
    @Column
    private String backText;

    public FlashCard(AddFlashCardCommand addFlashCardCommand) {
//        this.category = addFlashCardCommand.getCategory();
        this.frontText = addFlashCardCommand.getFrontText();
        this.backText = addFlashCardCommand.getBackText();
    }

    public Long getIdentifierAsLong() {
        return this.id;
    }

}
