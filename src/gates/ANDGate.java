package gates;

public class ANDGate {
    private int A;
    private int B;

    public ANDGate(int AA, int BB) {
        this.A = AA;
        this.B = BB;
    }

    public ANDGate() {
    }

    public int getA() {
        return A;
    }

    public void setA(int A) {
        this.A = A;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    private int getOutput(int input1, int input2) {
        int output;
        if (input1 == 1 && input2 == 1) {
            output = 1;
        } else {
            output = 0;
        }
        return output;
    }

    private void printOutput(int input1, int input2) {
        ANDGate myobj1 = new ANDGate();
        System.out.println(myobj1.getOutput(input1, input2));
    }


    public void printTruthTable() {
        System.out.println("----Truth Table For AND Gate----");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(i + " OR " + j + " results ");
                ANDGate my = new ANDGate(i, j);
                my.printOutput(my.A, my.B);

            }

        }

    }

}



