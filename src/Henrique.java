public class Henrique implements Animal{
    private static final String FALA = "Fogo meu, ganda mau!";
    private String name;

    public Henrique(String name) {
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
