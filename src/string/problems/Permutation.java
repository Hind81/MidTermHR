package string.problems;

public class Permutation {

    public static void main(String[] args) {

        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */

            String s2 = null;
        int s1 = 0;
        if (s2.length() == 0) {

                System.out.println(s1);

                return;

            }

            StringBuilder str1;

            String str2;

            for (int i = 0; i < s2.length(); i++) {

                str1 = new StringBuilder(s1);

                str1.append(s2.charAt(i));

                str2 = s2.substring(0, i) + s2.substring(i+1, s2.length());

                displayPermutation(str1.toString());

            }

        }

    private static void displayPermutation(String toString) {
    }

     {

            displayPermutation("abc");

        }

    }

