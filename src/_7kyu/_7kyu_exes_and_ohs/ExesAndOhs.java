package _7kyu._7kyu_exes_and_ohs;

/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false

 */

class ExesAndOhs {

    static boolean getXO(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == 'X' || str.charAt(i) == 'x') ++counter;
            if (str.charAt(i) == 'O' || str.charAt(i) == 'o') --counter;
        }

        return counter == 0;
    }
}