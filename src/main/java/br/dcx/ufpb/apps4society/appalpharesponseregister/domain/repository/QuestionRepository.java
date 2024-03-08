package br.dcx.ufpb.apps4society.appalpharesponseregister.domain.repository;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Question;

public interface QuestionRepository {
    Question findById(Long id);
}
