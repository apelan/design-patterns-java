package behavioral.memento.settings;

import java.util.Stack;

// Originator
public class SettingsManager {

    private final Stack<Settings.Memento> history;
    private final Settings settings;

    public SettingsManager() {
        history = new Stack<>();
        settings = new Settings();
    }

    public void configure(String language, int volume, boolean enableNotifications) {
        System.out.println("Configuring new settings...");
        settings.setLanguage(language);
        settings.setVolume(volume);
        settings.setEnableNotifications(enableNotifications);
    }

    public void save(String language, int volume, boolean enableNotifications) {
        configure(language, volume, enableNotifications);
        history.push(settings.snapshot());
    }

    public void undo() {
        System.out.println("Starting undo...");
        if (!history.isEmpty()) {
            settings.restore(history.pop());
        } else {
            System.out.println("Nothing to undo");
        }
    }

    public void showSettings() {
        System.out.println(settings);
    }

}
