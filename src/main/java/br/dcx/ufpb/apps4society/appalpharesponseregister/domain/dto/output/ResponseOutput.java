package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.output;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info.QuestionInfo;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info.UserInfo;

public class ResponseOutput {
    private Long id;
    private String typedLetters;
    private Long time;
    private boolean correct;
    private UserInfo user;
    private QuestionInfo question;

    public ResponseOutput() {
    }

    public ResponseOutput(Long id, String typedLetters, Long time, boolean correct, UserInfo user, QuestionInfo question) {
        this.id = id;
        this.typedLetters = typedLetters;
        this.time = time;
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

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public QuestionInfo getQuestion() {
        return question;
    }

    public void setQuestion(QuestionInfo question) {
        this.question = question;
    }

    public static ResponseOutputBuilder builder() {
        return new ResponseOutputBuilder();
    }

    public static class ResponseOutputBuilder {
        private Long id;
        private String typedLetters;
        private Long time;
        private boolean correct;
        private UserInfo user;
        private QuestionInfo question;

        public ResponseOutputBuilder id(Long id) {
            this.id = id;
            return this;
        }

        public ResponseOutputBuilder typedLetters(String typedLetters) {
            this.typedLetters = typedLetters;
            return this;
        }

        public ResponseOutputBuilder time(Long time) {
            this.time = time;
            return this;
        }

        public ResponseOutputBuilder correct(boolean correct) {
            this.correct = correct;
            return this;
        }

        public ResponseOutputBuilder user(UserInfo user) {
            this.user = user;
            return this;
        }

        public ResponseOutputBuilder question(QuestionInfo question) {
            this.question = question;
            return this;
        }

        public ResponseOutput build() {
            return new ResponseOutput(id, typedLetters, time, correct, user, question);
        }
    }
}
