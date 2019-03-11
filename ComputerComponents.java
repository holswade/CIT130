/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class ComputerComponents extends Component {

    int megahertzCPUSpeed;
    int componentReleaseYear;
    public int year;
    public double price;
    public String model;
    public String title;
    public int description;
    private int currYear;
    

    // 
    public boolean testComponent(){
        System.out.println("Simulate Testing!");
        return false; // all the components are broken
    }
}// close class

