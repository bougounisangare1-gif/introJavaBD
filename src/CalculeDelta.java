import java.util.Scanner;
public class CalculeDelta {
    public static void main(String[]args){
       Scanner sc =new Scanner(System.in);
       double a,b,c;
       double delta,x1,x2;
       System.out.println("Résolution de l'equation ax^2 + ax + c");
       System.out.print("Entrer a :");
       a=sc.nextDouble();
        System.out.print("Entrer b :");
        b=sc.nextDouble();
        System.out.print("Entrer c :");
        c=sc.nextDouble();
        //CAS 1 : a=0 et b!=0
        if(a==0 && b !=0){
            double x=-c/b;
            System.out.println("Equation du premier degré");
            System.out.println("Solution X="+x);
        }
        //CAS 2 : a=0 et b=0
        else if(a==0 && b==0){
            if(c==0){
                System.out.println("Infinité de solution");
            }
        }
        //CAS 3 : a!=0(equation du second degré)
        else{
            delta=b*b - 4*a*c;
            if(delta>0){
                x1 = (-b-Math.sqrt(delta)) / (2*a);
                x2 = (-b+Math.sqrt(delta)) / (2*a);
                System.out.println("Deux solution réelles :");
                System.out.println("x1 = " + x1);
                System.out.println("x2 = " + x2);
            }
            else if(delta==0){
                x1=-b /(2+a);
                System.out.println("Une solution double : x=" +x1);
            }
            else{
                System.out.println("Pas de solution réelle");
            }
        }
        sc.close();
    }
}
