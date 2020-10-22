package com.company;
import java.io.Serializable;

    public class Library implements Serializable,Cloneable {
        public static void main(String[] args) {
            Library h = new Library();
            h.WhenModifyingOriginalObject_thenApacheCloneShouldNotChange();

        }
        public void WhenModifyingOriginalObject_thenApacheCloneShouldNotChange() {
            Product product = new Product("Lipstik","93289");
            Kategori Abi = new Kategori("Lipmate","Wardah","25.000",product);
            Kategori deepCopy = Abi.clone();

            product.setNama_product("ACER");
            deepCopy.getProduct().getKode_product();
            Abi.getProduct().getNama_product();
            System.out.println(Abi);
            System.out.println(deepCopy);
        }

}
