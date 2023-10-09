class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start=0;
        int end=0;
        int maxl=0;
        List<Character> l=new ArrayList<Character>();
        while(end<s.length())
        {
            if(!l.contains(s.charAt(end)))
            {
                l.add(s.charAt(end));
                end++;
                maxl=Math.max(maxl,l.size());
                    
            }
            else
            {
                l.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return maxl;
        
    }
}
