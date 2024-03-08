package br.dcx.ufpb.apps4society.appalpharesponseregister.util;

import br.dcx.ufpb.apps4society.appalpharesponseregister.domain.entity.User;
import net.datafaker.Faker;

public class UserFactory {
    private final static Faker faker = new Faker();

    public static User createUser() {
        return new User(
                faker.number().randomNumber(),
                faker.naruto().character(),
                faker.internet().emailAddress(),
                faker.date().birthday().toLocalDateTime().toLocalDate());
    }
}
