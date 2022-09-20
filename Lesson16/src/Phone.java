import java.util.Objects;

public class Phone {
    private long number;
    private String model;
    private double weight;
    Phone(){

    }
    Phone(String model, long number){
        this.number = number;
        this.model = model;
    }
    Phone(String model, long number, double weight){
        this(model, number);
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Phone)) return false;
        Phone phone = (Phone) o;
        return getNumber() == phone.getNumber() &&
                Double.compare(phone.getWeight(), getWeight()) == 0 &&
                getModel().equals(phone.getModel());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumber(), getModel(), getWeight());
    }

    @Override
    public String toString() {
        return "Телефон: " +
                "\nМодель: " + model +
                "\nНомер: " + number +
                "\nВес: " + weight;
    }

    public void setNumber(long number) { this.number = number; }

    public String getModel() { return model; }

    public void setModel(String model) { this.model = model; }

    public double getWeight() { return weight; }

    public void setWeight(double weight) { this.weight = weight; }

    public void receiveCall(){
        System.out.println("Звонит: Номер скрыт");
    }
    public void receiveCall(String nameCaller){
        System.out.println("Звонит: "+nameCaller);
    }
    public void receiveCall(String nameCaller, long numberCaller){
        System.out.println("Звонит: "+nameCaller+"\n Номер: "+numberCaller);
    }
    public long getNumber(){
        return number;
    }
    /*public void sendMessage(long numberRecipient){
        System.out.println("Номер телефона: "+numberRecipient);
    }*/
}
