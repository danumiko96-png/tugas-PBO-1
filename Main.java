package tugas_PBO_pertemuanke8;

public class Main {
    public static void main(String[] args) {
        
        persegi p = new persegi();
        p.setSisi(5); // Memberi nilai via setter
        System.out.println("=== PERSEGI ===");
        System.out.println("Sisi: " + p.getSisi());
        System.out.println("Luas: " + p.hitungluas());
        System.out.println("Keliling: " + p.hitungKeliling());
        System.out.println("-------------------");
        
        persegipanjang pp = new persegipanjang();
        pp.setPanjang(10);
        pp.setLebar(4);
        System.out.println("=== PERSEGI PANJANG ===");
        System.out.println("Luas: " + pp.hitungluas());
        System.out.println("Keliling: " + pp.hitungKeliling());
        System.out.println("-------------------");
        
         segitiga s = new segitiga();
        s.setAlas(6);
        s.setTinggi(8);
        s.setSisiA(6); // Sisi alas
        s.setSisiB(8); // Sisi tinggi (misal segitiga siku-siku)
        s.setSisiC(10); // Sisi miring (hipotenusa)
        
        System.out.println("=== SEGITIGA ===");
        System.out.println("Luas: " + s.hitungluas());
        System.out.println("Keliling: " + s.hitungKeliling());
    }
}
