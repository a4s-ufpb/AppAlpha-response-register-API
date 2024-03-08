package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity;

import java.util.Collection;

public class Question {
    private Long id;
    private String word;
    private String theme;
    private String correctLetterSequence;
    private Collection<Response> responses;

    public Question() {
    }

    public Question(Long id, String word, String theme, String correctLetterSequence) {
        this.id = id;
        this.word = word;
        this.theme = theme;
        this.correctLetterSequence = correctLetterSequence;
    }

    public Question(String word, String theme, String correctLetterSequence) {
        this.word = word;
        this.theme = theme;
        this.correctLetterSequence = correctLetterSequence;
    }

    public boolean isValid() {
        if (word == null || word.isEmpty()) {
            return false;
        }
        if (theme == null || theme.isEmpty()) {
            return false;
        }
        if (correctLetterSequence == null || correctLetterSequence.isEmpty()) {
            return false;
        }
        return true;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    public String getCorrectLetterSequence() {
        return correctLetterSequence;
    }

    public void setCorrectLetterSequence(String correctLetterSequence) {
        this.correctLetterSequence = correctLetterSequence;
    }

    public Collection<Response> getResponses() {
        return responses;
    }

    public void setResponses(Collection<Response> responses) {
        this.responses = responses;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id == null) ? 0 : id.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Question other = (Question) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Question [id=" + id + ", word=" + word + ", theme=" + theme + ", correctLetterSequence="
                + correctLetterSequence + "]";
    }
}
