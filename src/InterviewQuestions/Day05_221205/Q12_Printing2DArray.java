package InterviewQuestions.Day05_221205;

import java.util.Arrays;

// Print 2D String array using loops
public class Q12_Printing2DArray {
    public static void main(String[] args) {
        String[][] arr = {{"abc", "def", "ghi"}, {"jkl", "mno", "prs"}};

        for (int i = 0; i < arr.length; i++) {// outer array
            for (int j = 0; j < arr[i].length; j++) {//inner array
                System.out.println(arr[i][j]); //sadece elamanlari yazdirir
            }
        }
        System.out.println(Arrays.deepToString(arr)); //[[abc, def, ghi], [jkl, mno, prs]]
    }
}
