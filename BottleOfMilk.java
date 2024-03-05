
public class BottleOfMilk extends Product{
    private Double volume;
    private Double fat;
    public Double getVolume(){
        return volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
    public Double getFat(){
        return fat;
    }
    public void setFat(double fat){
        this.fat = fat;
    }
    public BottleOfMilk(String brand, String name, Double price, Double volume, Double fat){
        super(name, brand, price);
        this.volume = volume;
        this.fat = fat;

    }
    @Override
    public String displayInfo(){
        return String.format("Бутылка с молоком\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tОбъем: %.2f\n\tЖирность: %.2f]", brand, name, price, volume, fat);
    }


}