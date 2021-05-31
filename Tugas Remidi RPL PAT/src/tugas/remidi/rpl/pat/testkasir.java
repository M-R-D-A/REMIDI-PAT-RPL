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
public class testkasir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        kasir ad551 = new kasir();
        ad551.setNamaK("andi");
        ad551.setTanggal("12 juni 2012");
        ad551.setJumlaht(3);
        ad551.setHargaB(500000);
        ad551.setHargaC(600000);
        ad551.setHargaD(500000);
        
        System.out.println("nama kasir : "+ ad551.getNamaK());
        System.out.println("tanggal : " +ad551.getTanggal());        
        System.out.println("nama barang yang dibeli : audi 558, new balance 574, adidas cortez");
        System.out.println("merk         : Audi");
        System.out.println("Size         : 33");
        System.out.println("Warna        : black");
        System.out.println("Jenis Sepatu : cowok");
        System.out.println("Kategori     : sport");
        System.out.println("Harga        : Rp"+ad551.getHargaB());
        System.out.println("merk         : new balance 574");
        System.out.println("Size         : 37");
        System.out.println("Warna        : black and blue");
        System.out.println("Jenis Sepatu : cowok");
        System.out.println("Kategori     : sport");
        System.out.println("Harga        : Rp"+ ad551.getHargaC());
        System.out.println("merk         : Adidas cortez");
        System.out.println("Size         : 35");
        System.out.println("Warna        : white,blue,and red");
        System.out.println("Jenis Sepatu : cowok");
        System.out.println("Kategori     : sport");
        System.out.println("Harga        : Rp"+ ad551.getHargaD());
        System.out.println("jumlah barang yang dibeli : " + ad551.getJumlaht());
        System.out.println("harga barang : Rp"+ ad551.HargaBarang());
        if(ad551.getJumlaht() > 3 && ad551.getJumlaht() < 1 ){
            double diskon1 = ad551.HargaBarang() - 50000;
            System.out.println("total pembelian : Rp" + diskon1);
        }else if
            (ad551.getJumlaht() >= 3){
            double diskon2 = ad551.HargaBarang() - 100000;
            System.out.println("total pembelian : Rp" + diskon2);
        }
        }
    }
    
