package tugas_PBO_pertemuanke8;


public class persegi extends Bangundatar {
    private double sisi;
    
    public void setSisi(double sisi){
        this.sisi = sisi;
    }
    public double getSisi(){
        return sisi;
    }
    
    @Override
    public double hitungluas(){
        return sisi * sisi;
    }
    @Override
    public double hitungKeliling(){
        return 4 * sisi;
    }
}
