package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Response;

public interface ResponseRepository {
    Response save(Response response);
    Response findById(Long id);
}
