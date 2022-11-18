package human;

public class Human {
    private int head;
    private int hand;
    private int leg;
    private String occupation;

    public Human(int head, int hand, int leg, String occupation) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.occupation = occupation;
    }

    public void setHead(int head) {
        this.head = head;
    }

    public void setHand(int hand) {
        this.hand = hand;
    }

    public void setLeg(int leg) {
        this.leg = leg;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getHead() {
        return head;
    }

    public int getHand() {
        return hand;
    }

    public int getLeg() {
        return leg;
    }

    public String getOccupation() {
        return occupation;
    }

}
