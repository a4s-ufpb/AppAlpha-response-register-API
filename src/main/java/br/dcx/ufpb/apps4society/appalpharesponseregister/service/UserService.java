package br.dcx.ufpb.apps4society.appalpharesponseregister.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.repository.UserRepository;

@Service
public class UserService {
    
    @Autowired
    private UserRepository repository;

    @Autowired
    private ModelMapper modelMapper;
    
}
