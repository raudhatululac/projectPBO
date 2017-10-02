/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3_pbo12;

/**
 *
 * @author MY PC
 */
class NilaiMahasiswa {

    private String nama, ket1, ket2, ket3, ket4, ket5;
    private int nim;
    private double quiz, uts, uas, na;
    private char index1, index2, index3, index4, index5;

    public String getKet1() {
        return ket1;
    }

    public void setKet1(String ket1) {
        this.ket1 = ket1;
    }

    public String getKet2() {
        return ket2;
    }

    public void setKet2(String ket2) {
        this.ket2 = ket2;
    }

    public String getKet3() {
        return ket3;
    }

    public void setKet3(String ket3) {
        this.ket3 = ket3;
    }

    public String getKet4() {
        return ket4;
    }

    public void setKet4(String ket4) {
        this.ket4 = ket4;
    }

    public String getKet5() {
        return ket5;
    }

    public void setKet5(String ket5) {
        this.ket5 = ket5;
    }

    public char getIndex1() {
        return index1;
    }

    public void setIndex1(char index1) {
        this.index1 = index1;
    }

    public char getIndex2() {
        return index2;
    }

    public void setIndex2(char index2) {
        this.index2 = index2;
    }

    public char getIndex3() {
        return index3;
    }

    public void setIndex3(char index3) {
        this.index3 = index3;
    }

    public char getIndex4() {
        return index4;
    }

    public void setIndex4(char index4) {
        this.index4 = index4;
    }

    public char getIndex5() {
        return index5;
    }

    public void setIndex5(char index5) {
        this.index5 = index5;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public int getNim() {
        return nim;
    }

    public void setNim(int nim) {
        this.nim = nim;
    }

    public double getQuiz() {
        return quiz;
    }

    public void setQuiz(double quiz) {
        this.quiz = quiz;
    }

    public double getUts() {
        return uts;
    }

    public void setUts(double uts) {
        this.uts = uts;
    }

    public double getUas() {
        return uas;
    }

    public void setUas(double uas) {
        this.uas = uas;
    }

    public double Na(double quiz, double uts, double uas) {
        return 0.2 * quiz + 0.3 * uts + 0.5 * uas;
    }
}

public class Tugas3_PBO12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        NilaiMahasiswa oNMHS = new NilaiMahasiswa();
        //Menampilkan Nama Mahasiswa
        oNMHS.setNama("Raudhatul Ula Camalia");
        i = 1;
        while (i <= 4) {
            System.out.println("Nama ke " + i + " : " + oNMHS.getNama());
            i++;
        }

        //Menampilkan NIM Mahasiswa
        oNMHS.setNim(10116598);
        j = 8;
        while (j >= 1) {
            System.out.println("NIM ke " + j + " : " + oNMHS.getNim());
            j--;
        }

        //Menampilkan Nilai
        oNMHS.setQuiz(76);
        oNMHS.setUts(78);
        oNMHS.setUas(87);
        System.out.println("\nQuiz = " + oNMHS.getQuiz());
        System.out.println("UTS = " + oNMHS.getUts());
        System.out.println("UAS = " + oNMHS.getUas());
        System.out.println("\nNilai AKhir = " + oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()));

        //Menampilkan Index
        if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 80 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 100) {
            oNMHS.setIndex1('A');
            oNMHS.setKet1("Sangat Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex1());
            System.out.println("Keterangan : " + oNMHS.getKet1());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 68 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 80) {
            oNMHS.setIndex2('B');
            oNMHS.setKet2("Baik");
            System.out.println("\nIndex : " + oNMHS.getIndex2());
            System.out.println("Keterangan : " + oNMHS.getKet2());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 56 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 68) {
            oNMHS.setIndex3('C');
            oNMHS.setKet3("Cukup");
            System.out.println("\nIndex : " + oNMHS.getIndex3());
            System.out.println("Keterangan : " + oNMHS.getKet3());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) > 45 && oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 56) {
            oNMHS.setIndex4('D');
            oNMHS.setKet4("Kurang");
            System.out.println("\nIndex : " + oNMHS.getIndex4());
            System.out.println("Keterangan : " + oNMHS.getKet4());
        } else if (oNMHS.Na(oNMHS.getQuiz(), oNMHS.getUts(), oNMHS.getUas()) <= 45) {
            oNMHS.setIndex5('E');
            oNMHS.setKet5("Sangat Kurang");
            System.out.println("\nIndex : " + oNMHS.getIndex5());
            System.out.println("Keterangan : " + oNMHS.getKet5());
        }
    }
}
