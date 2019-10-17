package gates;

public class XORGate {
    private int A;
    private int B;

    public XORGate(int AA, int BB) {
        this.A = AA;
        this.B = BB;
    }

    public XORGate() {
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
        if (input1 == input2 ) {
            output = 0;
        } else {
            output = 1;
        }
        return output;
    }

    private void printOutput(int input1, int input2) {
        XORGate myobj1 = new XORGate();
        System.out.println(myobj1.getOutput(input1, input2));
    }


    public void printTruthTable() {
        System.out.println("----Truth Table For XOR Gate----");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(i + " XOR " + j + " results ");
                XORGate my = new XORGate(i, j);
                my.printOutput(my.A, my.B);

            }

        }

    }
}
