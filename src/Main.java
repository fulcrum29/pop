import java.util.ArrayList;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.

public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.

        // Press Shift+F10 or click the green arrow button in the gutter to run the code.
        FighterJet f16 = new FighterJet(3, "f-16");
        SovietPlane mig29 = new SovietPlane(3, "mig-29");

        f16.useWeapons("bomb");
        f16.eject();
        System.out.println(f16.bombs);
        mig29.eject();

    }
}