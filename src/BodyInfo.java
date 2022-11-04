import java.util.Scanner;

public class BodyInfo {
    public double height;
    public double weight;
    public double endeks;

    public BodyInfo() {
    }

    public BodyInfo(double height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    public double vucutEndeks(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen metre cinsinden boyunuzu giriniz.");
        height= scan.nextDouble();
        System.out.println("Lütfen kilonuzu giriniz..");
        weight= scan.nextDouble();
        endeks= weight/(Math.pow(height,2));
        System.out.println("Vücut kitle endeksiniz: "+endeks);
        return endeks;
    }
}
