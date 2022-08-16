package by.academy.lesson5;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Players> players = new ArrayList<>();


        Players thomas = new Players("Thomas");
        Players andrey = new Players("Andrey");
        Players philip = new Players("Philipp");
        Players josh = new Players("Josh");
        Players margaret = new Players("Margaret");
        Players margaret1 = new Players("Margaret1");


        players.add(thomas);
        players.add(andrey);
        players.add(philip);
        players.add(1, margaret);
        players.add(josh);

        System.out.println(players);


        int size = players.size();
        System.out.println("All players: " + size);


        boolean cont = players.contains(thomas);
        System.out.println("Is there a Thomas? - " + cont + "-" + players.get(0) + "there.");


        boolean empty = players.isEmpty();
        if (empty == false) {
            System.out.println("empty = all");
        } else
            System.out.println("empty = not all");


        boolean remObject = players.remove(philip);
        if (remObject == true) {
            System.out.println("Without Philip: " + players);
        } else
            System.out.println("try again");


        int index = players.indexOf(margaret);
        if (index == 1) {
            System.out.println("True, Margaret index is: " + index);
        }

        int lasIndex = players.lastIndexOf(margaret);
        System.out.println(lasIndex);


        players.set(1, margaret1);
        System.out.println(players);


        ArrayList<Players> players1 = new ArrayList<>();

        Players alex = new Players("Alex");
        Players max = new Players("Max");


        players1.add(alex);
        players1.add(max);


        System.out.println("New players: " + players1);


        players.addAll(players1);
        System.out.println("With new players: " + players);


        players.removeAll(players1);
        System.out.println("Without New players: " + players);

    }

}
