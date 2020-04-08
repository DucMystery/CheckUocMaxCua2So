import java.util.Scanner;

public class Solve {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Moi nhap vao so a:");
        int a = scanner.nextInt();
        System.out.println("Moi nhap vao so b:");
        int b = scanner.nextInt();
        int max =1;
        for (int i=1;i<b;i++){
            if (b%i==0 && a%i==0 && i>max){
                max =i;
            }
        }
        System.out.println("Ước chung lớn nhất của "+a+" và "+b+" là: "+max);
    }
}
