public class Cube implements Animal{
    private static final String FALA = "Seu m**das!";
    private String name;
    public Cube(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public String speak() {
        return this.FALA;
    }

}
