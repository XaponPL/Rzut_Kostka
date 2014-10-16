import java.util.Random;

public class rzuty_kostka {

    
    public static void main(String[] args) {
        int rzutKomputera =0;
        int wyborKomp =0;
        int trafGracza = 0;
        
        PlayerComp a = new PlayerComp();
        PlayerHum b = new PlayerHum();
        do{
        Random rzut = new Random();
        Random wybor  =new Random();
        rzutKomputera = wybor.nextInt(6)+1;
        wyborKomp = a.guess();
        trafGracza = b.guess();
        
        System.out.println("rzut koscia "+rzutKomputera);
        System.out.println("strzal "+wyborKomp);
        System.out.println("sztrzal humana "+trafGracza);
        if(rzutKomputera==wyborKomp||rzutKomputera==trafGracza)System.out.println("brawo");
        else System.out.println("zle");
        }while(rzutKomputera!=wyborKomp);
        
        
        
        
    }
}
