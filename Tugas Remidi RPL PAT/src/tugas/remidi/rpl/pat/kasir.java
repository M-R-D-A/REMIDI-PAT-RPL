/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas.remidi.rpl.pat;

/**
 *
 * @author M. RAFI DUTA ATTALA
 */
public class kasir {
    public String NamaK;
    public String Tanggal;
    public String NamaB;
    public int Jumlaht;
    public int HargaB;
    public int HargaC;
    public int HargaD;
    public int HargaDiskon1;
    public int HargaDiskon2;
    public void setNamaK(String newNamaK){
        NamaK = newNamaK;
    }
    public void setTanggal(String newTanggal){
        Tanggal = newTanggal;
    }
    public String getNamaK(){
        return NamaK;
    }
    public String getTanggal(){
        return Tanggal;
    }
    public void setJumlaht(int newJumlaht){
        Jumlaht = newJumlaht;
    }
    public int getJumlaht(){
        return Jumlaht;
    }
    public void setHargaB(int newHargaB){
        HargaB = newHargaB;
    }
    public int getHargaB(){
        return HargaB;
    }
    public void setHargaC(int newHargaC){
        HargaC = newHargaC;
    }
    public int getHargaC(){
        return HargaC;
    }
    public void setHargaD(int newHargaD){
        HargaD = newHargaD;
    }
    public int getHargaD(){
        return HargaD;
    }
    public int HargaBarang(){
        return HargaB + HargaC + HargaB;
    }
}
