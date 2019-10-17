package gates;

public class NANDGate {
    private int A;
    private int B;

    public NANDGate(int AA, int BB) {
        this.A = AA;
        this.B = BB;
    }

    public NANDGate() {
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
            output = 0;
        } else {
            output = 1;
        }
        return output;
    }

    private void printOutput(int input1, int input2) {
        NANDGate myobj1 = new NANDGate();
        System.out.println(myobj1.getOutput(input1, input2));
    }


    public void printTruthTable() {
        System.out.println("----Truth Table For NAND Gate----");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(i + " NAND " + j + " results ");
                NANDGate my = new NANDGate(i, j);
                my.printOutput(my.A, my.B);

            }

        }

    }
}
