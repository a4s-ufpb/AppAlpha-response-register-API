package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.dto.ResponseDTO;
import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.Question;
import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.Response;
import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.User;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.QuestionRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.ResponseRepository;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.UserRepository;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ResponseDTO> getAllResponses() {
        List<ResponseDTO> responseDTOs = new ArrayList<>();
        for (Response r : responseRepository.findAll()) {
            responseDTOs.add(modelMapper.map(r, ResponseDTO.class));
        }
        return responseDTOs;
    }

    public ResponseDTO getResponseById(long id) {
        return modelMapper.map(responseRepository.findById(id).get(), ResponseDTO.class);
    }

    public ResponseDTO saveResponse(Long userId, Long questionId, ResponseDTO responseDTO) {
        if (responseDTO.getId() != null) {
            throw new IllegalArgumentException("The response ID must be null to add a new response");
        }

        if (responseDTO.getUser() != null) {
            throw new IllegalArgumentException("The user must be null to add a new response");
        }

        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));
        Question question = questionRepository.findById(questionId)
                .orElseThrow(() -> new IllegalArgumentException("Question not found"));
        Response response = modelMapper.map(responseDTO, Response.class);
        response.setUser(user);
        response.setQuestion(question);
        responseRepository.save(response);
        return modelMapper.map(response, ResponseDTO.class);
    }

    public ResponseDTO updateResponse(ResponseDTO responseDTO) {
        if (responseDTO.getId() == null) {
            throw new IllegalArgumentException("The response ID must not be null to update a response");
        }
        Response response = modelMapper.map(responseDTO, Response.class);
        responseRepository.save(response);
        return modelMapper.map(response, ResponseDTO.class);
    }

    public void deleteResponse(long id) {
        responseRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Response not found"));
        responseRepository.deleteById(id);
    }
}
