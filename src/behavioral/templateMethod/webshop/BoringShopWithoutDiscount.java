package behavioral.templateMethod.webshop;

public class BoringShopWithoutDiscount extends BaseWebshop {
    @Override
    protected boolean validateProduct(Product product) {
        System.out.println("Validating product...");
        return true;
    }

    @Override
    protected void processPayment(double amount) throws RuntimeException {
        System.out.println("Processing payment " + amount + " in BoringShop");
    }

    @Override
    protected void rollbackPayment(double amount) {
        System.out.println("Rollback payment " + amount + " in BoringShop");
    }

    @Override
    protected int determineDiscountPercentage(Product product) {
        return 0;
    }

    @Override
    protected void registerProductIsSold(Product product) {
        System.out.println("=== Product " + product.getName() + " is sold in BoringShop! ===");
    }
}
