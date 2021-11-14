package lesson23;

public class Fruit3Exercise {
    private String nameOfFruit;

    @Override
    public String toString() {
        return "Name Of Fruit='" + nameOfFruit + '\'' +
                '}';
    }

    public Fruit3Exercise(String nameOfFruit) {
        this.nameOfFruit = nameOfFruit;
    }


    static class Pits {
        private static int countOfPits1 = 1;

        public static void getAmount() {
            System.out.println("count of pits: " + countOfPits1);
        }

    }
}
