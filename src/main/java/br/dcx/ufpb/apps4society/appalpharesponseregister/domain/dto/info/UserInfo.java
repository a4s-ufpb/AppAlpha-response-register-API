package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info;

import java.time.LocalDate;

public class UserInfo {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public UserInfo() {
    }

    public UserInfo(Long id, String name, String email, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}