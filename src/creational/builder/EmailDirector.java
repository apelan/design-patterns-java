package creational.builder;

import java.util.Collections;

// This is simple Director, no complexity
// We can for example create EmailBuilder as separate interface/abstract class and create multiple implementations
// After that, using Dependency Injection we can inject concrete implementation of builder here and continue that way
public class EmailDirector {

    public Email buildWelcomeEmail(String recipientEmailAddress) {
        return Email.builder()
                .sender("company@mail.com")
                .recipients(Collections.singletonList(recipientEmailAddress))
                .subject("Welcome to company")
                .body("Welcome to company")
                .build();
    }

    public Email buildPromotionEmail(String subject, String body) {
        return Email.builder()
                .sender("promotional-company@mail.com")
                .recipients(Collections.singletonList("all-subscribers-here@mail.com"))
                .subject(subject)
                .body(body)
                .build();
    }

}
