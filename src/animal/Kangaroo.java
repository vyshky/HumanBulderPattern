package animal;

public class Kangaroo extends  Animal {
    private String name;

    public Kangaroo(int head, int paws, boolean tail, String name) {
        this.setHead(head);
        this.setPaws(paws);
        this.setTail(tail);
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
