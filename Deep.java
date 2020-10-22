package com.company;

public class Deep {
    public static void main(String[] args){
        Deep main = new Deep();
        main.R();
    }
    public void R(){
        Product product = new Product ("Lipstik", "3290");
        Kategori Agis = new Kategori("Lipbalm","Lipbalm", "Madamgie", product);
        Kategori Rika = new Kategori(Agis);

        Rika.getProduct().setNama_product("Wardah");
        Rika.setJenis_barang("Lipmate");
        Rika.setHarga_product("15.000");

        System.out.println(Agis);
        System.out.println(Rika);
    }
}
