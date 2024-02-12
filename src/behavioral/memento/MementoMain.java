package behavioral.memento;

import behavioral.memento.settings.SettingsManager;

public class MementoMain {

    public static void main(String[] args) {
        SettingsManager settingsManager = new SettingsManager();
        System.out.println("----------------");
        settingsManager.showSettings();

        settingsManager.save("en_US", 30, false);
        settingsManager.showSettings();
        System.out.println("----------------");

        settingsManager.save("it_IT", 70, true);
        settingsManager.showSettings();
        System.out.println("----------------");

        settingsManager.configure("it_IT", 100, false);
        settingsManager.showSettings();
        System.out.println("----------------");

        settingsManager.undo();
        settingsManager.showSettings();
        System.out.println("----------------");

        settingsManager.undo();
        settingsManager.showSettings();
        System.out.println("----------------");

        settingsManager.undo();
        settingsManager.showSettings();
        System.out.println("----------------");

    }

}
