import java.util.Scanner;

class BloodData {
    private String bloodType;
    private String rhFactor;

    public void setBloodType(String bt) {
        bloodType = bt;
    }

    public void setRhFactor(String rh) {
        rhFactor = rh;
    }

    public String getBloodType() {
        return bloodType;
    }

    public String getRhFactor() {
        return rhFactor;
    }

    public void display() {
        System.out.println(getBloodType() + getRhFactor() + " is added to the blood bank.");
    }
}

public class RunBloodData {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        BloodData bd = new BloodData();

        System.out.print("Enter blood type of patient: ");
        String bt = input.nextLine();
        if (!bt.isEmpty()) {
            bd.setBloodType(bt);
        } else {
            bd.setBloodType("O"); // default blood type
        }

        System.out.print("Enter the Rhesus factor (+ or -): ");
        String rh = input.nextLine();
        if (!rh.isEmpty()) {
            bd.setRhFactor(rh);
        } else {
            bd.setRhFactor("+"); // default Rhesus factor
        }

        bd.display();
    }
}