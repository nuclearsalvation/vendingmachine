public class BottleOfWater extends Product{
    private Double volume;
    public Double getVolume(){
        return volume;
    }
    public void setVolume(Double volume){
        this.volume = volume;
    }
    public BottleOfWater(String name, String brand, Double price, Double volume){
        super(name, brand, price);
        this.volume = volume;

    }
    public String displayInfo(){
        return String.format("Бутылка с водой\n\t[Производитель: %s\n\tНаименование: %s\n\tСтоимость: %.2f\n\tОбъем: %.2f]", brand, name, price, volume);
    }
}