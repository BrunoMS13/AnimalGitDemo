public class Main {
    public static void main(String[] args) {
        System.out.println("Vamos ouvir os animais!!");
        Animal p1 = new Henrique("Paz");
        Animal p2 = new Cube("Cubão");
        System.out.println(p1.getName() + " diz muito chatead - " + p1.speak());
        System.out.println(p2.getName() + " grita - " + p2.speak());
        }
    }

