package com.company;

public class Interface {
    public static void main(String[] args){
        Interface main = new Interface();
        main.R();
    }

    public void R(){
        Product product = new Product("Maskara", "9870");
        Kategori Abi = new Kategori("Makeup", "Makeup", "Maybeline", product);
        Kategori ika = (Kategori) Abi.clone();

        ika.getProduct().setNama_product("Eyeliner");
        ika.setJenis_barang("hiasan");
        ika.setNama_barang("Wardah");

        System.out.println(Abi);
        System.out.println(ika);


    }
}
