package behavioral.specification.password;

public interface Specification<T> {

    Specification<T> and(Specification<T> t);
    Specification<T> or(Specification<T> t);
    boolean isSatisfied(T t);

}
