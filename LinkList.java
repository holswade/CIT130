/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklist;

import java.util.*;

/**
 *
 * @author laure
 */
public class LinkList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList<String> superList = new LinkedList<>();
        superList.add("White Chocolate Mocha");
        superList.add("Vanilla Bean Coconutmilk Latte");
        superList.add("Strawberry Acai Lemonade refresher");
        superList.add("Chai Latte");
        superList.add("Mango Drangonfruit lemonade refresher");
        superList.add("iced carmel cloud macchiato");
        superList.add("Nitro cold brew");
        superList.add("Pink Drink");
        superList.add("Flat White");
        System.out.println(superList);

        //swap 0 and 1
        String counter1 = superList.get(0);
        String counter2 = superList.get(1);
        superList.add(0, "White Chocolate Mocha");
        superList.add(1, "Mango Dragonfruit Lemonade refresher");
        superList.add(2, "Strawberry Acai Lemonade refresher");
        superList.add(3, "Pink Drink");
        superList.add(4, "Nitro cold brew");
        superList.add(5, "Starbucks");
        superList.add(6, "Vanilla Bean Coconutmilk Latte");
        superList.add(7, "Chai Latte");
        superList.add(8, "iced carmel cloud macchiato");
        superList.add(9, "Flat White");
        superList.remove(10);
        superList.remove(11);
        superList.remove(12);
        superList.remove(13);
        superList.remove(14);
        superList.remove(15);
        superList.remove(16);
        superList.remove(17);
        superList.remove(18);
        superList.remove(19);
        superList.remove(20);
        System.out.println(superList);

        Iterator<String> iter = superList.iterator();
        while (iter.hasNext()) {
            System.out.println(iter.next().toUpperCase());
        }

    }

}
