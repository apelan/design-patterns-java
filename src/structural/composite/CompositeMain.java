package structural.composite;

import structural.composite.drink.Beer;
import structural.composite.drink.Juice;
import structural.composite.food.Burger;
import structural.composite.food.ChiefSpecialty;
import structural.composite.food.Pizza;

public class CompositeMain {

    public static void main(String[] args) {

        Menu menu = new Menu("My menu");
        menu.addIdem(new Juice());
        menu.addIdem(new Beer());
        menu.addIdem(new Burger());
        menu.addIdem(new Pizza());

        Menu specialtySubmenu = new Menu("Chief specialty");
        specialtySubmenu.addIdem(new ChiefSpecialty());
        menu.addIdem(specialtySubmenu); // add submenu to root menu (tree structure, remember?)

        System.out.println("-------------");
        menu.printItems();
        System.out.println("-------------");
        System.out.printf("Menu total price: %s$", menu.price());
        System.out.println();
        System.out.println("-------------");

    }

}
