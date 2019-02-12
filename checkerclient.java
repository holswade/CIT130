/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package schecker;

/**
 *
 * @author laure
 */
public class checkerclient {
    public static void main(String[] args){
        Schecker checker = new Schecker();
        checker.setRequiredLength (5,80);
        final int NUMBER_OF_ELEMENTS = 2;
        String []arr = new String [2];
        arr [0] = "%";
        arr [1] = "@";
        arr [2] = "&";
        arr [3] = "$";
        checker.setRequiredChars(arr);
        String Psswd = "Al@$k&IsC00L";
        
        if(checker.checkPassword("Al@$k&IsC00L")){
            System.out.println("Password OK");
        }else{
            System.out.println("Password fails check");
        
        }// close if/else
    }//close method
}// close class
