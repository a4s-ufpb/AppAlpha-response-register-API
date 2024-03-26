package br.dcx.ufpb.apps4society.appalpharesponseregister.dto;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonView;

import br.dcx.ufpb.apps4society.appalpharesponseregister.view.Views;

@JsonView(Views.Public.class)
public class UserDTO {
    private Long id;
    private String name;
    private String email;
    private LocalDate birthDate;
    @JsonView(Views.User.class)
    private Set<ResponseDTO> responses;

    public UserDTO() {}

    public UserDTO(String name, String email, LocalDate birthDate) {
        this.name = name;
        this.email = email;
        this.birthDate = birthDate;
        this.responses = new HashSet<>();
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

    public Set<ResponseDTO> getResponses() {
        return responses;
    }

    public void setResponses(Set<ResponseDTO> responses) {
        this.responses = responses;
    }
}
