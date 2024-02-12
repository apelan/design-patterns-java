package creational.builder;

import java.util.Arrays;

public class BuilderMain {

    public static void main(String[] args) {
        Email customEmail = Email.builder()
                .sender("custom@email.com")
                .recipients(Arrays.asList("receiver1@email.com", "receiver2@email.com"))
                .subject("Custom email subject")
                .body("Custom email body")
                .build();
        System.out.println("Custom email: " + customEmail);
        System.out.println("------------");

        EmailDirector emailDirector = new EmailDirector();

        Email welcomeEmail = emailDirector.buildWelcomeEmail("newbie@email.com");
        System.out.println("Welcome email: " + welcomeEmail);
        System.out.println("------------");

        Email promotionalEmail = emailDirector.buildPromotionEmail("SALE", "Our new product is on sale!");
        System.out.println("Promotional email: " + promotionalEmail);
        System.out.println("------------");


    }

}
