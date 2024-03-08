package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.service;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.input.ResponseInput;
import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.dto.output.ResponseOutput;

public interface ResponseService {
    ResponseOutput registerRespone(ResponseInput responseInput);
    ResponseOutput getResponseById(Long id);
}
