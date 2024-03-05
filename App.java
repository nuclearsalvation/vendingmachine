import java.util.List;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception{
        Sweety sweety = new Sweety("Мармелад", "Тайный кондитер", 500.0, 750.0, "малина");
        System.out.println(sweety.displayInfo());
        List<Product> listProducts = new ArrayList<>();
        listProducts.add(sweety);
        VendingMachine vendingMachine = new VendingMachine(listProducts);
        Sweety sweety2 = new Sweety("1", "1", 300.0, 300.0, "x");
        sweety2 = vendingMachine.getSweety("Мармелад", "малина");
        System.out.println(sweety2.displayInfo());
    }
}
