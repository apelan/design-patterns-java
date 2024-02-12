package behavioral.specification.password;

import java.util.regex.Pattern;

public class ContainsNumberSpecification extends AbastractSpecification<String> {
    @Override
    public boolean isSatisfied(String s) {
        return Pattern.compile("\\d+")
                .matcher(s)
                .find();
    }
}
