package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.dto.ResponseDTO;
import br.dcx.ufpb.apps4society.appalpharesponseregister.entity.Response;
import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.ResponseRepository;

@Service
public class ResponseService {

    @Autowired
    private ResponseRepository responseRepository;

    @Autowired
    private ModelMapper modelMapper;

    public List<ResponseDTO> getAllResponses() {
        List<ResponseDTO> responseDTOs = new ArrayList<>();
        for(Response r : responseRepository.findAll()) {
            responseDTOs.add(modelMapper.map(r,ResponseDTO.class));
        }
        return responseDTOs;
    }

    public ResponseDTO getResponseById(long id) {
        return modelMapper.map(responseRepository.findById(id).get(), ResponseDTO.class);
    }
}
