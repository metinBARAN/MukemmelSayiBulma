import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int n,top=0;

        Scanner inp=new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        n=inp.nextInt();

        for (int i=1;i<n;i++){
            if (n%i==0){
                top+=i;

            }
            }if (n==top){
            System.out.println("Mukemmel sayidir: ");
        }else{
            System.out.println("Mukemmel sayi degildir");
        }

        }
    }


