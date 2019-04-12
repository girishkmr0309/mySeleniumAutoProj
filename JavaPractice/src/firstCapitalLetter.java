import java.util.Scanner;

public class firstCapitalLetter 
{
//   static String convert(String str)
//   { 
//        // Create a char array of given String 
//        char ch[] = str.toCharArray(); 
//        for (int i = 0; i < str.length(); i++) 
//        { 
//            // If first character of a word is found 
//            if (i == 0 && ch[i] != ' ' || ch[i] != ' ' && ch[i - 1] == ' ') 
//            { 
//                // If it is in lower-case 
//                if (ch[i] >= 'a' && ch[i] <= 'z') 
//                { 
//                    // Convert into Upper-case 
//                    ch[i] = (char)(ch[i] - 'a' + 'A'); 
//                } 
//            } 
//  
//            // If apart from first character 
//            // Any one is in Upper-case 
//            else if (ch[i] >= 'A' && ch[i] <= 'Z')  
//                // Convert into Lower-Case 
//                ch[i] = (char)(ch[i] + 'a' - 'A');             
//        } 
//  
//        // Convert the char array to equivalent String 
//        String st = new String(ch); 
//        return st; 
//   } 
//  
//   public static void main(String[] args)
//   { 
//	   Scanner scanner = new Scanner(System.in);
//	   String str = scanner.nextLine();
//	   System.out.println(convert(str)); 
//   } 
   
   
   
   public static void main(String[] args) {
       System.out.println("Enter the sentence to capitalize the first letter of each word: ");
       Scanner scn = new Scanner(System.in);
       String str = scn.nextLine();
       
       Scanner scnStr = new Scanner(str);
       String resultStr = "";
       
       while(scnStr.hasNext())
       {
    	   String string = scnStr.next();
    	   resultStr = resultStr + string.substring(0, 1).toUpperCase() + string.substring(1) + " ";
       }
       System.out.println("The resulting sentence after capitalizing the first letter of each word is: " + "\n" + resultStr);
   }
} 