class Solution {
    public int numIslands(char[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean [][] visit = new boolean [m][n];
        int result = 0;
        Queue<int[]> queue = new ArrayDeque<int[]>();
        for (int i = 0 ; i < m ; i ++){
            for (int k = 0 ; k < n ; k ++){
                if (visit[i][k] == true){
                }
                else{
                    if (grid[i][k] == '1'){
                        result ++;
                        int[] a = new int[2];
                        a[0] = i;
                        a[1] = k;
                        queue.offer(a);
                        while(queue.isEmpty() != true){
                            int[] b = queue.poll();
                            int row = b[0];
                            int col = b[1];
                            int[][] de = {{row + 1, col}, {row-1, col}, {row, col+1}, {row, col-1}};
                            for (int h = 0 ; h < 4 ; h++){
                                int mm = de[h][0];
                                int nn = de[h][1];
                                if (mm >= 0 && nn >= 0 && mm < m && nn < n){
                                    if (visit[mm][nn] == false){
                                        visit[mm][nn] = true;
                                        if (grid[mm][nn] == '1'){
                                            int[] array = new int[2];
                                            array[0] = mm;
                                            array[1] = nn;
                                            queue.offer(array);
                                        }
                                    }
                                }

                                }
                            }

                            

                        }
                    }
                }
            }
              return result;  
        }
        

    }
