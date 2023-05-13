package machine;

import java.util.*;

public class CoffeeMachine {
    
    public static void main(String[] args) {
        coffeeMachine();
    }

    public static void coffeeMachine() {
        int[] contentList = new int[] {400, 540, 120, 9, 550}; //water,milk,beans,disposableCup,money

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            switch (sc.next()) {
                case "buy" -> Operation.buy(contentList);
                case "fill" -> Operation.fill(contentList);
                case "take" -> Operation.take(contentList);
                case "remaining" -> Print.printContent(contentList);
                case "exit" -> System.exit(0);
            }
        }
    }
}
