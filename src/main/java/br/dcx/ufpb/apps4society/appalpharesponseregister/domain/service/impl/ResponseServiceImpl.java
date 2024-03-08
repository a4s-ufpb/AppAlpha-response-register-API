package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.service.impl;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info.QuestionInfo;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.info.UserInfo;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.input.ResponseInput;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.output.ResponseOutput;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Question;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Response;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.User;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.QuestionRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.ResponseRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository.UserRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.service.ResponseService;

public class ResponseServiceImpl implements ResponseService {

    private final ResponseRepository responseRepository;
    private final QuestionRepository questionRepository;
    private final UserRepository userRepository;

    public ResponseServiceImpl(ResponseRepository responseRepository, QuestionRepository questionRepository,
            UserRepository userRepository) {
        this.responseRepository = responseRepository;
        this.questionRepository = questionRepository;
        this.userRepository = userRepository;
    }

    @Override
    public ResponseOutput registerRespone(ResponseInput responseInput) {
        Question question = questionRepository.findById(responseInput.getQuestionId());
        User user = userRepository.findById(responseInput.getUserId());
        Response response = new Response(responseInput.getTypedLetters(), responseInput.getTime(),
                responseInput.isCorrect(), user, question);
        response = responseRepository.save(response);
        return buildResponseOutput(response);
    }

    @Override
    public ResponseOutput getResponseById(Long id) {
        Response response = responseRepository.findById(id);
        return buildResponseOutput(response);
    }

    private ResponseOutput buildResponseOutput(Response response) {
        UserInfo userInfo = new UserInfo(response.getUser().getId(), response.getUser().getName(),
                response.getUser().getEmail(), response.getUser().getBirthDate());
        QuestionInfo questionInfo = new QuestionInfo(response.getQuestion().getId(), response.getQuestion().getWord(),
                response.getQuestion().getTheme());
        return ResponseOutput.builder().id(response.getId()).typedLetters(response.getTypedLetters())
                .time(response.getTime()).correct(response.isCorrect()).user(userInfo).question(questionInfo).build();
    }

}
