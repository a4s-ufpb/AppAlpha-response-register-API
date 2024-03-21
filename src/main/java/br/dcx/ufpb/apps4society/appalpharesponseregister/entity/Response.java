package br.dcx.ufpb.apps4society.appalpharesponseregister.entity;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "responses")
public class Response {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String typedLetters;
    private LocalDateTime responseDate;
    private boolean correct;
    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Response() {
    }

    public Response(Long id, String typedLetters, LocalDateTime responseDate, boolean correct) {
        this.id = id;
        this.typedLetters = typedLetters;
        this.responseDate = responseDate;
        this.correct = correct;
    }

    public Response(Long id, String typedLetters, LocalDateTime responseDate, boolean correct, User user,
            Question question) {
        this.id = id;
        this.typedLetters = typedLetters;
        this.responseDate = responseDate;
        this.correct = correct;
        this.user = user;
        this.question = question;
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

    public LocalDateTime getResponseDate() {
        return this.responseDate;
    }

    public void setResponseDate(LocalDateTime responseDate) {
        this.responseDate = responseDate;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
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
        Response other = (Response) obj;
        if (id == null) {
            if (other.id != null)
                return false;
        } else if (!id.equals(other.id))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Response [id=" + id + ", typedLetters=" + typedLetters + ", responseDate=" + responseDate + ", correct="
                + correct + ", user=" + user + ", question=" + question + "]";
    }

    public static ResponseBuilder builder() {
        return new ResponseBuilder();
    }

    public static class ResponseBuilder {
        private Long id;
        private String typedLetters;
        private LocalDateTime responseDate;
        private boolean correct;
        private User user;
        private Question question;

        public ResponseBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ResponseBuilder typedLetters(String typedLetters) {
            this.typedLetters = typedLetters;
            return this;
        }

        public ResponseBuilder responseDate(LocalDateTime responseDate) {
            this.responseDate = responseDate;
            return this;
        }

        public ResponseBuilder correct(boolean correct) {
            this.correct = correct;
            return this;
        }

        public ResponseBuilder user(User user) {
            this.user = user;
            return this;
        }

        public ResponseBuilder question(Question question) {
            this.question = question;
            return this;
        }

        public Response build() {
            return new Response(id, typedLetters, responseDate, correct, user, question);
        }
    }
}
