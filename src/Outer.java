import java.io.*;

public class Outer {

    private int value1, value2;

    public Outer(int value1, int value2) {
        super();
        this.value1 = value1;
        this.value2 = value2;
    }

    public boolean doSomethingImportant() {
        Inner inner = new Inner();
        return inner.swap();
    }

    private class Inner {
        boolean swap() {
            int temp = value2;

            value2 = value1;
            value1 = temp;

            return (value1 > value2);
        }
    }

    public int getValue1() {
        return value1;
    }

    public int getValue2() {
        return value2;
    }


    public static void main(String[] args) {
        Outer outer = new Outer(99, 42);

        if (outer.doSomethingImportant()){
            System.out.println("Value1 = " + outer.getValue1());
            System.out.println("Value2 = " + outer.getValue2());
        }
        else {
            System.out.println("Value2 = " + outer.getValue2());
            System.out.println("Value1 = " + outer.getValue1());
        }
    }
    public int readData(String filename) throws IOException {
        DataInputStream reader = null;
        int data = -1;

        try {
            FileReader filereader = new FileReader(filename);
            //reader = new DataInputStream();

            //data = reader.readInt();
        } finally {
            //reader.close();
        }

        return data;
    }
}