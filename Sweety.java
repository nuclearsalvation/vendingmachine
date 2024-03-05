public class Sweety extends Product{
    private Double energyValue;
    public Double getenergyValue(){
        return energyValue;
    }
    public void setenergyValue(Double energyValue){
        this.energyValue = energyValue;
    }
    private String taste;
    public String getTaste(){
        return taste;
    }
    public void setTaste(String taste){
        this.taste = taste;
    }
    public Sweety(String name, String brand, Double price, Double energyValue, String taste){
        super(name, brand, price);
        this.energyValue = energyValue;
        this.taste = taste;

    }
    public String displayInfo(){
        return String.format("Сладости\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tКалорийность: %.2f\n\tВкус: %s]", brand, name, price, energyValue, taste);
    }
}