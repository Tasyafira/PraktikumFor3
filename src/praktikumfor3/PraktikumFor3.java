/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikumfor3;

/**
 *
 * @author MOKLET-1
 */
public class PraktikumFor3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int p,u,j=5,i=5,f =6;
        System.out.println("PROGRAM MENAMPILKAN @ BERBENTUK Z");
        System.out.println("----------------------------");
        
        // Perulangan 
        // p = 1, p Kurang Dari atau Sama Dengan j, Maka p++ (Perulangan dimulai dari 1 dan akan terus berulang sampai kurang dari / sama dengan p)
              for(p=1;p<=j;p++){
                  
                // u = 5, u Lebih Dari atau Sama Dengan 1, Maka u-- (Perulangan dimulai dari 1 dan akan terus berkurang sampai sama dengan 5)
                for(u=5;u >=1;u--){
                
                    // Percabangan
                    if (p==u)
                        System.out.print("@");
                    else if  
                        (p==1 || p==5)
                        System.out.print("@");
                    else 
                            System.out.print(" ");
                    }
                 System.out.println();
                }  
    }
    
}
