class Solution {
    public int romanToInt(String s) {
        return recur(s,0);
    }

    public int recur(String s, int i){
        if (i >= s.length()){
            return 0;
        }
        else if (i == s.length()-1){
            if (s.charAt(i) == 'I'){
                return 1;
            }
            else if (s.charAt(i) == 'V'){
                return 5;
            }
            else if (s.charAt(i) == 'X'){
                return 10;
            }
            else if (s.charAt(i) == 'L'){
                return 50;
            }
            else if (s.charAt(i) == 'C'){
                return 100;
            }            
            else if (s.charAt(i) == 'D'){
                return 500;
            }            
            else if (s.charAt(i) == 'M'){
                return 1000;
            }
        }
        else{
            if (s.charAt(i) == 'I' && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
            return -1 + recur(s, i + 1);            
            else if (s.charAt(i) == 'X' && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
            return -10 + recur(s, i + 1);            
            else if (s.charAt(i) == 'C' && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
            return -100 + recur(s, i + 1);
            else if (s.charAt(i) == 'I')
            return 1 + recur(s, i+1);
            else if (s.charAt(i) == 'V')
            return 5 + recur(s, i+1);            
            else if (s.charAt(i) == 'X')
            return 10 + recur(s, i+1);            
            else if (s.charAt(i) == 'L')
            return 50 + recur(s, i+1);            
            else if (s.charAt(i) == 'C')
            return 100 + recur(s, i+1);            
            else if (s.charAt(i) == 'D')
            return 500 + recur(s, i+1);            
            else if (s.charAt(i) == 'M')
            return 1000 + recur(s, i+1);
}
return 0;}
}
