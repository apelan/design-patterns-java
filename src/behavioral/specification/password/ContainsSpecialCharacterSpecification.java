package behavioral.specification.password;

import java.util.regex.Pattern;

public class ContainsSpecialCharacterSpecification extends AbastractSpecification<String> {
    @Override
    public boolean isSatisfied(String s) {
        return Pattern.compile("[^a-zA-Z0-9\\s]")
                .matcher(s)
                .find();
    }
}
