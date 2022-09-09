import java.awt.*;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        String name=new String("Mississippi");
        name=name.replace("i","ii");
        System.out.println(name.length());
        name=name.replace("ss","s");
        System.out.println(name.length());
    }
}
