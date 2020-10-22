package com.company;

class Kategori {
    String Jenis_barang;
    String nama_barang;
    String harga_product;
    public Product product;

    public Kategori(Kategori agis) {
        this (agis.getJenis_barang(), agis.getNama_barang(), agis.getHarga_product(),new Product(agis.getProduct()));
    }

    public Kategori(String Jenis_barang, String Nama_barang, String Harga_product ,Product product) {
        this.Jenis_barang = Jenis_barang;
        this.nama_barang = Nama_barang;
        this.harga_product = Harga_product;
    }
    public Kategori clone() {
        Kategori agis = null;
        try {
            agis = (Kategori) super.clone();
        } catch (CloneNotSupportedException e) {
            agis = new Kategori(
                    agis.getJenis_barang(), this.getNama_barang(), this.getHarga_product(), new Product(agis.getProduct()));
        }
        agis.product = (Product) this.product.clone();
        return agis;
    }


    public String getJenis_barang() {

        return Jenis_barang;
    }

    public void setJenis_barang(String jenis_barang) {

        Jenis_barang = jenis_barang;
    }

    public String getNama_barang() {

        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {

        this.nama_barang = nama_barang;
    }

    public String getHarga_product() {

        return harga_product;
    }

    public void setHarga_product(String Harga_product) {

        this.harga_product = harga_product;
    }

    public Product getProduct() {

        return product;
    }

    public void setProduct(Product product) {

        this.product = product;
    }

    @Override
    public String toString() {
        return "================\n"+"\nKategori" +
                "\nJenis_barang =" + Jenis_barang +
                "\nnama_barang=" + nama_barang +
                "\nharga_product='" + harga_product +
                "\nproduct=" + product ;
    }
}