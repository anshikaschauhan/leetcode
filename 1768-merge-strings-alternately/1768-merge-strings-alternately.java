class Solution {
    public String mergeAlternately(String word1, String word2) {
       StringBuilder up= new StringBuilder();
       if(word1.length()<word2.length())
       {
        for(int i=0;i<word1.length();i++){
            up.append(word1.charAt(i));
            up.append(word2.charAt(i));
        }
        String s=word2.substring(word1.length(),word2.length());
        up.append(s);
        return up.toString();
       } 
       if(word1.length()>word2.length())
       {
        for(int i=0;i<word2.length();i++){
            up.append(word1.charAt(i));
            up.append(word2.charAt(i));
        }
        String s=word1.substring(word2.length(),word1.length());
        up.append(s);
        return up.toString();
       } 
       if(word1.length()==word2.length())
       {
        for(int i=0;i<word1.length();i++){
            up.append(word1.charAt(i));
            up.append(word2.charAt(i));
        }
        return up.toString();
       } 
       return " ";
    }
    
}