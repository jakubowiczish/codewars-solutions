package _7kyu._7kyu_spacify;

/*
Modify the spacify function so that it returns the given string with spaces insertedbetween each character.

spacify("hello world") // returns "h e l l o   w o r l d"
 */

class Spacify {

    static String spacify(String str) {
        return str.replace("", " ").trim();
    }
}

