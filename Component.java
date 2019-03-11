/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author laure
 */
public class Component {

    public int year;
    public String title;
    public int description;
    public int author;
    private int currYear;
    // computes the time sicne the component was created
    
    public year int generateYearSince(int currYear){
        return currYear - year; 
    }
    
