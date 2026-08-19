package BackTracking;
//https://leetcode.com/problems/word-search/description
//time complexity: O(3^L) where L is the length of the word
//space complexity: O(L) where L is the length of the word
//approach: we can use backtracking to find the word in the given matrix. We can use a boolean array to keep track of the visited status of each cell in the matrix. We can use a for loop to iterate through the matrix and find the starting index of the word. We can call the backtracking function recursively to check the adjacent cells for the next character in the word. If we reach the end of the word, we return true. If we reach a dead end, we backtrack and mark the cell as unvisited.
//technologies used: Java, Backtracking, boolean array 
public class WordSearch {
    public boolean exist(char[][] board, String word) {

        int n=board.length; //row size
        int m=board[0].length; //column size

        boolean[][] visited=new boolean[n][m]; //To check the visited status because there in no repetation 

        boolean result; // To store the result

        // To find the start index of the word match with the matrix
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(board[i][j]==word.charAt(0))
                {
                    result=backTrack(n,m,board,word,i,j,visited,0);
                    if(result) // if word is formed return true
                        return true;
                }
            }
        }
        return false; //if there is no start index in the matrix or not able to form the word return false
    }
    private static boolean backTrack(int n,int m, char[][] board,String word,int i,int j,boolean[][] visited,int length)
    {
        if(word.length()==length) // if full word is formed return true
        {
            return true;
        }

        //checking the index out of bound , already visited status and word equality conditions 
        if(i<0 || i>n-1 || j<0 || j>m-1 || visited[i][j] || board[i][j]!=word.charAt(length))
        {
            return false;
        }

        visited[i][j]=true; //it is valid character make the visited status true

        //checking the adjacent index with the next character 
        if( backTrack(n,m,board,word,i+1,j,visited,length+1)  ||
            backTrack(n,m,board,word,i-1,j,visited,length+1) ||
            backTrack(n,m,board,word,i,j+1,visited,length+1) ||
            backTrack(n,m,board,word,i,j-1,visited,length+1) )
            {
                return true;
            }

        //if it is dead end set the visited status as false and return false
        visited[i][j]=false;
        return false;

    }
}
