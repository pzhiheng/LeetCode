class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int i = 0 ; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
                queue.offer(matrix[i][j]);
            }
        }
        for (int i = 0 ; i < k-1 ; i++){
            queue.poll();
        }
        return queue.poll();
        
    }
}
