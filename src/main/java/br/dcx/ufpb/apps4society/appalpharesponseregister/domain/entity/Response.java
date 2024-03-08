package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity;

public class Response {
    private Long id;
    private String typedLetters;
    private Long time;
    private boolean correct;
    private User user;
    private Question question;

    public Response() {
    }

    public Response(String typedLetters, Long time, boolean correct, User user, Question question) {
        this.typedLetters = typedLetters;
        this.time = time;
        this.correct = correct;
        this.user = user;
        this.question = question;
    }

    public boolean isValid() {
        if (typedLetters == null || typedLetters.isEmpty()) {
            return false;
        }
        if (time == null) {
            return false;
        }
        if (user == null) {
            return false;
        }
        if (question == null) {
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

    public String getTypedLetters() {
        return typedLetters;
    }

    public void setTypedLetters(String typedLetters) {
        this.typedLetters = typedLetters;
    }

    public Long getTime() {
        return time;
    }

    public void setTime(Long time) {
        this.time = time;
    }

    public boolean isCorrect() {
        return correct;
    }

    public void setCorrect(boolean correct) {
        this.correct = correct;
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
        return "Response [id=" + id + ", typedLetters=" + typedLetters + ", time=" + time + ", correct=" + correct
                + ", user=" + user + ", question=" + question + "]";
    }
}
