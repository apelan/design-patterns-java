package creational.builder;

import java.util.List;

public class Email {

    private String sender;
    private List<String> recipients;
    private String subject;
    private String body;

    // private constructor, force usage of builder class
    private Email(String sender, List<String> recipients, String subject, String body) {
        this.sender = sender;
        this.recipients = recipients;
        this.subject = subject;
        this.body = body;
    }

    // returns instance of builder class
    public static Builder builder() {
        return new Builder();
    }

    @Override
    public String toString() {
        return "{ sender='" + sender + '\'' +
                ", recipients=" + recipients +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                " }";
    }

    public static class Builder {
        private String sender;
        private List<String> recipients;
        private String subject;
        private String body;

        private Builder() {}

        public Builder sender(String sender) {
            this.sender = sender;
            return this;
        }

        public Builder recipients(List<String> recipients) {
            this.recipients = recipients;
            return this;
        }

        public Builder subject(String subject) {
            this.subject = subject;
            return this;
        }

        public Builder body(String body) {
            this.body = body;
            return this;
        }

        // build Email instance
        public Email build() {
            return new Email(this.sender, this.recipients, this.subject, this.body);
        }

    }

}
