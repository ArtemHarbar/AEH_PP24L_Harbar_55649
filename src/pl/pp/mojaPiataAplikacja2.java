package pl.pp;

public class mojaPiataAplikacja2 {
    public static void main(String[] args) {
        printCharacter('*', 5, 3);
    }

    private static void printCharacter(char symbol, int timesPerRow, int numberOfRows) {
        for (int i = 0; i < numberOfRows; i++) {
            for (int j = 0; j < timesPerRow; j++) {
                System.out.print(symbol);
            }
            System.out.println();
        }
    }
}