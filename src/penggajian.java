public class penggajian {
    int gajipoko;
    int tunjangan;
    int lembur;

    int totalgaji;
    public penggajian (int gajipokok, int tunjangan, int lembur){
        this.gajipoko=gajipokok;
        this.tunjangan=tunjangan;
        this.lembur=lembur;
        this.totalgaji= gajipoko + tunjangan + lembur;
    }


}
