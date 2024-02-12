package behavioral.specification.password;

public abstract class AbastractSpecification<T> implements Specification<T> {

    public Specification<T> and(Specification<T> specification) {
        return new AndSpecification<>(this, specification);
    }

    public Specification<T> or(Specification<T> specification) {
        return new OrSpecification<>(this, specification);
    }

    @Override
    public abstract boolean isSatisfied(T t);

}
