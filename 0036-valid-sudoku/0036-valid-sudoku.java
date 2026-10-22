class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res=true;

        for(int i=0; i<8; i+=3){
            for(int j=0; j<8; j+=3){

                ArrayList<Character> arr=new ArrayList<>();
                for(int k=0; k<3; k++){
                        for(int l=0; l<3; l++){
                            char x=board[i+k][j+l];
                            if(x== '.') continue;
                            if(arr.contains(x)) return false;
                            arr.add(x);
                        }
                }
            }
        }

        for(int i=0; i<9; i++){
            
                ArrayList<Character> arr=new ArrayList<>();
                
                ArrayList<Character> arr1=new ArrayList<>();
            
            for(int j=0; j<9; j++){

                if(board[i][j] == '.') continue;
                if(arr.contains(board[i][j])) return false;

                arr.add(board[i][j]);

            }
            for(int j=0; j<9; j++){
                

                if(board[j][i] == '.') continue;
                if(arr1.contains(board[j][i])) return false;

                arr1.add(board[j][i]);

            }
        }

        return true;
        
    }
}