import java.util.Arrays;

class Solution {
    public int countPoints(String rings) {
        boolean [][] array = new boolean [10][3];
        for (boolean[] a : array) {
            Arrays.fill(a, false);
        }

        for (int i = 0; i < rings.length(); i += 2) {
            char color = rings.charAt(i);
            int rod = Character.getNumericValue(rings.charAt(i + 1));
            int col = 0;
            
            switch (color) {
                case 'R': col = 0; break;
                case 'G': col = 1; break;
                case 'B': col = 2; break;
            }

            array[rod][col] = true;
        }

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] && array[i][1] && array[i][2]) {
                count++;
            }
        }

        return count;
    }
}
