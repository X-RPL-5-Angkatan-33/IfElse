import java.util.Scanner;

//Driver Class
public class SiswaTester {
    public static void main(String[] args) {
        Siswa nasya = new Siswa(1, "Nasya", 80);
        Siswa sativa = new Siswa(2, "Sativa", 85);
        nasya.print();
        //membandingkan ipk 2 object
        if (nasya.getIpk() > sativa.getIpk()) {
            System.out.println("IPK Nasya lebih besar");
        } else {
            System.out.println("IPK Sativa lebih besar");
        }

        //Nilai diatas 70 Lulus
        if (nasya.getIpk() >= 70) {
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }

        //Operator AND
        if (nasya.getIpk() >= 70 && nasya.getNama().equals("Nasya")) {
            System.out.println("Benar");
        } else {
            System.out.println("Salah");
        }
    }
}
