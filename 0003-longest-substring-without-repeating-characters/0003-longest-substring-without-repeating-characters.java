class Solution {
    public int lengthOfLongestSubstring(String s) {

     HashSet<Character> set=new HashSet<>();   
     int end=0;
     int start=0;
     int maxsum=0;
     while(end<s.length())
     {
        char c=s.charAt(end);
        if(!set.contains(c))
        {
            set.add(c);
            maxsum=Math.max(maxsum,end-start+1);
            end++;
        }
        else
        {
            set.remove(s.charAt(start));
            start++;
        }
     }
     return maxsum;
    }
}