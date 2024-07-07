class Solution {
    public String maximumTime(String time) {
        String[] result = time.split(":");
        result[0] = upto23(result[0]);
        result[1] = upto59(result[1]);
        return result[0] + ":" + result[1];
    }

    public String upto23(String time) {
        if (time.equals("??")) {
            return "23";
        }
        char shiwei = time.charAt(0);
        char gewei = time.charAt(1);
        
        if (shiwei == '?') {
            return (gewei <= '3' || gewei == '?') ? "2" + (gewei == '?' ? '3' : gewei) : "1" + gewei;
        }
        if (gewei == '?') {
            return shiwei == '2' ? "2" + '3' : shiwei + "9";
        }
        return time;
    }

    public String upto59(String time) {
        if (time.equals("??")) {
            return "59";
        }
        char shiwei = time.charAt(0);
        char gewei = time.charAt(1);
        
        if (shiwei == '?') {
            return "5" + gewei;
        }
        if (gewei == '?') {
            return shiwei + "9";
        }
        return time;
    }
}
