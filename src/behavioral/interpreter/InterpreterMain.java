package behavioral.interpreter;

import java.util.List;

import behavioral.interpreter.products.Product;
import behavioral.interpreter.products.expressions.CategoryProductExpression;
import behavioral.interpreter.products.expressions.NameFilterProductExpression;
import behavioral.interpreter.products.expressions.PriceLowerThanExpression;
import behavioral.interpreter.products.expressions.ProductExpression;

public class InterpreterMain {

    public static void main(String[] args) {

        List<Product> products = List.of(
                new Product("Product1", "Category1", 100),
                new Product("Product2", "Category1", 200),
                new Product("Product3", "Category2", 300),
                new Product("Product4", "Category2", 400),
                new Product("Product5", "Category3", 500),
                new Product("Product6", "Category3", 600)
        );

        System.out.println("----------");
        ProductExpression nameFilter = new NameFilterProductExpression("Product2");
        System.out.println("Filtered products by name: " + nameFilter.interpret(products));



        System.out.println("----------");
        ProductExpression categoriesFilter = new CategoryProductExpression("Category1", "Category2");
        System.out.println("Filtered products by categories: " + categoriesFilter.interpret(products));


        System.out.println("----------");
        ProductExpression priceFilter = new PriceLowerThanExpression(300);
        System.out.println("Filtered products with price less than 300: " + priceFilter.interpret(products));

    }

}
