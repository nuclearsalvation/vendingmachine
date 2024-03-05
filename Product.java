public class Product{

    protected String name;
    protected String brand;
    protected Double price;
    public String getName(){
        return name;
    }
    private void processName(String name){
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else{
            this.name = name;
        }
    }
    public void setName(String name){
        processName(name);
    }
    private void processBrand(String brand){
        if (brand == null || brand.length() < 3){
            this.brand = "<BRAND>";
        }
        else{
            this.brand = brand;
        }
    }
    public void setBrand(String brand){
        processBrand(brand);
    }
    public String getBrand(){
        return brand;
    }
    private void processPrice(Double price){
        if (price < 300 ){
            this.price = 300.0;
        }
        else{
            this.price = price;
        }
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(Double price){
        processPrice(price);
    }
    public Product(String name, String brand, Double price){
        processName(name);
        processBrand(brand);
        processPrice(price);
    }
    public Product(String name, Double price){
        this(name, "<BRAND>", price);
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else{
            this.name = name;
        }
        if (price < 300){
            this.price = 300.0;
        }
        else{
            this.price = price;
        }
    }
    public Product(String name){
        this(name, 300.0);
        if (name == null || name.length() < 3){
            this.name = "<NAME>";
        }
        else{
            this.name = name;
        }
    }
    public String displayInfo(){
        return String.format("%s - %s - %.2f",brand, name, price);
    }
}
