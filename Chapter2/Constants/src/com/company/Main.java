package com.company;

public class Main {

    public static void main(String[] args) {

// CONSTANT SCORE VALUE
final int TOUCHDOWN, CONVERSION, FIELDGOAL;

          TOUCHDOWN = 6;
          CONVERSION = 1;
          FIELDGOAL= 3;

          //INPUT NUMBER OF TIMES EACH WAS SCORED
          //PAT (point after touchdown) is "conversion"
          int td, pat, fg, total;

          td = 4 * TOUCHDOWN;
          pat = 3 * CONVERSION;
          fg = 2 * FIELDGOAL;
          total = (td + pat + fg);

        System.out.println("Score: " + total);


    }
}
