package Publisher;


import Subscriber.Subscriber;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MrBeastYoutube {
    Map<String, Subscriber> subscribers = new HashMap<>();

    private static MrBeastYoutube instance;

    private MrBeastYoutube() {
    }

    public static MrBeastYoutube getInstance() {
        if (instance == null) {
            synchronized (MrBeastYoutube.class) {
                if (instance == null) {
                    instance = new MrBeastYoutube();
                }
            }
        }
        return instance;
    }

    public void subscribe(String key, Subscriber subscriber) {
        this.subscribers.put(key, subscriber);
    }

    public void unsubscribe(String key) {
        this.subscribers.remove(key);
    }

    public List<Boolean> sendNotification(List<String> members) {
        List<Boolean> result = new ArrayList<>();
        subscribers.forEach((name, subscriber) -> {
            if (members.contains(name))
                result.add(subscriber.update());
        });
        return result;
    }
}
