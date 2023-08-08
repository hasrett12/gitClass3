public class taskifelse {
    public static void main(String[] args) {

        double mortgageRate = 4.5;
        int price = 50000;

        if (mortgageRate > 4.5) {
            System.out.println(" you can not buy a house");
        } else {
            System.out.println(" you can buy");

            if (price > 500000) {
                System.out.println("you can will a loan");
            } else {
                System.out.println("you need a cash");

            }
        }
    }
}