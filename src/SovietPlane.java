public class SovietPlane extends FighterJet{


    SovietPlane(int engines, String codename) {
        super(engines, codename);
        this.pilotNames.add("Misha");
    }
    @Override
    public void eject() {
        System.out.println(pilotNames + "Failed to Eject (no eject system in place)");
    }
}
