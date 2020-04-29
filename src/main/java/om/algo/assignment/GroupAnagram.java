package om.algo.assignment;

/*
 * This program prints set of anagrams together in given string
 *
 * eg.
 * setOfAnagrams("cat dog tac sat tas god dog") should print "cat tac dog god dog sat tas"
 *
 */

public class GroupAnagram {

    static String input = "cat dog tac sat tas god dog";


    public static boolean isAnagram(String str1, String str2)
    {
        if(str1.length() != str2.length())
            return false;
        boolean charExit = false;
        for(int i = 0; i< str1.length();i++)
        {
            for(int j = 0; j< str2.length();j++)
            {
                if(str1.charAt(i)== str2.charAt(j))
                {
                    charExit = true;
                }
            }

            if(!charExit)
            {
                return false;
            }
            else
            {
                charExit = false;
            }
        }
        return true;
    }

    static void setOfAnagrams(String inputString){

        //your code goes here
        String[] words = inputString.split(" ");
        if(words.length > 1) {
            StringBuilder group = new StringBuilder();
            boolean isStartingWordAdded = false;
            for(int i = 0 ; i< words.length; i++) {
                for(int j = i + 1 ; j< words.length; j++) {
                    if(words[i] != "" && words[j] != "") {
                        if(isAnagram(words[i], words[j])) {
                            if(!isStartingWordAdded) {
                                isStartingWordAdded = true;
                                group.append(words[i]).append(" ");
                            }
                            group.append(words[j]).append(" ");
                            words[j] = "";
                        }
                    }
                }
                isStartingWordAdded = false;
            }

            System.out.println("group:"+ group);
        }
    }


    public static void main(String[] args) {
        String input = "cat dog tac sat tas god dog";
        setOfAnagrams(input);

    }
}
