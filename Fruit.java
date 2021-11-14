package lesson23;

public class Fruit {
    private int pits;
    private String nameOfFruit;

    public Fruit(String nameOfFruit, int pits) {
        this.pits = pits;
        this.nameOfFruit = nameOfFruit;
    }

    class Pits {
        public void getAmount() {
            System.out.println("Fruit: " + nameOfFruit + ", count of pits: " + pits);
        }
    }
}

