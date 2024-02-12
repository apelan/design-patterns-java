package structural.proxy.service;

// PROXY EXAMPLE (ACCESS CONTROL)
public class AccessControlServiceProxy implements Service {

    private final SensitiveUserService service;
    private String accessingUser = "DEFAULT";

    public AccessControlServiceProxy() {
        service = new SensitiveUserService();
    }

    public void setAccessingUser(String accessingUser) {
        this.accessingUser = accessingUser;
    }

    @Override
    public String getUserInfo(String user) {
        System.out.println("User " + accessingUser + " is accessing service");
        // simulate that only ADMIN is able to see user info returned from service
        if (accessingUser.equals("ADMIN")) {
            return service.getUserInfo(user);
        } else {
            return "FORBIDDEN";
        }
    }
}
