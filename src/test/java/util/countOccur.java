package util;


public class countOccur {

  public  static int countOccurences(String str, String word)
    {
        // split the string by spaces in a
        String a[] = str.split(" ");

        // search for pattern in a
        int count = 0;
        for (int i = 0; i < a.length; i++)
        {
            // if match found increase count
            if (word.equals(a[i]))
                count++;
        }
//        System.out.println(count);
        return count;
    }

    // Driver code
    public static void main(String args[])
    {
        String str = "GeeksforGeeks A computer science portal for geeks ";
        String word = "portal";
        System.out.println(countOccurences(str, word));

        String str1 ="Sun   9:00 AM JOHN B.  10:30 AM JOHN B.  12:00 PM JOHN B";
        String word1 ="JOHN";
        System.out.println(countOccurences(str1, word1));
    }
}
