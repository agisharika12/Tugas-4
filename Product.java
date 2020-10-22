package com.company;

class Product {
    String nama_product;
    String kode_product;



    public Product(String nama_product, String kode_product) {
        this.nama_product = nama_product;
        this.kode_product = kode_product;
    }
    public Object clone() {
        try {
            return (Product) super.clone();
        } catch (CloneNotSupportedException e) {
            return new Product(this.getNama_product(), this.getKode_product());
        }
    }

    public Product(Product product) {

    }


    public String getNama_product() {
        return nama_product;
    }

    public void setNama_product(String nama_product) {
        this.nama_product = nama_product;
    }

    public String getKode_product() {
        return kode_product;
    }

    public void setKode_product(String kode_product) {
        this.kode_product = kode_product;
    }


    @Override
    public String toString() {
        return "\n==============="+"\nProduct" +
                "\nnama_product = " + nama_product +
                "\nkode_product = " + kode_product;

    }
}





