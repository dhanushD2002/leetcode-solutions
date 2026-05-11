class Solution {
    public int romanToInt(String s) {
        int a=0;
        int b=0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I': a=1;
                break;

                case 'V': a=5;
                break;

                case 'X': a=10;
                break;
                
                case 'L': a=50;
                break;

                case 'C': a=100;
                break;

                case 'D': a=500;
                break;

                case 'M': a=1000;
                break;
            }
            if(4*a<b){
                b=b-a;
            }
            else{
                b=b+a;
            }
        }
        return b;
    }
}