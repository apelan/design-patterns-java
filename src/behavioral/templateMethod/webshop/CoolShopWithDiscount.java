package behavioral.templateMethod.webshop;

public class CoolShopWithDiscount extends BaseWebshop {
    @Override
    protected boolean validateProduct(Product product) {
        return true;
    }

    @Override
    protected void processPayment(double amount) throws RuntimeException {
        System.out.println("Processing payment " + amount + " in CoolShop");
    }

    @Override
    protected void rollbackPayment(double amount) {
        System.out.println("Rollback payment " + amount + " in CoolShop");
    }

    @Override
    protected int determineDiscountPercentage(Product product) {
        return 20;
    }

    @Override
    protected void registerProductIsSold(Product product) {
        System.out.println("=== Product " + product.getName() + " is sold in CoolShop! ===");
    }
}
