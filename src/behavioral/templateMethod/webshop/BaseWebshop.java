package behavioral.templateMethod.webshop;

public abstract class BaseWebshop {

    protected abstract boolean validateProduct(Product product);
    protected abstract void processPayment(double amount) throws RuntimeException;

    protected abstract void rollbackPayment(double amount);
    protected abstract int determineDiscountPercentage(Product product);
    protected abstract void registerProductIsSold(Product product);


    // this is template method
    public void sellProduct(Product product) {
        boolean isValid = validateProduct(product);

        if (!isValid) {
            throw new RuntimeException("Product not valid");
        }

        try {
            processPayment(product.getPrice());
        } catch (RuntimeException e) {
            rollbackPayment(product.getPrice());
        }

        int discount = determineDiscountPercentage(product);

        if (discount != 0) {
            double discountedPrice = product.getPrice() - (product.getPrice() * discount / 100);
            System.out.println("Applying discount of " + discount + "% to product " + product.getName() + ".");
            System.out.println("Initial price was " + product.getPrice() + ", discounted price is " + discountedPrice);
            product = new Product(product.getName(), discountedPrice);
        }

        registerProductIsSold(product);

    }

}
