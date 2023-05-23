class Testing
{



public static void main(String[] args)
{
    int [] Row = {2,1,-1,-2,-2,-1,1,2};
    int [] Column = {-1,-2,-2-1,1,2,2,1};
  

    int RowVar = 0;
    int ColumnVar = 0;
    int location = 1;
    boolean error = false;
    

     int [][] Board = new int[][]  {{0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0},
                                   {0,0,0,0,0,0,0,0}};
    
                                   for (int i = 0; i < Board.length; i++ ){
                                    for (int j = 0; j < Board.length; j++){
                                        RowVar += Row[i];
                                        ColumnVar += Column[i];
                                        if (Board[RowVar][ColumnVar] == 0){
                                           do{
                                            try{
                                                Board[RowVar][ColumnVar] += location;
                                                error = false;
                                                if((RowVar < 0 || RowVar > 7) || (ColumnVar < 0 || ColumnVar > 7)){
                                                    error = true;
                                                }
                                            }
                                            catch(Exception e){
                                                RowVar = RowVar - Row[i];
                                                ColumnVar = ColumnVar - Column[i];
                                                error = true;
                                            }
                                            if(Board[RowVar][ColumnVar]!= 0){
                                                break;
                                            }
                                           }
                                           while(error == true);
                            
                                        }
                            
                                
                                    }
                                }System.out.println(Board);
                                




    
}



}