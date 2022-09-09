import java.awt.*;
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        int w,h;
        Scanner input=new Scanner(System.in);
        System.out.println("enter width:");
        w= input.nextInt();
        System.out.println("enter height:");
        h= input.nextInt();
        Rectangle a=new Rectangle(w,h);
        System.out.println("actual perimeter="+2*(a.getWidth()+ a.getHeight()));
        System.out.println("expected perimeter="+2*(h+w));


    }
}
