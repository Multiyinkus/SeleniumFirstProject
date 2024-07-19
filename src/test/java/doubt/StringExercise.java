package doubt;

public class StringExercise {

	public static void main(String[] args) {

		String str = "apple,banana,orange";
        String[] fruits = str.split(",");
        System.out.println(fruits.length);
        
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        
        System.out.println("----------------------------------------------------------------");
        
     //   String str1 = "apple-banana_orange";
        String[] fruits1 = str.split("[-_]");//- _ means the symbol to consider when splitting
        
       
        for (String fruitone : fruits1) {
            System.out.println(fruitone);
        }
        
        System.out.println("----------------------------------------------------------------");
        
        String ptr = "apple,banana,orange,grape";
        String[] fruitTwo = ptr.split(",", 3);// 3 is saying the number of time to be split
        
        for (String fruit2 : fruitTwo) {
            System.out.println(fruit2);
        }
        
        System.out.println("----------------------------------------------------------------");
        
        String atr = "Hello World This Is Java";
        String[] words = atr.split("\\s+");//\\s+ means split by single or double space
        
        for (String word : words) {
            System.out.println(word);
        }
        
        System.out.println("----------------------------------------------------------------");
        
        String ktr = "apple;banana,orange:grape";
     
      String[] fruitThree = ktr.split("[,;:]");
        
        
       for (String fruit3 : fruitThree) {
            System.out.println(fruit3);
       }
       String jtr = "   Hello, World!   ";
       String trimmedStr = jtr.trim();//trim is use to cancel white spaces before and after a string
       
       System.out.println("Original String: '" + jtr + "'");
       System.out.println("Trimmed String: '" + trimmedStr + "'");
		/*
		 * Simple split by comma
		 *  String str1 = "apple,banana,orange";
		 *   String[] fruits1 = str1.split(","); 
		 * System.out.println(Arrays.toString(fruits1));
		 * 
		 * Split by multiple delimiters 
		 * String str2 = "apple;banana,orange:grape";
		 * String[] fruits2 = str2.split("[,;:]");
		 * System.out.println(Arrays.toString(fruits2));
		 * 
		 * Split by whitespace 
		 * String str3 = "Hello World This Is Java"; 
		 * String[] words = str3.split("\\s+");
		 * System.out.println(Arrays.toString(words));
		 * 
		 * Limit the number of splits 
		 * String str4 = "apple,banana,orange,grape";
		 * String[] fruits3 = str4.split(",", 3);
		 * System.out.println(Arrays.toString(fruits3));
		 */
	}

}
