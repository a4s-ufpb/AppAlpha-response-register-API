package br.dcx.ufpb.apps4society.appalpharesponseregister.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.dcx.ufpb.apps4society.appalpharesponseregister.dto.ResponseDTO;
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

    @PostMapping("/questions/{questionId}/users/{userId}/responses")
    public ResponseEntity<?> saveResponse(@PathVariable Long userId, @PathVariable Long questionId, @RequestBody ResponseDTO responseDTO) {
        return ResponseEntity.status(201).body(responseService.saveResponse(userId, questionId, responseDTO));
    }

    @PutMapping("/responses/{id}")
    public ResponseEntity<?> updateResponse(@RequestBody ResponseDTO responseDTO) {
        return ResponseEntity.ok(responseService.updateResponse(responseDTO));
    }

    @DeleteMapping("/responses/{id}")
    public ResponseEntity<?> deleteResponse(@PathVariable Long id) {
        responseService.deleteResponse(id);
        return ResponseEntity.noContent().build();
    }
}
