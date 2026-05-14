class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count=new int[26];
        for(char a: magazine.toCharArray()){
            count[a-'a']++;
        }
        for(char a: ransomNote.toCharArray()){
            if(count[a-'a']==0){
                return false;
            }
            count[a-'a']--;
        }
        return true;
    }
}