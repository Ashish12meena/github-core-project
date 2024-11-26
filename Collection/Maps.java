package Collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

interface vehicle {
    public void price(int price);
    public void name(String name);
}
class Car implements vehicle{
    private int price;
    private String name;

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void price(int price) {
        this.price = price;
    }

    @Override
    public void name(String name) {
         this.name = name;
    }
}
class MotorCycle implements vehicle{
    private int price;
    private String name;

    @Override
    public void price(int price) {
        this.price = price;
    }

    @Override
    public void name(String name) {
         this.name = name;
    }

}
public class Maps {
    public static void main(String[] args) {

        Car car = new Car();
        car.name("volvo");
        Car car1 = new Car();
        car1.name("maruti");
        Car car2 = new Car();
        car2.name("suxuki");
        Car car3 = new Car();
        car3.name("xuv");
        ArrayList<Car> arr = new ArrayList<>();
        arr.add(car1);
        arr.add(car2);
        arr.add(car);
        Map<Integer, ArrayList<Car>> map = new HashMap<>();
        map.put(1, arr);

        
        System.out.println(map.get(1).add(car3));
        
        map.forEach((key,value)->{
            System.out.println("key "+key+" value: "+value);
            value.forEach(item->System.out.println("item "+item.getName()));
        });  
    }
}
