package codeclan.com.tokyoattack.Kaiju;

/**
 * Created by user on 01/11/2017.
 */

public abstract class Kaiju {

    String name;
    Integer healthValue;
    Integer attackValue;


    public Kaiju( String name, Integer healthValue, Integer attackValue){

        this.name = name;
        this.healthValue= healthValue;
        this.attackValue = attackValue;
    }


    public String getName(){
        return this.name;
    }

    public Integer getHealthValue(){
        return this.healthValue;

    }

    public Integer getAttackValue(){
        return this.attackValue;

    }

    public String roar(){

        return "ROAR";
    }
}
