package lesson23;

public class Main {
    public static void main(String[] args) {
        Fruit cherry = new Fruit("Cherry", 1);
        Fruit apple = new Fruit("Apple", 4);
        Fruit.Pits pitsOfApple = apple.new Pits();
        Fruit.Pits pitsOfCherry = cherry.new Pits();
        pitsOfCherry.getAmount();
        pitsOfApple.getAmount();
        Fruit3Exercise peach = new Fruit3Exercise("Peach");
        System.out.println(peach);
        Fruit3Exercise.Pits.getAmount();

    }
}
