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
public class Schecker {

    public void setRequiredLength(int min, int max) {

    }

    // TODO code application logic here
    public void setRequiredChars(String[] reqChars) {
        String[] psswd = new String[2];
        final int NUMBER_OF_ELEMENTS = 2;
        String[] arr = new String[2];
        arr[0] = "%";
        arr[1] = "@";
        arr[2] = "&";
        arr[3] = "$";

    }

    public boolean checkPassword(String psswd) {
        // check that password meets length
        // and character requirement
        int psswdlength = psswd.length();

        for (int i = 0; i < psswdlength; i++) {
            int index = psswd.indexOf(arr[i]);
            if (psswd[i] > max) {
                max = psswd[i];
            }

            return false;
        }

    }
}
