package AgentYes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author laure
 */
public class Agent {

    
    @Override
    public String toString(){
      StringBuilder builder= new StringBuilder();
      builder.append(id);
      builder.append(" ");
      builder.append(stealthiness);
      builder.append(" ");
      builder.append(secretCoverUpheld);
      return builder.toString();
    }
    private int id;
    private double stealthiness;
    private boolean secretCoverUpheld;
  
    public void setId(int i) {
        id = i;
    }

    public int getId() {
        return id;
    }

    public void setStealthiness (double a){
        stealthiness=a;
    }
    
    public double getStealthiness() {
        return stealthiness;
    }
   public void setCoverUpheld (boolean b){
       secretCoverUpheld = b;
       
   }
      
   public boolean getCoverUpheld (){
       return secretCoverUpheld;
   }
}
    

