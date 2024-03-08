package br.dcx.ufpb.apps4society.appalpharesponseregister.util;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.Response;
import net.datafaker.Faker;

public class ResponseFactory {
    private final static Faker faker = new Faker();

    public static Response createResponse() {
        return new Response(
                faker.number().randomNumber(),
                faker.lorem().sentence(),
                faker.random().nextLong(),
                faker.bool().bool(),
                UserFactory.createUser(),
                QuestionFactory.createQuestion());
    }
}
