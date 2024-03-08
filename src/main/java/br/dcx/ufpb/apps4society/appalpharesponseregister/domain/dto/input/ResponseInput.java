package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.input;

public class ResponseInput {
    private String typedLetters;
    private Long time;
    private boolean correct;
    private Long userId;
    private Long questionId;

    public ResponseInput() {
    }

    public ResponseInput(String typedLetters, Long time, boolean correct, Long userId, Long questionId) {
        this.typedLetters = typedLetters;
        this.time = time;
        this.correct = correct;
        this.userId = userId;
        this.questionId = questionId;
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

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    
}
