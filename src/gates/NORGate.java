package gates;

public class NORGate {
    private int A;
    private int B;

    public NORGate(int AA, int BB) {
        this.A = AA;
        this.B = BB;
    }

    public NORGate() {
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
        if (input1 == 0 && input2 == 0) {
            output = 1;
        } else {
            output = 0;
        }
        return output;
    }

    private void printOutput(int input1, int input2) {
        NORGate myobj1 = new NORGate();
        System.out.println(myobj1.getOutput(input1, input2));
    }


    public void printTruthTable() {
        System.out.println("----Truth Table For NOR Gate----");
        for (int i = 0; i <= 1; i++) {
            for (int j = 0; j <= 1; j++) {
                System.out.print(i + " NOR " + j + " results ");
                NORGate my = new NORGate(i, j);
                my.printOutput(my.A, my.B);

            }

        }

    }
}
