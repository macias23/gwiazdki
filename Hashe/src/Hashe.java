import java.util.ArrayList;
public class Hashe {
    public static String rzadNieparzysty(int rozmiarPola,int szerokosc){
        ArrayList<String>rzad=new ArrayList<>(rozmiarPola*szerokosc);
        for (int i=0;i< szerokosc;i++){
        if(i%2==0){
            for(int j=0;j<rozmiarPola;j++){
                rzad.add(" ");
            }
        }
        else {
            for(int j=0;j<rozmiarPola;j++){
                rzad.add("#");
            }
            }
        }
        return String.join(" ", rzad);
        }
    public static String rzadParzysty(int rozmiarPola,int szerokosc){
        ArrayList<String>rzad=new ArrayList<>(rozmiarPola*szerokosc);
        for (int i=0;i< szerokosc;i++) {
            if (i % 2 == 1) {
                for (int j = 0; j < rozmiarPola; j++) {
                    rzad.add(" ");
                }
            } else {
                for (int j = 0; j < rozmiarPola; j++) {
                    rzad.add("#");
                }
            }
        }
        return String.join(" ", rzad);
    }

    public static void szachownica(int rozmiarPola,int szerokosc, int wysokosc){
        for(int i=0;i<wysokosc;i++){
            if(i%2==1){
                for(int j=0;j<rozmiarPola;j++){
                    System.out.println(rzadParzysty(rozmiarPola,szerokosc));
                }
            }
            else{
                for (int j=0;j<rozmiarPola;j++){
                    System.out.println(rzadNieparzysty(rozmiarPola,szerokosc));
                }
            }
        }
    }

    public static void main(String[] args) {
        szachownica(2,6,6);

    }
}