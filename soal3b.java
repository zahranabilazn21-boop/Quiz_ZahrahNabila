public class soal3b {
  public static void main(String[] args) {
    int jamKendaraanMasuk = 20;
   
   if (jamKendaraanMasuk < 12.00) {
      System.out.println("Pagi, tarif Rp 5000");
    } else if (jamKendaraanMasuk >= 12.00 && jamKendaraanMasuk < 18.00) {
      System.out.println("Siang, tarif Rp 7000");
    } else {
      System.out.println("Malam, tarif Rp 10000");
    }
}
}
  
