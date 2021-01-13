/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomer2;

/**
 *
 * @author USER
 */
public class Persegi extends segitiga  {

    
    public void HitungLuas(){
        double luas;
        luas = this.sisic * this.sisic;
        System.out.println("Panjang SISI : " + this.sisic + "cm");
        System.out.println(" Luas Persegi Adalah :" +luas+ " cm ");
                     
    }
        @Override
     public void HitungKeliling (){
         double keliling;
         keliling = this.sisic * 2;
         System.out.println("Panjang SISI :" + this.sisic + " ck ");
         System.out.println(" Luas Persegi Adalah : " +keliling+ " ck ");
     
    }
    
}
