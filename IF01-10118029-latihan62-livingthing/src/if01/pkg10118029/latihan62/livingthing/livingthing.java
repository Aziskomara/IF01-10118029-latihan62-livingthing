/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118029.latihan62.livingthing;

import javax.xml.transform.Source;

/**
 *
 * @author acer
 * Nama  : Azis komara
 * Nim   : 10118029
 * Kelas : IF-1 
 * Deskripsi program : Program ini menampilkan LIving thing
 */
public abstract class livingthing {
    
    public abstract void walk(String nama);
        
    public void breath(String nama){
        System.out.println(nama + " segang bernapas ");
    }
    public void eat(String nama){
        System.out.println(nama + " sedang makan ");
    }
    
    
}
