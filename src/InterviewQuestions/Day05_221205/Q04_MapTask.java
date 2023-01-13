package InterviewQuestions.Day05_221205;
// PART 1
// create a map with groupName as key and groupMembers as value
// "Group1" = ["Member1", "Member2"]
// "Group2" = ["Member3", "Member4", "Member5"]


// BÖLÜM 1
// anahtar olarak groupName ve değer olarak groupMembers ile bir harita oluşturun
// "Grup1" = ["Üye1", "Üye2"]
// "Grup2" = ["Üye3", "Üye4", "Üye5"]

// PART 2
// find how many members each group has

// BÖLÜM 2
// her grubun kaç üyesi olduğunu bul

import java.util.*;

public class Q04_MapTask {
    public static void main(String[] args) {
        HashMap<String, ArrayList<String>> grupVeUyeler = new HashMap<>();

        ArrayList<String> team1 = new ArrayList<>(Arrays.asList("Gamze", "Merve Nil", "Sumeyra", "Ramazan"));
        ArrayList<String> team2 = new ArrayList<>(Arrays.asList("Hakan", "Yunus Emre", "Gursoy", "Yakup"));

        grupVeUyeler.put("teamA", team1);
        grupVeUyeler.put("teamb", team2);

        System.out.println("grupVeUyeler = " + grupVeUyeler);
//grupVeUyeler = {teamA=[Gamze, Merve Nil, Sumeyra, Ramazan], teamb=[Hakan, Yunus Emre, Gursoy, Yakup]}

        //Bolum2
        //1.yol -> value lardan giderek

        Collection<ArrayList<String>> values = grupVeUyeler.values();
        for (ArrayList<String> kisi:values
        ) {
            System.out.println(kisi.size()); // ikisi icin de 4
        }

        //2.yol -> key lerden giderek

        Set<String> keys = grupVeUyeler.keySet(); //keySet() key leri set olarak dondurur
        for (String key :keys
        ) {
            ArrayList<String> grupList =grupVeUyeler.get(key);
            System.out.println("gruptaki uye sayisi :" + key + " " + grupList.size());
            //gruptaki uye sayisi :QA Team 4
            //gruptaki uye sayisi :Development Team 4
        }
    }
}
