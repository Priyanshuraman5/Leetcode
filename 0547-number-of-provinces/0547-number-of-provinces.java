class Solution {
    public void bfs(int[][] isConnected,int i, boolean[]isVis){
        int n = isConnected.length;
        Queue<Integer> q = new LinkedList<>();
        q.add(i);
        isVis[i] = true;
        while(!q.isEmpty()){
            int poll = q.poll();
            for(int j=0;j<n;j++){
                if(isConnected[poll][j]==1 && !isVis[j]){
                    isVis[j] = true;
                    q.add(j);
                }
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length;
        boolean[]isVis = new boolean[n];
        int count = 0;
        for(int i=0;i<n;i++){
            if(!isVis[i]){
                bfs(isConnected,i,isVis);
                count++;
            }
        }
        return count;
    }
    // class Pair{
    //     int row;
    //     int col;
    //     public Pair(int row, int col){
    //         this.row = row;
    //         this.col = col;
    //     }
    // }
    // public void bfs(int[][] isConnected,int row,int col,boolean[][] isVis){
    //     int n = isConnected.length;
    //     Queue<Pair> q = new LinkedList<>();
    //     q.add(new Pair(row,col));
    //     isVis[row][col] = true;
    //     while(!q.isEmpty()){
    //         Pair p = q.poll();
    //         int currRow = p.row;
    //         int currCol = p.col;
    //         int[] remRow = {1,0,-1,0};
    //         int[] remCol = {0,-1,0,1};
    //         for(int i=0;i<4;i++){
    //             int newRow = remRow[i] + currRow;
    //             int newCol = remCol[i] + currCol;
    //             if(newRow>=0 && newCol>=0 && newRow<m && new)
    //             if(newRow>=0 && newCol>=0 && newRow<m && new)
    //             if(newRow>=0 && newCol>=0 && newRow<m && newCol<n && !isVis[newRow][newCol] && isConnected[newRow][newCol]==){
    //                 q.add(new Pair(newRow,newCol));
    //                 isVis[newRow][newCol] = true;
    //             }
    //         }
    //     }

    // }
}