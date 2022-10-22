/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.latihan1;

/**
 *
 * @author hp
 */
public class Person {
    
    private String nama; 
    private String JenisKelamin;
    private int umur;
    
    //setter
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public void setJenisKelamin(String JenisKelamin){
        this.JenisKelamin = JenisKelamin;
    }
     
    public void setUmur(int umur){
        this.umur = umur;
    }
    
    //getter
    public String getNama(){
        return this.nama;
    }
    
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }
    
    public int getUmur(){
        return this.umur;
    }
    
    public static void main (String [] args) {
    
                // Membuat Objek
        Person Anton = new Person();
        Person Riko = new Person();
              
              
              //memnaggil atribut dan memberi nilai
        Anton.setNama("Anton"); 
        Anton.setJenisKelamin("Laki-laki");
        Anton.setUmur(16);
        System.out.println("Nama :" + Anton.getNama());
        System.out.println("Jenis Kelamin :" + Anton.getJenisKelamin());
        System.out.println("Umur :" + Anton.getUmur());
        
        Riko.setNama("Riko"); 
        Riko.setJenisKelamin("Laki-laki");
        Riko.setUmur(15);
        System.out.println("Nama :" + Riko.getNama());
        System.out.println("Jenis Kelamin :" + Riko.getJenisKelamin());
        System.out.println("Umur :" + Riko.getUmur());
           
        
    }
}
