import java.util.Comparator;
import java.util.Scanner;

public class ProductMain {

    public static void main(String[] args) {

        //Scanner class to get input from user for the product class
        Scanner obj = new Scanner(System.in);
        Product[] productDetail = new Product[5];

        //Using for loop to get the inputs and storing it in the array
        for (int i = 0; i < productDetail.length; i++) {

            int pid = obj.nextInt();
            double price = obj.nextDouble();
            int quantity = obj.nextInt();

            System.out.println();

            productDetail[i] = new Product(pid, price, quantity);
        }

        for (Product product : productDetail) {
            System.out.println(product);
        }

        //initialization and looping to find the highest price of all products
        double highestPrice = productDetail[0].getPrice();
        int indexOfPid = 0;

        for (int i = 1; i < productDetail.length; i++) {

            if (highestPrice < productDetail[i].price) {
                highestPrice = productDetail[i].price;
                indexOfPid = i;
            }
        }
        System.out.println();
        System.out.println("The Product-Id(Pid) of the highest priced product: " + productDetail[indexOfPid].getPid());
        System.out.println();

        //Calling the Calculate method
        double totalAmountSpent = Calculate(productDetail);
        System.out.println("Total amount spent on all products= " + totalAmountSpent);

    }


    //Calculate Method to return the total amount spent on all products.
    private static double Calculate(Product[] productDetail) {
        double sum = 0;

        for (int i = 0; i < productDetail.length; i++) {
            sum += productDetail[i].price * productDetail[i].quantity;
        }
        return sum;
    }


}
