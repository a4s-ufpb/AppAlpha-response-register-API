package br.dcx.ufpb.apps4society.appalpharesponseregister.entity;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String word;
    private String theme;
    private String correctLettersSequence;
    @OneToMany(mappedBy = "question")
    private Set<Response> responses;

    public Question() {
    }

    public Question(Long id, String word, String theme, String correctWordSequence) {
        this.id = id;
        this.word = word;
        this.theme = theme;
        this.correctLettersSequence = correctWordSequence;
    }

    public Question(String word, String theme, String correctWordSequence) {
        this.word = word;
        this.theme = theme;
        this.correctLettersSequence = correctWordSequence;
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

    public String getCorrectLettersSequence() {
        return correctLettersSequence;
    }

    public void setCorrectLettersSequence(String correctWordSequence) {
        this.correctLettersSequence = correctWordSequence;
    }

    public Set<Response> getResponses() {
        return responses;
    }

    public void setResponses(Set<Response> responses) {
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
        return "Question [id=" + id + ", word=" + word + ", theme=" + theme + ", correctWordSequence="
                + correctLettersSequence + "]";
    }
}
