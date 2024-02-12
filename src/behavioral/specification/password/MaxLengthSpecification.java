package behavioral.specification.password;

public class MaxLengthSpecification extends AbastractSpecification<String> {
    @Override
    public boolean isSatisfied(String s) {
        return s.length() <= 20;
    }
}
