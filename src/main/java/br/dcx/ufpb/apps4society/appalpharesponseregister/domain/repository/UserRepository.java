package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.User;

public interface UserRepository {
    User findById(Long id);
}
