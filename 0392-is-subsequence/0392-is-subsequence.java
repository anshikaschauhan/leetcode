class Solution {
    public boolean isSubsequence(String s, String t) {
        int k=0;
        int count=0;
       for(int i=0;i<s.length();i++)
       {
         for(int j=k;j<t.length();j++)
         {
            if(s.charAt(i)==(t.charAt(j)))
            {
                count++;
                k=j+1;
                break;

            }
         }
       } 
       if(count==s.length())
       {
        return true;
       }
       return false;
    }
}