package human;

public class SailorBuilder implements HumanBuilder {
    public int head;
    public int hand;
    public int leg;

    public Human Create() {
        return new Human(head, hand, leg, "Sailor");
    }
}
