package br.dcx.ufpb.apps4society.appalpharesponseregister.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonProperty.Access;

public class ResponseDTO {
    @JsonProperty(access = Access.READ_ONLY)
    private Long id;
    private String typedLetters;
    private boolean correct;

    public ResponseDTO() {
    }

    public ResponseDTO(String typedLetters, boolean correct) {
        this.typedLetters = typedLetters;
        this.correct = correct;
    }
    
    public ResponseDTO(Long id, String typedLetters, boolean correct) {
        this.id = id;
        this.typedLetters = typedLetters;
        this.correct = correct;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTypedLetters() {
        return typedLetters;
    }

    public void setTypedLetters(String typedLetters) {
        this.typedLetters = typedLetters;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
    }

}
