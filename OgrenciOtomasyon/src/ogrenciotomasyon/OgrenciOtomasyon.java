package ogrenciotomasyon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class OgrenciOtomasyon {
    
    Scanner scan= new Scanner(System.in);
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        
        class UyeId{
            String kAdi= null;
            String Sifre= null;
        }
        class Notlar{
            
            String not;
        }
        class Ogrenci extends UyeId{
            private void notGoruntule(){
            }
            private void dersGoruntule(){
            }
        }
        class Ogretmen extends UyeId{
            private void notGir(){
            }
            private void ogrenciListele(){
            }
        }
        class Memur extends UyeId{
            private void ogrenciBelgesi(){
            }
            
        }
        
        UyeId ogrenci[]= new UyeId[100];
        UyeId ogretmen[]= new UyeId[100];
        UyeId memur[]= new UyeId[100];
        Notlar not[]=new Notlar[100];
        
        
        int ogrenciSayisi= 0, ogretmenSayisi= 0, memurSayisi=0,notSayisi=0, x= 0, i;
        FileReader fileReader = new FileReader("ogrenci.txt");
        String line;
        StringTokenizer st;
        BufferedReader br = new BufferedReader(fileReader);
        x= 0;
        while((line = br.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    ogrenci[i] = new UyeId();
                    ogrenci[i].kAdi = st.nextToken();
                    break;
                }
                for(i= x;; i++) {
                    ogrenci[i].Sifre= st.nextToken();
                    break;
                }
                ogrenciSayisi = x;
                x++;
            }
        }
        br.close();
        
        FileReader fileReaderr= new FileReader("ogretmen.txt");

        BufferedReader brr= new BufferedReader(fileReaderr);
        x= 0;
        while((line = brr.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    ogretmen[i] = new UyeId();
                    ogretmen[i].kAdi = st.nextToken();
                    break;
                }
                for(i= x;; i++) {
                    ogretmen[i].Sifre= st.nextToken();
                    break;
                }
                ogretmenSayisi = x;
                x++;
            }
        }
        brr.close();
        
        FileReader fileReaderr2= new FileReader("memur.txt");

        BufferedReader brr2= new BufferedReader(fileReaderr2);
        x= 0;
        while((line = brr2.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    memur[i] = new UyeId();
                    memur[i].kAdi = st.nextToken();
                    break;
                }
                for(i= x;; i++) {
                    memur[i].Sifre= st.nextToken();
                    break;
                }
                memurSayisi = x;
                x++;
            }
        }
        brr.close();
        
        FileReader fileReade= new FileReader("notlar.txt");

        BufferedReader b= new BufferedReader(fileReade);
        x= 0;
        while((line = b.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    not[i] = new Notlar();
                    not[i].not = st.nextToken();
                    break;
                }
                notSayisi = x;
                x++;
            }
        }
        brr.close();
        
        Scanner scan= new Scanner(System.in);
        int secim;
        int giris= 1;
        do{
            baslangic:
            System.out.printf("1-Üye Girişi\n");
            System.out.printf("2-Yeni Uyelik\n");
            System.out.printf("Lütfen seçiminizi giriniz:");

            secim= scan.nextInt();
            
            if (secim== 1) {
                
                do{
                    if(secim== 9) {
                        return;
                    }
                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                    System.out.printf("1-Ogrenci Girisi\n");
                    System.out.printf("2-Ogretmen Girisi\n");
                    System.out.printf("3-Memur Girisi\n");
                    System.out.printf("Lütfen seçiminizi giriniz:");
                    secim= scan.nextInt();
                    
                    if(secim==1){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Ogrenci id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogrenciSayisi; i++){
                            if (ogrenci[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (ogrenci[i].Sifre == null ? sifre == null : ogrenci[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 9;
                                    
                                    bslgn:
                                    do{
                                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                                    System.out.printf("1-Dersleri goruntule\n");
                                    System.out.printf("2-Notlari goruntule\n");
                                    System.out.printf("3-Cikis\n");
                                    System.out.printf("Lütfen seçiminizi giriniz:");
                                    secim= scan.nextInt();
                                    if(secim==1){
                                        
                                        File file = new File("dersler.txt");
                                        BufferedReader reader = null;
                                        reader = new BufferedReader(new FileReader(file));
                                        String sira = reader.readLine();
 
                                     while(sira!=null) {
            	
                                        System.out.println(sira);
               
                                        sira= reader.readLine();
                                        
                                    }
                                    }else if(secim==2){
                                        File file = new File("notlar.txt");
                                        BufferedReader reader = null;
                                        reader = new BufferedReader(new FileReader(file));
                                        String sira = reader.readLine();
 
                                     while(sira!=null) {
            	
                                        System.out.println(sira);
               
                                        sira= reader.readLine();
                                    }
        
                                    break;
                                    }else if(secim==3);
                                    System.out.println("İyi gunler.");
                                   
                                    break;
                                    }while(secim==0);
                                    
                                    
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
            
                    }else if(secim==2){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Ogretmen id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogretmenSayisi; i++){
                            if (ogretmen[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (ogretmen[i].Sifre == null ? sifre == null : ogretmen[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 0;
                                    break;
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
                        do{
                            System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                            System.out.printf("1-Not gir\n");
                            System.out.printf("2-Ogrenci Listele\n");
                            System.out.printf("3-Cikis\n");
                            System.out.printf("Lütfen seçiminizi giriniz:");
                            secim= scan.nextInt();
                         if (secim== 1) {
                            String n;
                            System.out.printf("Not Giriniz:");
                                    n= scan.next();
                                    File dosya = new File("notlar.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + n );
                                    yaz.close();
                                    //not[notSayisi].not = n;
                                    
                                    notSayisi++;
                                    break;
                                
                          }
                            
                              if(secim==2){
                                        
                                        File file = new File("ogrenci.txt");
                                        BufferedReader reader = null;
                                        reader = new BufferedReader(new FileReader(file));
                                        String sira = reader.readLine();
 
                                        while(sira!=null) {
            	
                                        System.out.println(sira);
               
                                        sira= reader.readLine();
                                        
                                    }
                                }

                        }while(secim==0);
                    }else if(secim==3){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Memur id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogretmenSayisi; i++){
                            if (memur[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (memur[i].Sifre == null ? sifre == null : memur[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 0;
                                    do{
                                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                                    System.out.printf("1-Ogrenci Belgesi ver\n");
                                    System.out.printf("3-Cikis\n");
                                    secim= scan.nextInt();   
                                    
                                    if(secim==1){
                                        for(i = 0; i <= ogrenciSayisi - 1; i++){
                                        System.out.println((i + 1)+"-" + ogrenci[i].kAdi+" ");
                                    }
                                     System.out.println("Hangi ogrenciye belge vermek istersiniz::");
                    int a= scan.nextInt();
                    ogrenci[a-1]= new Ogrenci();
                    ogrenci[a-1].kAdi=ogrenci[a-1].kAdi;
                    
                    File sepet = new File("ogrenciBelgesi.txt");
                                    FileWriter yazici = new FileWriter(sepet, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write(ogrenci[a-1].kAdi + " isimli kisi okulumuzun ogrencisidir. \n");
                                    yaz.close();
                secim = 0;   
                                        
                                        
                                    }
                                    }while(secim==0);
                                    
                                    
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
                    }    
                }while(secim==0);
                        
            }else if(secim==2){
                         
                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                    System.out.printf("1-Ogrenci Uyeligi\n");
                    System.out.printf("2-Ogretmen Uyeligi\n");
                    System.out.printf("3-Memur Uyeligi\n");
                    System.out.printf("Lütfen seçiminizi giriniz:");
                    secim= scan.nextInt();
                    
                    if(secim==1){
                        
                        String kuAdi,sifre;
                        System.out.printf("Ogrenci id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= ogrenciSayisi; i++) {
                            if (ogrenci[i].kAdi == null ? kuAdi == null : ogrenci[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("ogrenci.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    ogrenci[ogrenciSayisi].kAdi = kuAdi;
                                    ogrenci[ogrenciSayisi].Sifre = sifre;
                                    ogrenciSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }else if(secim==2){
                        String kuAdi,
                                sifre;
                        System.out.printf("Ogretmen id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= ogretmenSayisi; i++) {
                            if (ogretmen[i].kAdi == null ? kuAdi == null : ogretmen[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("ogretmen.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    ogretmen[ogretmenSayisi].kAdi = kuAdi;
                                    ogretmen[ogretmenSayisi].Sifre = sifre;
                                    ogretmenSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }else if(secim==3){
                        String kuAdi,
                                sifre;
                        System.out.printf("Memur id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= memurSayisi; i++) {
                            if (memur[i].kAdi == null ? kuAdi == null : memur[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("memur.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    memur[memurSayisi].kAdi = kuAdi;
                                    memur[memurSayisi].Sifre = sifre;
                                    memurSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    }
            
            
            
            
            
        }while(secim==0);
        
    }
}

/*
package ogrenciotomasyon;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;
import java.io.*;


public class OgrenciOtomasyon {
    
    Scanner scan= new Scanner(System.in);
    
    public static void main(String[] args) throws FileNotFoundException, IOException{
        
        
        class UyeId{
            String kAdi= null;
            String Sifre= null;
        }
        class Ogrenci extends UyeId{
            private void notGoruntule(){
            }
            private void dersGoruntule(){
            }
        }
        class Ogretmen extends UyeId{
            private void notGir(){
            }
            private void ogrenciListele(){
            }
        }
        class Memur extends UyeId{
            private void ogrenciBelgesi(){
            }
            
        }
        UyeId uye[]= new UyeId[100];
        
        int ogrenciSayisi= 0, ogretmenSayisi= 0, memurSayisi=0, x= 0, i;
        FileReader fileReader = new FileReader("ogrenci.txt");
        String line;
        StringTokenizer st;
        BufferedReader br = new BufferedReader(fileReader);
        x= 0;
        while((line = br.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    uye[i] = new UyeId();
                    uye[i].kAdi = st.nextToken();
                    break;
                }
                for(i= x;; i++) {
                    uye[i].Sifre= st.nextToken();
                    break;
                }
                ogrenciSayisi = x;
                x++;
            }
        }
        br.close();
        
        FileReader fileReaderr= new FileReader("ogretmen.txt");

        BufferedReader brr= new BufferedReader(fileReaderr);
        x= 0;
        while((line = brr.readLine())!= null){
            st= new StringTokenizer(line);
            while(st.hasMoreTokens()){
                for(i= x;; i++){
                    uye[i] = new UyeId();
                    uye[i].kAdi = st.nextToken();
                    break;
                }
                for(i= x;; i++) {
                    uye[i].Sifre= st.nextToken();
                    break;
                }
                ogretmenSayisi = x;
                x++;
            }
        }
        brr.close();
        
        Scanner scan= new Scanner(System.in);
        int secim;
        int giris= 1;
        do{
            baslangic:
            System.out.printf("1-Üye Girişi\n");
            System.out.printf("2-Yeni Uyelik\n");
            System.out.printf("Lütfen seçiminizi giriniz:");

            secim= scan.nextInt();
            
            if (secim== 1) {
                
                do{
                    if(secim== 9) {
                        return;
                    }
                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                    System.out.printf("1-Ogrenci Girisi\n");
                    System.out.printf("2-Ogretmen Girisi\n");
                    System.out.printf("3-Memur Girisi\n");
                    System.out.printf("Lütfen seçiminizi giriniz:");
                    secim= scan.nextInt();
                    
                    if(secim==1){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Ogrenci id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogrenciSayisi; i++){
                            if (uye[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (uye[i].Sifre == null ? sifre == null : uye[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 9;
                                    break;
                                    
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
            
                    }else if(secim==2){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Ogretmen id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogretmenSayisi; i++){
                            if (uye[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (uye[i].Sifre == null ? sifre == null : uye[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 9;
                                    break;
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
                    }else if(secim==3){
                        String kuAdi;
                        String sifre;

                        System.out.printf("Memur id giriniz:");
                        kuAdi= scan.next();
                        for(i= 0; i < ogretmenSayisi; i++){
                            if (uye[i].kAdi.equals(kuAdi)){
                                giris= 1;
                                System.out.printf("Şifrenizi Giriniz:");
                                sifre = scan.next();
                                if (uye[i].Sifre == null ? sifre == null : uye[i].Sifre.equals(sifre)) {
                                    System.out.printf("Giriş Başarılı\n");
                                    secim = 9;
                                    break;
                                }else{
                                    System.out.printf("Hatalı şifre!");
                                    break;
                                }
                            }

                        }
                        if(giris== 0){
                            System.out.printf("Böyle bir kullanıcı bulunmuyor.");
                        }
                    }    
                }while(secim==0);
                        
            }else if(secim==2){
                         
                    System.out.printf("Hangi işlemi yapmak istiyorsunuz?\n");
                    System.out.printf("1-Ogrenci Uyeligi\n");
                    System.out.printf("2-Ogretmen Uyeligi\n");
                    System.out.printf("3-Memur Uyeligi\n");
                    System.out.printf("Lütfen seçiminizi giriniz:");
                    secim= scan.nextInt();
                    
                    if(secim==1){
                        
                        String kuAdi,sifre;
                        System.out.printf("Ogrenci id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= ogrenciSayisi; i++) {
                            if (uye[i].kAdi == null ? kuAdi == null : uye[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("ogrenci.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    uye[ogrenciSayisi].kAdi = kuAdi;
                                    uye[ogrenciSayisi].Sifre = sifre;
                                    ogrenciSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }else if(secim==2){
                        String kuAdi,
                                sifre;
                        System.out.printf("Ogretmen id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= ogretmenSayisi; i++) {
                            if (uye[i].kAdi == null ? kuAdi == null : uye[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("ogretmen.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    uye[ogretmenSayisi].kAdi = kuAdi;
                                    uye[ogretmenSayisi].Sifre = sifre;
                                    ogretmenSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }else if(secim==3){
                        String kuAdi,
                                sifre;
                        System.out.printf("Memur id giriniz:");
                        kuAdi = scan.next();
                        for (i = 0; i <= memurSayisi; i++) {
                            if (uye[i].kAdi == null ? kuAdi == null : uye[i].kAdi.equals(kuAdi)) {
                                System.out.printf("Böyle bir kullanıcı kaydı zaten var.");
                                break;
                            } else {
                                try {
                                    System.out.printf("Şifrenizi Giriniz:");
                                    sifre= scan.next();
                                    File dosya = new File("memur.txt");
                                    FileWriter yazici = new FileWriter(dosya, true);
                                    BufferedWriter yaz = new BufferedWriter(yazici);
                                    yaz.write("\n" + kuAdi + " " + sifre);
                                    yaz.close();
                                    System.out.println("Üyeliğiniz oluşturuldu.");
                                    uye[memurSayisi].kAdi = kuAdi;
                                    uye[memurSayisi].Sifre = sifre;
                                    memurSayisi++;
                                    break;
                                } catch (Exception hata) {
                                    hata.printStackTrace();
                                }
                            }
                        }
                        secim= 0;
                        break;
                    }
                    
                    
                    
                    
                    
                    
                    
                    
                    
                    }
            
            
            
            
            
        }while(secim==0);
        
    }
}
*/