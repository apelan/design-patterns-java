package structural.proxy;

import structural.proxy.service.AccessControlServiceProxy;
import structural.proxy.service.CacheServiceProxy;

public class ProxyMain {

    public static void main(String[] args) {

        proxy_example_accessControl();

//        proxy_example_cache();

    }

    public static void proxy_example_accessControl() {
        AccessControlServiceProxy service = new AccessControlServiceProxy();

        System.out.println("-----------------");
        service.setAccessingUser("NON_ADMIN");
        System.out.println("Data returned from service: " + service.getUserInfo("RANDOM_USER"));
        System.out.println("-----------------");

        service.setAccessingUser("ADMIN");
        System.out.println("Data returned from service: " + service.getUserInfo("RANDOM_USER"));
        System.out.println("-----------------");
    }

    public static void proxy_example_cache() {
        CacheServiceProxy service = new CacheServiceProxy();

        System.out.println("--------------");
        System.out.println(service.getUserInfo("USER_1"));
        System.out.println("--------------");
        System.out.println(service.getUserInfo("USER_2"));
        System.out.println("--------------");
        System.out.println(service.getUserInfo("USER_3"));
        System.out.println("--------------");
        System.out.println(service.getUserInfo("USER_1"));
        System.out.println("--------------");
        System.out.println(service.getUserInfo("USER_1"));
        System.out.println("--------------");

    }

}
