import java.util.ArrayList;

public class FighterJet {


    int weaponPylons;

    int rockets;
    int bombs;
    int engines;
    ArrayList<String> pilotNames = new ArrayList<String>();
    String codename;

    FighterJet() {
        this.rockets = 2;
        this.bombs = 3;
        this.weaponPylons = 5;
        this.engines = 1;
        this.codename = "FA-TEST";
        this.pilotNames.add("John");
    }

    FighterJet(int engines, String codename) {
        this.rockets = 2;
        this.bombs = 3;
        this.weaponPylons = 5;
        this.engines = engines;
        this.codename = codename;
        this.pilotNames.add("John");
    }

    public void useWeapons(String weapon){
        if (weapon == "rocket") {
            rockets = rockets - 1;
            System.out.println("Rakieta wystrzelona");
        }
        else if (weapon == "bomb") {
            rockets = rockets - 1;
            System.out.println("Bomba wystrzelona");
        }
        else {
            System.out.println("Brak broni");
        }
    }
    public void useWeapons(String weaponType){
        if (weapon == "rocket") {
            rockets = rockets - 1;
            System.out.println("Rakieta wystrzelona");
        }
        else if (weapon == "bomb") {
            rockets = rockets - 1;
            System.out.println("Bomba wystrzelona");
        }
        else {
            System.out.println("Brak broni");
        }
    }
    public void eject() {
        System.out.println(pilotNames + "Ejected");
        pilotNames.clear();
    }
}
