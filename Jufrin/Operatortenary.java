import java.util.scanner;
public class Operatortenary {
    public static void main(String[] args) {
        String warna,hobi,perkerjaan;
        int umur,tinggi;

        Scanner scan = new Scanner (System.in);

        System.out.println("masukan umur = ");
        umur = scan.nextInt();
        System.out.println("masukan tinggi = ");
        tinggi = scan.nextInt();

        warna = umur %2 == 0 ? "hitam" : "kuning";
        hobi = tinggi %2 ==0 ? "catur" : "memancing" ;
        perkerjaan = umur % == 0 ? "sales" : "kretor" ;

        System.out.println(warna);
        System.out.println(hobi);
        System.out.println(perkerjaan);
        System.out.println(umur);
        System.out.println(tinggi);




    }
}