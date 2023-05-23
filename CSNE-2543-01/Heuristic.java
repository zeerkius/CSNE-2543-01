import java.util.Arrays;

class Heuristic{

    int [] Row = {2,1,-1,-2,-2,-1,1,2};
    int [] Column = {-1,-2,-2,-1,1,2,2,1};
  

    int RowVar = 0;
    int ColumnVar = 0;
    int location = 1;
    boolean error = false;








    int [][] HeuristicBoard = new int[][]     {{2,3,4,4,4,4,3,2},
                                               {3,4,6,6,6,6,4,3},
                                               {4,6,8,8,8,8,6,4},
                                               {4,6,8,8,8,8,6,4},
                                               {4,6,8,8,8,8,6,4},
                                               {4,6,8,8,8,8,6,4},
                                               {3,4,6,6,6,6,4,3},
                                               {2,3,4,4,4,4,3,2}};






public void HeuristicTour()
{

    for (int i = 0; i < HeuristicBoard.length ; i++ ){
        for (int j = 0; j < HeuristicBoard.length ; j++){
        do{
            RowVar += Row[i];
            ColumnVar += Column[i];
            if((RowVar < 0 || RowVar > 7) || (ColumnVar < 0 || ColumnVar > 7)){
                RowVar = RowVar - Row[i];
                ColumnVar = ColumnVar - Column[i];
                error = true;
                continue;
                // It can make the move so it continues like that
                // Here it checks for values in from least to greatest
            } 
            if (HeuristicBoard[RowVar][ColumnVar] == 2){
                HeuristicBoard[RowVar][ColumnVar] += location;
                location += 1;
                error = false;
            }
            if (HeuristicBoard[RowVar][ColumnVar] == 3){
                HeuristicBoard[RowVar][ColumnVar] += location;
                location += 1;
                error = false;
            }
            if (HeuristicBoard[RowVar][ColumnVar] == 4){
                HeuristicBoard[RowVar][ColumnVar] += location;
                location += 1;
                error = false;
            }
            if (HeuristicBoard[RowVar][ColumnVar] == 6){
                HeuristicBoard[RowVar][ColumnVar] += location;
                location += 1;
                error = false;
            }
            if (HeuristicBoard[RowVar][ColumnVar] == 8){
                HeuristicBoard[RowVar][ColumnVar] += location;
                location += 1;
                error = false;
            }
        }while(error == false);

    
        }
        
    
    }
    //System.out.print(Arrays.deepToString(HeuristicBoard));
    // Print the board
    for(int a = 0; a < Row.length; a++)
    {
        for( int b = 0; b < Column.length; b++)
        {
            System.out.print(HeuristicBoard[a][b] + " ");
        }
        System.out.println();
    }
    }
  








}


