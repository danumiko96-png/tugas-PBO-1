package tugas_PBO_pertemuanke8;

public class persegipanjang extends Bangundatar{
    private double panjang;
    private double lebar;
    
    public void setPanjang(double panjang){
        this.panjang = panjang;
    }
    public void setLebar(double lebar){
        this.lebar = lebar;
}   
    @Override
    public double hitungluas(){
        return panjang * lebar;
    }
    @Override
    public double hitungKeliling(){
        return 2 * (panjang + lebar);
    }
}