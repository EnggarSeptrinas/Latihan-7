package Polimorfisme;
import java.util.Scanner;
public class BidangMain {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;
        int pil;
        do{
            System.out.println("    PROGRAM MENGHITUNG LUAS DAN VOLUME BIDANG   ");
            System.out.println("================================================");
            System.out.println("1.Luas dan Keliling Persegi");
            System.out.println("2.Luas dan Keliling Persegi Panjang");
            System.out.println("3.Luas dan Keliling Lingkaran");
            System.out.println("4.Luas dan Keliling Segitiga");
            System.out.println("5.Volume Balok");
            System.out.println("6.Volume Kubus");
            System.out.println("7.Volume Bola");
            System.out.println("8.Volume Limas Segitiga");
            System.out.println("9.Volume Tabung");
            System.out.println("10.Keluar");
            System.out.print("Masukan Bidang Yang ingin Anda Cari     \t:");
            pilihan = input.nextInt();
            BidangBalok B1 = new BidangBalok();
            BidangKubus B2 = new BidangKubus();
            BidangBola B3 = new BidangBola();
            BidangLimasSegitiga B4 = new BidangLimasSegitiga();
            BidangTabung B5 = new BidangTabung();
            
            switch(pilihan){
                case 1 : System.out.println("     Luas dan Keliling Persegi         ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Sisi Peresgi       \t:");
                         double SisiP = input.nextDouble();
                         B2.setSisi(SisiP);
                         B2.setLuas();
                         B2.setKeliling();
                         System.out.println("Luas Bidang Adalah        \t:"+B2.getLuas());
                         System.out.println("Keliling Bidang Adalah    \t:"+B2.getKeliling());
                         break;
                case 2 : System.out.println(" Luas dan Keliling Persegi Panjang     ");
                         System.out.println("---------------------------------------");   
                         System.out.print("Masukan Panjang            \t:");
                         double Panjang = input.nextDouble();
                         System.out.print("Masukan Lebar              \t:");
                         double Lebar = input.nextDouble();
                         B1.setPanjang(Panjang);
                         B1.setLebar(Lebar);
                         B1.setLuas();
                         B1.setKeliling();
                         System.out.println("Luas Bidang Adalah         \t:"+B1.getLuas());
                         System.out.println("Keliling Bidang Adalah     \t:"+B1.getKeliling());
                         break;
                case 3 : System.out.println("     Luas dan Keliling Lingkaran       ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Jari-jari          \t:");
                         double jarijari = input.nextDouble();
                         B3.setJari(jarijari);
                         B3.setLuas();
                         B3.setKeliling();
                         System.out.println("Luas Bidang Adalah         \t:"+B3.getLuas());
                         System.out.println("Keliling Bidang Adalah     \t:"+B3.getKeliling());
                         break;
                case 4 : System.out.println("     Luas dan Keliling Segitiga        ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Tinggi             \t:");
                         double Tinggi = input.nextDouble();
                         System.out.print("Masukan Alas               \t:");
                         double Alas = input.nextDouble();
                         B4.setAlas(Alas);
                         B4.setTinggi(Tinggi);
                         B4.setMiring();    
                         B4.setLuas();
                         B4.setKeliling();
                         System.out.println("Luas Bidang Adalah         \t:"+B4.getLuas());
                         System.out.println("Keliling Bidang Adalah     \t:"+B4.getKeliling());
                         break;
                case 5 : System.out.println("             Volume Balok              ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Tinggi             \t:");
                         double Tinggi1 = input.nextDouble();
                         System.out.print("Masukan Panjang            \t:");
                         double PanjangK = input.nextDouble();
                         System.out.print("Masukan Lebar              \t:");
                         double LebarK = input.nextDouble();
                         B1.setPanjang(PanjangK);
                         B1.setLebar(LebarK);
                         B1.setTinggi(Tinggi1);
                         B1.setVolume();
                         System.out.println("Volume Bidang Adalah       \t:"+B1.getVolume());
                         break;
                case 6 : System.out.println("             Volume Kubus              ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Sisi               \t:");
                         double SisiK = input.nextDouble();
                         B2.setSisi(SisiK);
                         B2.setVolume();
                         System.out.println("Volume Bidang Adalah       \t:"+B2.getVolume());
                         break;
                case 7 : System.out.println("             Volume Bola               ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Jari Jari          \t:");
                         double JarijariB = input.nextDouble();
                         B3.setJari(JarijariB);
                         B3.setVolume();
                         System.out.println("Volume Bidang Adalah       \t:"+B3.getVolume());
                         break;
                case 8 : System.out.println("             Volume Limas              ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan Tinggi S           \t:");
                         double Tinggi1L = input.nextDouble();
                         System.out.print("Masukan Alas S             \t:");
                         double AlasL = input.nextDouble();
                         System.out.print("Masukan Tinggi Limas       \t:");
                         double TinggiL = input.nextDouble();
                         B4.setTinggiLimas(TinggiL);
                         B4.setTinggi(Tinggi1L);
                         B4.setAlas(AlasL);
                         B4.setVolume();    
                         System.out.println("Volume Bidang Adalah       \t:"+B4.getVolume());
                         break;
                case 9 : System.out.println("             Volume Tabung             ");
                         System.out.println("---------------------------------------");
                         System.out.print("Masukan JariJari           \t:");
                         double JariJariT = input.nextDouble();
                         System.out.print("Masukan Tinggi Tabung      \t:");
                         double TinggiT = input.nextDouble();
                         B5.setJari(JariJariT);
                         B5.setTinggi(TinggiT);
                         B5.setVolume();
                         System.out.println("Volume Bidang Adalah       \t:"+B5.getVolume());
                         break;
                case 10 :System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI");
                         break;
                default :System.out.println("PILIHAN TIDAK TERSEDIA");
            }
            System.out.print("Hitung Bidang Lain Tekan 1/0?       :");
            pil = input.nextInt();
        }while(pil!=0);
        System.out.println("TERIMA KASIH TELAH MENGGUNAKAN PROGRAM INI");
    }
}