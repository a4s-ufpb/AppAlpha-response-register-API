package br.dcx.ufpb.apps4society.appalpharesponseregister.util;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Question;
import net.datafaker.Faker;

public class QuestionFactory {
    private static final Faker faker = new Faker();

    public static Question createQuestion() {
        return new Question(
                faker.number().randomNumber(),
                faker.lorem().sentence(),
                faker.lorem().sentence(),
                faker.lorem().sentence());
    }
}
