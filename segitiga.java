package tugas_PBO_pertemuanke8;

public class segitiga extends Bangundatar{
    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double sisiC;
    
    public void setAlas(double alas){
        this.alas = alas;
    }
    public void setTinggi(double tinggi){
        this.tinggi = tinggi;
    }
    public void setSisiA(double sisiA){
        this.sisiA = sisiA;
    }
    public void setSisiB(double sisiB){
        this.sisiB = sisiB;
    }
    public void setSisiC(double sisiC){
        this.sisiC = sisiC;
    }
    
    public double hitungluas(){
        return 0.5 * alas * tinggi;
    }
    public double hitungKeliling(){
        return sisiA + sisiB + sisiC;
    }
}
