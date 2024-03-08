package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.service;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.assertj.core.api.Assertions.*;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.input.ResponseInput;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.QuestionRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.ResponseRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.UserRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.service.impl.ResponseServiceImpl;
import br.dcx.ufpb.apps4society.appalpharesponseregister.util.ResponseFactory;

class ResponseServiceImplTest {
    @Mock
    ResponseRepository responseRepository;

    @Mock
    QuestionRepository questionRepository;

    @Mock
    UserRepository userRepository;

    @InjectMocks
    ResponseServiceImpl responseService;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
        responseService = new ResponseServiceImpl(responseRepository, questionRepository, userRepository);
    }

    @Test
    @DisplayName("Given response input when register response then return response output")
    void givenResponseInput_whenRegisterResponse_thenReturnResponseOutput() {
        var responseInput = new ResponseInput();
        var response = ResponseFactory.createResponse();
        when(questionRepository.findById(responseInput.getQuestionId())).thenReturn(response.getQuestion());
        when(userRepository.findById(responseInput.getUserId())).thenReturn(response.getUser());
        when(responseRepository.save(any())).thenReturn(response);

        var responseOutput = responseService.registerRespone(responseInput);

        assertThat(responseOutput).isNotNull();
        assertThat(responseOutput.getId()).isEqualTo(response.getId());
        assertThat(responseOutput.getTypedLetters()).isEqualTo(response.getTypedLetters());
        assertThat(responseOutput.getTime()).isEqualTo(response.getTime());

        verify(questionRepository).findById(responseInput.getQuestionId());
        verify(userRepository).findById(responseInput.getUserId());
        verify(responseRepository).save(any());
    }
}
