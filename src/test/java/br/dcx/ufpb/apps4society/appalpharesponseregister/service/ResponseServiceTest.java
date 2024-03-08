package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.time.LocalDateTime;
import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;

import static org.assertj.core.api.Assertions.*;

import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.Response;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.ResponseRepository;

class ResponseServiceTest {
    @Mock
    ResponseRepository responseRepository;
    
    @Autowired
    @InjectMocks
    ResponseService responseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void whenValidId_thenResponseShouldBeFound() {
        Response response = new Response(1L, "typedLetters", LocalDateTime.now(), true);
        when(responseRepository.findById(1L)).thenReturn(Optional.of(response));

        var result = responseService.getResponseById(1L);

        assertThat(result.getId()).isEqualTo(1L);
        assertThat(result.getTypedLetters()).isEqualTo("typedLetters");
        assertThat(result.isCorrect()).isTrue();

        verify(responseRepository).findById(1L);
    }

    @Test
    void whenInvalidId_thenThrowRuntimeException() {
        when(responseRepository.findById(1L)).thenReturn(Optional.empty());

        assertThatThrownBy(() -> responseService.getResponseById(1L))
            .isInstanceOf(RuntimeException.class);
    }
}
