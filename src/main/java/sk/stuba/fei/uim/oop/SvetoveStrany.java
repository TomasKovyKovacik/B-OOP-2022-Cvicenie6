package sk.stuba.fei.uim.oop;

import java.util.Locale;

public enum SvetoveStrany {
    SEVER(true),
    JUH(false),
    VYCHOD(false),
    ZAPAD(false);

    private boolean jeSever;

    SvetoveStrany(boolean jeSever) {
        this.jeSever = jeSever;
    }

    public static SvetoveStrany fromString(String s) {
        return SvetoveStrany.valueOf(s.toUpperCase(Locale.ROOT));
    }

    public boolean isJeSever() {
        return jeSever;
    }
}
