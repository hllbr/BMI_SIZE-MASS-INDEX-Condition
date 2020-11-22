
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Boyunuzu giriniz (örnek=1.85):");
        double boy = scn.nextDouble();
        System.out.println("Kilonuzu giriniz :");
        double kılo = scn.nextDouble();
        
        double result =(kılo)/(boy*boy);
        if(result>=30){
            System.out.println("YÜKSEK RİSKLİ SINIFTA BULUNUYORSUNUZ.(LÜTFEN BİR KLİNİK YARDIM ALINIZ)");
        }
        else if(result<30 && result>=25){
            System.out.println("Fazlalıklarınız bulunmakta Klinik bir yardım almanız tavsiye edilir.");
        }
        else if(result <25 && result>=18.5){
            System.out.println("İdeal kilo (Formunuzu korumanız için spor öneriyoruz)");
        }
        else if(result<18.5 && result>= 15){
            System.out.println("zayıf(Sağlığınız için iyi bir beslenme ve spor programına ihtiyacınız var)");
        }
        else if(result<15 && result>=0){
            System.out.println("İnsani şartların altında bir zayıflıktasınız hayati tehlike altındasınız...!!!");
        }else if(result<0){
            System.out.println("Programı kandırmaya çalışmayın orasını düşündük heralde(@Prince(hllbr) iyi ve sağlıklı bir ömür diler....)");
        }
        else{
            System.out.println("HATALI YADA YANLIŞ BİR TUŞLAMA YAPTINIZ...!!!");
        }
    }
    
}
