package src.notification;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class NotificationFactory {
    private static final Map<String, Supplier<NotificationStrategy>> creators = new HashMap<>();

    static {
        creators.put("EMAIL", EmailNotification::new);
        creators.put("SMS", SmsNotification::new);
        creators.put("PUSH", PushNotification::new);
        creators.put("WHATSAPP", WhatsAppNotification::new);
    }

    public static NotificationStrategy createNotification(String type) {
        Supplier<NotificationStrategy> creator = creators.get(type.toUpperCase());
        if (creator == null) {
            throw new IllegalArgumentException("Type de notification inconnu : " + type);
        }
        return creator.get();
    }
}
