/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nilaimahasiswa;

/**
 *
 * @author Ikhsan
 */
public class Nilai {
    double n_harian, n_uts, n_uas, nilai=0;
    
    public double getNHarian(){
        return n_harian;
    }
    
    public void setNHarian(double n_harian){
        this.n_harian = (n_harian*30)/100;
    }

    public double getNuts(){
        return n_uts;
    }
    
    public void setNuts(double n_uts){
        this.n_uts=(n_uts*30)/100;
    }
    
    public double getNuas() {
        return n_uas;
    }
    
    public void setNuas(double n_uas){
        this.n_uas=(n_uas*40)/100;
    }
    
     private double hitungnilai(double n_harian, double n_uts, double n_uas) {
        return n_harian + n_uts + n_uas;
    }
     
    public void tambahpoin() {
        System.out.println("Penambahan Poin");
    }
    
    public double gettotalnilai() {
        return hitungnilai(n_harian, n_uts, n_uas);
    }

}
