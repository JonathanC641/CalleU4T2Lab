public class StringLoops {

    public StringLoops() { }

    /* Returns the number of times "character" appears in "searchString"
       This should be NON-case sensitive!

       Examples:
       - if character = "a" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "A" and searchString = "Apple and banana",
         this method returns 5 (it finds BOTH "A" and "a")
       - if character = "!" and searchString = "Hello! Nice day!",
         this method returns 2

        DO THIS WITH A FOR LOOP!
      */
    public int countCharacters(String character, String searchString) {
        int count =0;
        String word =  "";
        for(int i = 0; i < searchString.length(); i++){
            String letter = searchString.substring(i, i+1);
            if(letter.contains(character) || letter.contains(character.toUpperCase()) || letter.contains(character.toLowerCase())){
                count++;
            }
        }
        return count;
    }

    /* Returns the original string reversed

     Examples:
     - if origString = "hello!" this method returns "!olleh"
     - if origString = "Apples and bananas" this method returns "sananab dna selppA"
    */
    public String reverseString(String origString) {
        String reversedString = "";
        for (int i = origString.length()-1; i != -1; i--){
            reversedString = reversedString + origString.substring(i, i+1);
        }
        return reversedString;
    }
}
