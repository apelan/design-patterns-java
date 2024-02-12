package behavioral.specification.password;

public class OrSpecification<T> extends AbastractSpecification<T> {

    private final Specification<T> left;
    private final Specification<T> right;

    public OrSpecification(Specification<T> left, Specification<T> right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public boolean isSatisfied(T t) {
        return left.isSatisfied(t) || right.isSatisfied(t);
    }
}
