public class mainApp {
    public static void main(String[] args) {
        karyawan k = new karyawan();
        k.NamaDepan="Baiq Indri";
        k.NamaBelakang="Astuti";
        k.tempatlahir="Jorong";
        k.tanggalahir=21;
        k.bulanlahir=04;
        k.tahunlahir=2001;
        k.umur=22;
        k.Alamat="Desa Beraim, Dusun Jorong";
        k.sayHello();

        penggajian p = new penggajian(2000000, 500000,3000000);
        System.out.println("Total gaji yang diterima : "+ p.totalgaji);

        jabatan j = new jabatan("Ketua Divisi", 3);
        System.out.println("Menjabat Sebagai : "+j.jabatan +" Dengan Periode "+j.periode+" Tahun");

        status_pendidikan sp = new status_pendidikan("Lulus di STMIK Lombok");
        System.out.println("Status Pendidikan : "+sp.pendidikan);
    }
    
}
