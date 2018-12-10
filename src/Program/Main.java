package Program;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    public static void Buffer() throws IOException  {
        try {
            BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
            
            String nama;
            
            System.out.print("Masukkan nama : ");
            nama = m.readLine();
            System.out.print("masukkan angka : ");
            double angka = Double.parseDouble(m.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static void Stream() throws IOException{
        byte[] dt = new byte[5];
        System.out.print("Masukkan kalimat :");
        System.in.read(dt);
        System.out.println("kalimat :");
        for(int i=0; i<dt.length;i++){
            System.out.println((char)dt[i]);
            }
        }

    public static void Scrape() throws MalformedURLException, IOException {
        URL url = new URL("http://youtube.com");
        BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
 
        String inputLine;
        while ((inputLine = br.readLine()) != null) {            
            System.out.println(inputLine);
        }
        br.close();
    }
    public static void Write() {
        FileOutputStream out = null;
        String data;
        System.out.print("Masukkan Kalimat = ");
        Scanner s = new Scanner(System.in);
        data = s.nextLine();
        try{
            out = new FileOutputStream("E:/kelompok.txt");
        }catch(FileNotFoundException e){
            System.out.println("File tidak ditemukan");
        }
        try{
            for (int i = 0; i<data.length(); i++){
                out.write((int)data.charAt(i));
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        try{
            out.close();
        }catch(IOException e){
        }
    }
    public static void Read() {
        FileInputStream input = null ;
        int data ;  
        try
        {
            input = new FileInputStream("E:/kelompok.txt") ;
            
        }catch(FileNotFoundException e)
        {
            System.out.println("File Tidak ada ");
        }
        
        try
        {
            while((data = input.read())!= -1)
            {
                System.out.print((char)data);
            }
            System.out.println();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
            input.close();
            
        }
        catch(IOException E)
        {
            
        }
    }
    public static void main(String[] args) throws IOException{
        BufferedReader m = new BufferedReader(new InputStreamReader(System.in));
        int pilih =0;
        do{
        System.out.println("Pilihan Menu ");
        System.out.println("1. Buffer");
        System.out.println("2. InputStream");
        System.out.println("3. Scraping Website");
        System.out.println("4. Menulis txt");
        System.out.println("5. Membaca txt");
        System.out.println("0. keluar");
        System.out.print("Masukkan pilihan : ");
        pilih = Integer.parseInt(m.readLine());
        switch(pilih){
            case 1:
                Buffer();
                break;
            case 2:
                Stream();
                break;
            case 3:
                Scrape();
                break;
            case 4:
                Write();
                break;
            case 5:
                Read();
                break;
            default : System.out.println("Inputan salah");
                
        }
        }while (pilih!=0);
        
    }
    
}