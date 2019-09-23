package _8kyu._8kyu_third_angle_of_a_triangle;

/*
You are given two angles (in degrees) of a triangle.

Write a function to return the 3rd.

Note: only positive integers will be tested.
 */

class ThirdAngle {

    static int otherAngle(int angle1, int angle2) {
        return 180 - angle1 - angle2;
    }
}