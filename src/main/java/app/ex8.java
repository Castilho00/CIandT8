package app;

import java.util.Scanner;

public class ex8 {

    public static Double calculoKm(double TF, double VQR, double km){
        return TF  + VQR * km;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Taxa fixa Empresa 1:");
        String TF1 = input.nextLine();
        System.out.print("Taxa por quilometro Empresa 1:");
        String VQR1 = input.nextLine();
        System.out.print("Taxa fixa Empresa 2:");
        String TF2 = input.nextLine();
        System.out.print("Taxa por quilometro Empresa 2:");
        String VQR2 = input.nextLine();

        TF1.replaceAll( "," , "." );
        VQR1.replaceAll( "," , "." );
        TF2.replaceAll( "," , "." );
        VQR2.replaceAll( "," , "." );

        double T1 = Double.parseDouble(TF1);
        double V1 = Double.parseDouble(VQR1);
        double T2 = Double.parseDouble(TF2);
        double V2 = Double.parseDouble(VQR2);

        double km = 1.0;
        double Emp1=0;
        double Emp2=0;

        for (int i=0; i<20; i++) {
            km += i;
            Emp1 = calculoKm(T1, V1, km);
            Emp2 = calculoKm(T2, V2, km);
        }

        if (Emp1 > Emp2) {
            System.out.printf("Empresa 1 quando distancia < %f", km);
        } else if (Emp2 > Emp1) {
            System.out.printf("Empresa 2 quando distancia < %f", km);
        } else {
            System.out.printf("tanto faz quando distancia = %f", km);
        }

        input.close();
    }

}
