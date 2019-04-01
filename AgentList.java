/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AgentYes;

import java.util.LinkedList;
import java.util.ListIterator;

        
        
        /**
 *
 * @author laure
 */
public class AgentList {
         public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("Agent 1");
		linkedList.add("Agent 2");
		linkedList.add("Agent 3");
		linkedList.add("Agent 4");
		linkedList.add("Agent 5");
 
		// ListIterator 
		System.out.println("");
		ListIterator<String> listIterator = linkedList.listIterator();
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next());
		}
 
		System.out.println("");
		
		for (int i = 0; i < linkedList.size(); i++) {
			System.out.println(linkedList.get(i));
		}
 
		
		
 
		
		linkedList.forEach(System.out::println);
	}
 
}
                 
         
     
