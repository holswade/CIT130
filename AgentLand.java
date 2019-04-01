package AgentYes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 *
 * @author laure
 */
import java.util.Map;
import java.util.HashMap;

public class AgentLand {

    public static void main(String[] args) {
        Agent a1 = new Agent();
        a1.idnumber = "SR4410";
        a1.assignment = "Find the money stash";
        a1.contactInfo = "Text iPhone";
        a1.location = "Empire State Building";
        a1.name = "Max";

        Agent a2 = new Agent();
        a2.idnumber = "SC2221";
        a2.assignment = "Infiltrate the ship";
        a2.contactInfo = " Text iPhone";
        a2.location = "Iceland";
        a2.name = "Bill";

        Agent a3 = new Agent();
        a3.idnumber = "SE1234";
        a3.assignment = "Locate the gem";
        a3.contactInfo = "Call cell phone" ;
        a3.location = "Maldives";
        a3.name = "Maggie";
        
        Agent a4 = new Agent();
        a4.idnumber = "SW3445";
        a4.assignment = "Find the spy";
        a4.contactInfo = "Text iPhone";
        a4.location = "Seoul";
        a4.name = "Billie";
        
        Agent a5 = new Agent();
        a5.idnumber = "R2D234";
        a5.assignment = "Infiltrate the base";
        a5.contactInfo = "Use the Tik tOk app";
        a5.location = "Budapest";
        a5.name= "Sigrid";
        
        
        Map<String, Agent> m = new HashMap<>();
        m.put(a1.idnumber, a1);
        m.put(a1.assignment, a1);
        m.put(a1.contactInfo, a1);
        m.put(a1.location, a1);
        m.put(a1.name, a1);

        
        
        
        
        
        
        
        
        
    }
}

