package hospital.gui.theme;

import java.util.ArrayList;
import java.util.List;

/**
 * Controls the currently selected application theme.
 */
public final class ThemeManager {

    private static Theme currentTheme =
            ThemePresets.oceanBlue();

    private static final List<ThemeChangeListener> listeners =
            new ArrayList<>();

    private ThemeManager() {
        // Prevent creating instances.
    }

    /**
     * Gets the currently active theme.
     */
    public static Theme getCurrentTheme() {
        return currentTheme;
    }

    /**
     * Changes the active theme.
     */
    public static void setTheme(Theme theme) {

        if (theme == null) {
            return;
        }

        currentTheme = theme;

        notifyListeners();
    }

    /**
     * Sets the theme using its name.
     */
    public static void setThemeByName(String themeName) {

        if (themeName == null) {
            return;
        }

        switch (themeName.toLowerCase()) {

            case "ocean blue":
                setTheme(ThemePresets.oceanBlue());
                break;

            case "emerald care":
                setTheme(ThemePresets.emeraldCare());
                break;

            case "teal horizon":
                setTheme(ThemePresets.tealHorizon());
                break;

            case "royal violet":
                setTheme(ThemePresets.royalViolet());
                break;

            case "midnight slate":
                setTheme(ThemePresets.midnightSlate());
                break;

            default:
                // Keep current theme.
                break;
        }
    }

    /**
     * Registers a listener that will be notified
     * whenever the theme changes.
     */
    public static void addThemeChangeListener(
            ThemeChangeListener listener
    ) {

        if (listener != null &&
                !listeners.contains(listener)) {

            listeners.add(listener);
        }
    }

    /**
     * Removes a theme listener.
     */
    public static void removeThemeChangeListener(
            ThemeChangeListener listener
    ) {

        listeners.remove(listener);
    }

    private static void notifyListeners() {

        for (ThemeChangeListener listener : listeners) {

            listener.themeChanged(currentTheme);
        }
    }

    /**
     * Listener interface for theme changes.
     */
    public interface ThemeChangeListener {

        void themeChanged(Theme newTheme);
    }
}