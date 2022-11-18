import human.Human;
import human.HumanBuildDirector;
import human.PilotBuilder;
import human.SailorBuilder;

public class Main {
    public static HumanBuildDirector humanBuildDirector = new HumanBuildDirector();
    public static void main(String[] args) {
        // Создание пилота
        PilotBuilder pilotBuilder = new PilotBuilder();
        humanBuildDirector.replaceBuilder(pilotBuilder);
        Human pilot = humanBuildDirector.build();
        System.out.println(pilot.getOccupation());

        // Создание моряка
        SailorBuilder sailorBuilder = new SailorBuilder();
        humanBuildDirector.replaceBuilder(sailorBuilder);
        Human sailor = humanBuildDirector.build();
        System.out.println(sailor.getOccupation());
    }
}