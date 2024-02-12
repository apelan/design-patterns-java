package behavioral.memento.settings;

// Originator
public class Settings {

    private String language;
    private int volume;
    private boolean enableNotifications;

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setEnableNotifications(boolean enableNotifications) {
        this.enableNotifications = enableNotifications;
    }

    public Memento snapshot() {
        return new Memento(this.language, this.volume, this.enableNotifications);
    }

    public void restore(Memento memento) {
        this.language = memento.getLanguage();
        this.volume = memento.getVolume();
        this.enableNotifications = memento.isEnableNotifications();
    }

    @Override
    public String toString() {
        return "Settings{" +
                "language='" + language + '\'' +
                ", volume=" + volume +
                ", enableNotifications=" + enableNotifications +
                '}';
    }

    // Memento
    public static class Memento {
        private final String language;
        private final int volume;
        private final boolean enableNotifications;

        // note that this method is private
        private Memento(String language, int volume, boolean enableNotifications) {
            this.language = language;
            this.volume = volume;
            this.enableNotifications = enableNotifications;
        }

        // note that this method is private
        public String getLanguage() {
            return language;
        }

        // note that this method is private
        public int getVolume() {
            return volume;
        }

        // note that this method is private
        public boolean isEnableNotifications() {
            return enableNotifications;
        }
    }
}
