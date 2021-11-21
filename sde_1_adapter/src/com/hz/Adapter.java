package com.hz;

    public class Adapter {

        public static String checker(String input) {

            String[] word = new String[11];

            word[0] = "love it";
            word[1] = "yes";
            word[2] = "yeah";
            word[3] = "always";
            word[4] = "roger";
            word[5] = "true";
            word[6] = "of course";
            word[7] = "sure";
            word[8] = "like it";
            word[9] = "yup";
            word[10] = "yep";

            for(int i = 0; i < word.length; i++) {
                if (input.equals(word[i])) {
                    return "Yep";
                }
            }
            return "No";
        }

    }
