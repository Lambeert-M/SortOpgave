public class Main {
    public static void main(String[] args) {
        System.out.println("Which assignment would you like to run?");
        int action = Utils.reader(1,2);

        switch (action) {
            case 1: Opgave1.run();
                break;
            case 2: Opgave2.run();
        }
    }
}