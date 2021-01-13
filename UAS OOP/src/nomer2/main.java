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
public class main {
        
        public static void main(String[] args) {
           bangundatar bd = new  bangundatar();
           bd.Hitungluas();
           bd.HitungKeliling();



         System.out.println("NIM SAYA 201969040027");
         System.out.println("==============================================");
         System.out.println("====> LUAS DAN KELILING SEGITIGA  <======");
          
          
         segitiga st = new segitiga();
         st.Hitungluas();
         System.out.println("==============");
         st.HitungKeliling();

         System.out.println("==============");
         System.out.println("==============");
         System.out.println("===============");

         System.out.println(" LUAS DAN KELILING PERSEGI");
         Persegi kotak = new Persegi();
         kotak.HitungLuas();
         System.out.println("===========");
         kotak.HitungKeliling();

         System.out.println("==============");
         System.out.println("==============");
         System.out.println("===============");
        
         System.out.println(" LUAS DAN KELILING LINGKARAN");
         Lingkaran bunder = new Lingkaran ();
         System.out.println("============");
         bunder.HitungKeliling();
     }
}
