package behavioral.templateMethod;

import behavioral.templateMethod.webshop.BaseWebshop;
import behavioral.templateMethod.webshop.BoringShopWithoutDiscount;
import behavioral.templateMethod.webshop.CoolShopWithDiscount;
import behavioral.templateMethod.webshop.Product;

public class TemplateMethodMain {

    public static void main(String[] args) {
        Product product = new Product("Amazing product", 100.00);

        System.out.println("------------------");
        BaseWebshop boringShop = new BoringShopWithoutDiscount();
        boringShop.sellProduct(product);

        System.out.println("------------------");

        BaseWebshop coolShop = new CoolShopWithDiscount();
        coolShop.sellProduct(product);
        System.out.println("------------------");


    }

}
