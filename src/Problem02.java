public class Problem02 {
    public Problem02() {

    }

    /*
    The restaurant bill for three people is $18.45, and they want to leave a 15% tip.
    Calculate what each person should pay.
     */
    public String getTotal() {
        double total = 18.45;
        double totalTip = total * 1.15;
        double costPerPerson = totalTip / 3;
        return String.valueOf(costPerPerson);
    }
}
