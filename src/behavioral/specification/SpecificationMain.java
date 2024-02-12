package behavioral.specification;

import behavioral.specification.password.ContainsNumberSpecification;
import behavioral.specification.password.ContainsSpecialCharacterSpecification;
import behavioral.specification.password.MaxLengthSpecification;
import behavioral.specification.password.MinLengthSpecification;
import behavioral.specification.password.Specification;

public class SpecificationMain {

    public static void main(String[] args) {

        /* creates specification that says that string:
            - must have min 6 characters
            - must have up to 20 characters
            - must contain either number or special character
         */
        Specification<String> specification = new MinLengthSpecification()
                .and(new MaxLengthSpecification())
                .and(new ContainsNumberSpecification().or(new ContainsSpecialCharacterSpecification()));

        checkPassword(specification, "short");
        checkPassword(specification, "thisPasswordIsLongerThan20Characters");
        checkPassword(specification, "okLengthNoNmbrOrSpcl");
        checkPassword(specification, "okLengthWithNmbr1");
        checkPassword(specification, "okLengthWithSpcl!");
        checkPassword(specification, "iMeetAllReq123!@#");

    }

    private static void checkPassword(Specification<String> specification, String password) {
        String message = "Password '%s' is in correct format: %s";
        System.out.printf(message + "\n", password, specification.isSatisfied(password));
    }

}
