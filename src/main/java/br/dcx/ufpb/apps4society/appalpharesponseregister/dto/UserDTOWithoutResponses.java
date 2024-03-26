package br.dcx.ufpb.apps4society.appalpharesponseregister.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

public class UserDTOWithoutResponses {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;

    public UserDTOWithoutResponses() {}

    public UserDTOWithoutResponses(String name, String email, LocalDate birthDate) {
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
