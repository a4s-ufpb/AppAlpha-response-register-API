package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.dto.ResponseDTO;
import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.Response;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.ResponseRepository;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    public ResponseDTO getResponseById(long id) {
        Response response = responseRepository.findById(id).orElseThrow(RuntimeException::new);
        return new ResponseDTO(response.getId(), response.getTypedLetters(), response.isCorrect());
    }

    
}
