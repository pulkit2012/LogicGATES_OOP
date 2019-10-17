package gates;

public class NOTGate {
    private int A;

    public NOTGate(int AA) {
        this.A = AA;
    }

    public NOTGate() {
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    private int getOutput(int input1) {
        int output;
        if (input1 == 0) {
            output = 1;
        } else {
            output = 0;
        }
        return output;
    }

    private void printOutput(int input1) {
        NOTGate myobj1 = new NOTGate();
        System.out.println(myobj1.getOutput(input1));
    }


    public void printTruthTable() {
        System.out.println("----Truth Table For OR Gate----");
        for (int i = 0; i <= 1; i++) {
            System.out.print("NOT " + i + " results ");
                NOTGate my = new NOTGate(i);
                my.printOutput(my.A);

        }

    }
}
