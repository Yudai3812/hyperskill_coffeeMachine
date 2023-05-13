package machine;

public class Print {
    public static void printContent(int[] contentList) {
        System.out.println("The coffee machine has:");
        System.out.println(contentList[0] + " ml of water");
        System.out.println(contentList[1] + " ml of milk");
        System.out.println(contentList[2] + " g of coffee beans");
        System.out.println(contentList[3] + " disposable cups");
        System.out.println("$" + contentList[4] + " of money");
    }
}
