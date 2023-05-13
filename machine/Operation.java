package machine;

import java.util.*;

public class Operation {
    public static void buy(int[] contentList) {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        Scanner sc = new Scanner(System.in);
        switch (sc.next()) {
            case "1" -> {
                judgeBuy(contentList, 250, 0, 16, 4);
            }
            case "2" -> {
                judgeBuy(contentList, 350, 75, 20, 7);
            }
            case "3" -> {
                judgeBuy(contentList, 200, 100, 12, 6);
            }
            case "back" -> {}
        }
    }

    public static void fill(int[] contentList) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write how many ml of water you want to add: ");
        contentList[0] += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        contentList[1] += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        contentList[2] += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        contentList[3] += sc.nextInt();
    }

    public static void take(int[] contentList) {
        System.out.printf("I gave you $%d\n", contentList[4]);
        contentList[4] = 0;
    }

    public static void judgeBuy(int[] contentList, int water, int milk, int beans, int money) {
        if (contentList[0]  < water) {
            System.out.println("Sorry, not enough water!");
        } else if (contentList[1]  < milk) {
            System.out.println("Sorry, not enough milk!");
        } else if (contentList[2]  < beans) {
            System.out.println("Sorry, not enough coffee beans!");
        } else if (contentList[3]  < 1) {
            System.out.println("Sorry, not enough disposable cups!");
        } else {
            System.out.println("I have enough resources, making you a coffee!");
            contentList[0] -= water;
            contentList[1] -= milk;
            contentList[2] -= beans;
            contentList[3] --;
            contentList[4] += money;
        }
    }
}
