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
public class Mahasiswa extends Nilai{
    String nama, nim;
    
    public String getName(){
        return nama;
    }
    
    /**
     *
     * @param nama
     */
    public void setName(String nama){
        this.nama=nama;
    }
    
    /**
     *
     * @return
     */
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim=nim;
    }
    
}