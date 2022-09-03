public class Problem06 {
    public Problem06(){

    }
    public String gimmeNumbers(){
        String lotsOfNums = "Squares: \n";
        for(int i = 0; i!=51;i++){
            lotsOfNums+= String.valueOf(i*i) + "\n";
        }
        lotsOfNums+= "Cubes: \n";
        for(int i = 0; i!=51;i++){
            lotsOfNums+= String.valueOf(i*i*i) + "\n";
        }
        return lotsOfNums;
    }
}
