package structural.proxy.service;

import java.util.HashMap;
import java.util.Map;

// PROXY EXAMPLE (CACHE)
public class CacheServiceProxy implements Service {

    private final SensitiveUserService service;
    private Map<String, String> cache = new HashMap<>();

    public CacheServiceProxy() {
        this.service = new SensitiveUserService();
    }

    @Override
    public String getUserInfo(String user) {

        // simulate simple cache info for user
        if (!cache.containsKey(user)) {
            cache.put(user, service.getUserInfo(user));
        }

        return cache.get(user);
    }
}
