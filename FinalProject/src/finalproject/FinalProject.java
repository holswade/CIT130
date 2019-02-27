/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

/**
 *
 * @author laure
 */
public class FinalProject {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objects;

/**
 *
 * @author lauren.holswade319
 */
public class Cat {
    String foodType;
    int energyLevel;
    boolean sleeping;
    public int age;
    public String size;
    public double climb;
    private boolean isCatFed;
    private double height;
    private double jump;
    
    public static void displayTabby(){
        System.out.println("..^,,,,,,.^.");
        System.out.println(".(= 'o'=  )");
        System.out.println(".(''),,('')");
        System.out.println("'","\\'");
        System.out.println(".| ,,,,.,, |");
        System.out.println(".|,,,,,.,, |");        
        System.out.println(".(,,)|" + "|(,,)");
        System.out.println("/,/"    );
        System.out.println(". .. ((...");
        System.out.println(". . . ))..");
        System.out.println(". . . ((..");
        System.out.println(". . .  @..");
    }
    
    
    
    
    public void giveCatFood(){
        isCatFed = true;
        System.out.println("Meow...meowwwwwww.... m e o w!<3<3<3 ");
        }//close method
    
    public void dontGiveCatFood(){
        isCatFed = false;
        System.out.println("REOWWWWW!!!!!!! HISSSSSS!!!!!!!!!! ");
    }//close method
    
    public boolean sleeping(){
        return isCatFed;
        }
    
    public double climb(int numFoot){
    height = height + numFoot;
    return height;
    }
    public double jump(int maxHeight){
    jump = jump + maxHeight; 
    } 

}
}
 