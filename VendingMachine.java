import java.util.List;


public class VendingMachine{
    private List<Product> products;
    public VendingMachine(List<Product> products){
        this.products = products;
    }
    public BottleOfWater getBottleOfWater(String name, Double volume){
        for (Product product: products){
            if (product instanceof BottleOfWater){
                BottleOfWater bottleOfWater = (BottleOfWater) product;
                if (bottleOfWater.getName().equals(name) && bottleOfWater.getVolume() == volume){
                    return bottleOfWater;
                }
            }
            
        }
        return null;
    }
    public Sweety getSweety(String name, String taste){
        for (Product product: products){
            if (product instanceof Sweety){
                Sweety sweety = (Sweety) product;
                if (sweety.getName().equals(name) && sweety.getTaste().equals(taste)){
                    return sweety;
                }
            }
        }
        return null;
    }
    public Sweety getSweetyByTaste(String taste){
        for (Product product: products){
            if (product instanceof Sweety){
                Sweety sweety = (Sweety) product;
                if (sweety.getTaste().equals(taste)){
                    return sweety;
                }
            }
        }
        return null;

    }

}