import java.lang.*;
public class Problem07 {
    public Problem07(){

    }
    public String pizzaStuff(int[] sizes){
        int pizzaSize = 0;
        String list = "Sizes from 6-16inches: \n";
        for(int i = 0; i!=11; i++){
            pizzaSize = (int) (Math.PI*((sizes[i]/2)*(sizes[i]/2)));
            list += String.valueOf(pizzaSize) + "\n";
        }
        return list;
    }
}
