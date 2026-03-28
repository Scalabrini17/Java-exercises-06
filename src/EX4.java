
//Pressão Arterial
import java.util.Scanner;

public class EX4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);     

        System.out.print("Indique o PAS (pressão arterial sistólica) do paciente: ");
        float PAS = sc.nextFloat();

        System.out.print("Indique o PAD (pressão arterial diastólica) do paciente: ");
        float PAD = sc.nextFloat();
        
        float PASgrau = 0;
        float PADgrau = 0;

        String PASsituacao = "";
        String PADsituacao = "";
       
        //PAS
        if (PAS < 120){
            PASgrau = 1;
            PASsituacao = "ÓTIMO";

        }else if (PAS >= 120 && PAS <=129){
            PASgrau = 2;
            PASsituacao = "Normal";
            
        }else if (PAS >= 130 && PAS <=139){
            PASgrau = 3;
            PASsituacao = "Limítrofe";
            
        }else if (PAS >= 140 && PAS <=159){
            PASgrau = 4;
            PASsituacao = "Hipertensão Grau 1";
            
        }else if (PAS >= 160 && PAS <=179){
            PASgrau = 5;
            PASsituacao = "Hipertensão Grau 2";
            
        }else if (PAS >= 180){
            PASgrau = 6;
            PASsituacao = "Hipertensão Grau 3";
        }
        
        //PAD
        if (PAD < 80){
            PADgrau = 1;
            PADsituacao = "ÓTIMO";

        }else if (PAD >= 80 && PAS <=84){
            PADgrau = 2;
            PADsituacao = "Normal";
            
        }else if (PAD >= 85 && PAS <89){
            PADgrau = 3;
            PADsituacao = "Limítrofe";
            
        }else if (PAD >= 90 && PAS <=99){
            PADgrau = 4;
            PADsituacao = "Hipertensão Grau 1";
            
        }else if (PAD >= 100 && PAS <=109){
            PADgrau = 5;
            PADsituacao = "Hipertensão Grau 2";
            
        }else if (PAD >= 110){
            PADgrau = 6;
            PADsituacao = "Hipertensão Grau 3";
        }

        if (PASgrau > PADgrau){
            System.out.printf("A pressão arterial do paciente está %s !", PASsituacao);
        }else{
            System.out.printf("A pressão arterial do paciente está %s !", PADsituacao);
        }

    }
}
