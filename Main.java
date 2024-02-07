import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
            Pair<String,String> girdi = new Pair("Nisa","Pride and Prejudice");
            Pair<String,String> girdi2 = new Pair("Nisa","The Great Gatsby");
            Pair<String,String> girdi3 = new Pair("Ataberk","To Kill A Mockingbird");
            Pair<String,String> girdi4 = new Pair("Ismail","The Great Gatsby");
            Pair<String,String> girdi5 = new Pair("Ismail","Brave New World");
            Pair<String,String> girdi6 = new Pair("Nisa","Brave New World");
            Pair<String,String> girdi7 = new Pair("Alperen","Brave New World");
            Pair<String,String> girdi8 = new Pair("Oguzhan","Pride and Prejudice");
            ArrayList<Pair<String,String>> kayitlar = new ArrayList<>();
            kayitlar.add(girdi);
            kayitlar.add(girdi2);
            kayitlar.add(girdi3);
            kayitlar.add(girdi4);
            kayitlar.add(girdi5);
            kayitlar.add(girdi6);
            kayitlar.add(girdi7);
            kayitlar.add(girdi8);
            Kutuphane k = new Kutuphane();
            k.topluKayit(kayitlar);
            k.ozetGec();
            System.out.println("En cok kitap okuyan:\t\t" +
                    k.enCokKitapOkuyan());
            System.out.println("En az okunan kitap:\t\t" + k.enAzOkunanKitap());
            System.out.println("Toplam alinan kitap sayisi:\t" +
                    k.toplamAlinanKitapSayisi());
            System.out.println("Toplam okuyucu sayisi:\t\t" +
                    k.toplamOkuyucuSayisi());
        }

    }
