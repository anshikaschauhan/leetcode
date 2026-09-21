class Solution {
    public int lengthOfLastWord(String s) {
        String cont=s.trim();
        String[] split=cont.split(" ");
        String cont2 = split[split.length - 1];//last word in the statment
        int counter=0;
        for(int i=0;i<cont2.length();i++){
            counter++;
        }
        return counter;
        
    }
}