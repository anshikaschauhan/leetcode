class Solution {
    public String reverseVowels(String s) {
      StringBuilder a= new StringBuilder();
      StringBuilder b= new StringBuilder();
      StringBuilder rev=new StringBuilder();
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
        {
            a.append(s.charAt(i));
        }
        else
        {
            b.append(s.charAt(i));
        }
      }  
      int k=a.length()-1;
      int l=0;
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
       {
        rev.append(a.charAt(k));
        k--;
       }
       else
       {
        rev.append(b.charAt(l));
        l++;
       }
      }
      return rev.toString();
    }
}