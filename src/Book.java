import java.io.IOException;
import java.util.Collections;
import java.util.Objects;
import java.util.Properties;

/**
 * Created by lalwa_000 on 18/03/2016.
 */
public class Book {
    private  String b;
    private double p;
    private Double dd;
    private static  String pub = "Hello";

    public  static String getPub() {
        return pub;
    }
    public  Book(String b,Double p)
    {
           this.b= b;
           this.dd = p;
    }

    public  Book(String a,String b,double p)
    {
        this(b,20.0);
    }

    public Book (String... arr){
        Properties p = new Properties();

        try {
            p.load(this.getClass().getResourceAsStream(""));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }




    public static void main(String[] args) {
        //Book b = new Book("t",2);
        Book bb = new Book("st");

       //System.out.println( b.getPub());
        System.out.println( Book.getPub());

        ItemType t =  ItemType.valueOf("Project");

    }

}
