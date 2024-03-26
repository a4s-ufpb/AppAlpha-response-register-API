package br.dcx.ufpb.apps4society.appalpharesponseregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.dcx.ufpb.apps4society.appalpharesponseregister.service.ResponseService;

@RestController
@RequestMapping("/api")
public class ResponseController {

    @Autowired
    private ResponseService responseService;

    @GetMapping("/responses")
    public ResponseEntity<?> getAllResponses() {
        return ResponseEntity.ok(responseService.getAllResponses());
    }

    @GetMapping("/response/{id}")
    public ResponseEntity<?> getResponseById(long id) {
        return ResponseEntity.ok(responseService.getResponseById(id));
    }
}
