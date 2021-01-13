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
public class segitiga extends bangundatar {
    private double sisia=4;
    protected double sisib=2; 
    protected double sisic=4;
    protected double jarijari=27;

    @Override
        public void Hitungluas() {
        double luas;
        luas=this.sisib * this.sisic/2;
        System.out.println("Alas : "+this.sisib + " ck ");
        System.out.println(" Tinggi : "+ this.sisic + "ck");
        System.out.println("Luas Segitiga Adalah :" +luas+ "ck");
    }
     @Override   
    public void HitungKeliling () {
        double keliling;
        keliling = this.sisia+this.sisib+this.sisic;
        System.out.println("SISI A : " + this.sisib + " ck ");
        System.out.println(" SISI B : " + this.sisic + " ck ");
        System.out.println( "SISI C : " + this.sisia + " ck ");
        System.out.println( " Keliling Segitiga Adalah : " +keliling+ " ck ");
        
    }    
                
                
    }

    
  
