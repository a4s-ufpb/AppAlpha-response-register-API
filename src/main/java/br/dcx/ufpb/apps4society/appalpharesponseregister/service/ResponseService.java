package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.dto.ResponseDTO;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.ResponseRepository;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ResponseDTO> getAllResponses() {
        return responseRepository.findAll().stream()
                .map(response -> modelMapper.map(response, ResponseDTO.class))
                .collect(Collectors.toList());
    }

    public ResponseDTO getResponseById(long id) {
        return modelMapper.map(responseRepository.findById(id).get(), ResponseDTO.class);
    }
}
