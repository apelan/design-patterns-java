package behavioral.specification.password;

public class MinLengthSpecification extends AbastractSpecification<String> {
    @Override
    public boolean isSatisfied(String s) {
        return s.length() >= 6;
    }
}
