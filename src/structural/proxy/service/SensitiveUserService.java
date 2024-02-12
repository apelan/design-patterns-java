package structural.proxy.service;

// REAL SERVICE
public class SensitiveUserService implements Service {

    protected SensitiveUserService() {}

    @Override
    public String getUserInfo(String user) {
        // Any logic here
        System.out.println("Retrieving information for user: " + user);
        return "top secret user info for user " + user;
    }

}
