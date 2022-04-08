package carpet_cost_calculetion;

public class Calculator {
    Floor floor;
    Carpet Carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor=floor;
        this.Carpet=carpet;
    }
    public double getTotalCost(){
        return floor.getArea()* Carpet.getCost();
    }
}
