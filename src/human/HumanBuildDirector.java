package human;

public class HumanBuildDirector {
    HumanBuilder builder;
    public HumanBuildDirector() {
    }
    public HumanBuildDirector(HumanBuilder builder) {
        this.builder = builder;
    }
    public HumanBuildDirector replaceBuilder(HumanBuilder builder) {
        this.builder = builder;
        return this;
    }
    public Human build() {
        return builder.Create();
    }
}
