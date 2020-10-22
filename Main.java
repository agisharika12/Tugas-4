package com.company;

public class Main {
    public static void main(String [] args){
        Main P= new Main();
        P.ShallawCopy();
    }
    public void ShallawCopy (){
        Product product = new Product("Bedak", "56856887" );
        Kategori Abi = new Kategori("Makeup", "Bedak Padat", "Marks", product);

        Product Rika = new Product(product.getNama_product(), product.getKode_product());

        Rika.setNama_product("Powder");

        System.out.println(Abi);
        System.out.println(Rika);




    }
}





