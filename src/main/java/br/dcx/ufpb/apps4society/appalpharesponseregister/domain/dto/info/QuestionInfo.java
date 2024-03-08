package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info;

public class QuestionInfo {
    private Long id;
    private String word;
    private String theme;

    public QuestionInfo() {
    }

    public QuestionInfo(Long id, String word, String theme) {
        this.id = id;
        this.word = word;
        this.theme = theme;
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

    
}
