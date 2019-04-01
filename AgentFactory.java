/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentYes;


import java.util.Random;
import java.util.List;
import java.util.LinkedList;
import java.util.Iterator;
/**
 *
 * @author laure
 */
public class AgentFactory {

    private static int id = 10000;
// the threshold is used 
    public static double THRES = 0.5;
    public static List<Agent> upheldCover = new LinkedList<>();
    public static List<Agent> noupheldCover = new LinkedList<>();

    
    public static Agent genAgent() {
        System.out.println("Agemt Factory GenAgent");
        Random r = new Random();
        Agent agent = new Agent();
        agent.setId(id++);
        agent.setStealthiness(r.nextDouble());
        return agent;
    }//close method

     
    
    public static Agent simulator(Agent a, double countryRisk) {
        System.out.println("simulator");
        if (a.getStealthiness() * countryRisk > THRES) {

            a.setCoverUpheld(true);
        } else {
            a.setCoverUpheld(false);

        }//close if
        return a;
    } // close method

    public static agentCalcs computeListCalcs(List<Agent>w){
        System.out.println("compute");
        agentCalcs agentcalc = new agentCalcs();
        Iterator<Agent> iter = w.iterator();
        while(iter.hasNext()){
            System.out.println(iter.next()+" ");
            
        }   
        return agentcalc; 
    
       //close 
    }
    
    /**
     *
     * @param f
     */
    public static void list(Agent f){
        System.out.println("list");

        
        // what these lines are doing is that they are generating the agents
        // into two seperate lists called getCoverUpheld noUpheldCover 
        
       
            if  (f.getCoverUpheld()){
            upheldCover.add(f);
                }else{
              noupheldCover.add(f);
                }

        
   }

    
    
    // 
    public static double getrisk() {
        System.out.println("getrisk");
        Country c1 = new Country();
        c1.name = "Russia";
        c1.risk = 0.5;

        Country c2 = new Country();
        c2.name = "USA";
        c2.risk = 2.5;

        Country c3 = new Country();
        c3.name = "Norway";
        c3.risk = 8.0;

        Country c4 = new Country();
        c4.name = "Mexico";
        c4.risk = 3.0;

        Country c5 = new Country();
        c5.name = "Canada";
        c5.risk = 6.0;

        // this is adding a new element
        List<Country> list = new LinkedList<>();
        list.add(0, c1);
        list.add(1, c2);
        list.add(2, c3);
        list.add(3, c4);
        list.add(4, c5);

        
      
        
        // this is generating a random number from 0-5, list size will determine
        // list size will pick a number that a country is assigned to randomly
        Random random = new Random();
        int randIndex = random.nextInt(list.size());
        Country chosenCountry= list.get(randIndex);
        return chosenCountry.risk;

   
    }
      public static void main(String[] args) {
          int number=0;
          while(number<10000){
               list(simulator(genAgent(), getrisk() ) );
               number++;
          }
          
         computeListCalcs(upheldCover);
         System.out.println("");
         computeListCalcs(noupheldCover);
          
   }   
}