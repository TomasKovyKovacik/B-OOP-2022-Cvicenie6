package sk.stuba.fei.uim.oop;

public class Main {
    public static void main(String[] args) {
        SvetoveStrany strana = SvetoveStrany.JUH;

        for (SvetoveStrany s :SvetoveStrany.values()) {
            checkSever(s);
        }

        checkSever(SvetoveStrany.valueOf("SEVER"));
        checkSever(strana);
        checkSever(SvetoveStrany.valueOf("sever"));
    }

    public static void checkSever(SvetoveStrany s) {
        if (s.equals(SvetoveStrany.SEVER)) {
            System.out.println("je sever");
        } else {
            System.out.println("nie je sever");
        }
    }
}
