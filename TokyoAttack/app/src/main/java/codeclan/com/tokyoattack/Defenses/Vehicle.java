package codeclan.com.tokyoattack.Defenses;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Vehicle {
    String type;
    Integer healthValue;


    public Vehicle(String type, Integer healthValue){
        this.type = type;
        this.healthValue = healthValue;
    }

}
