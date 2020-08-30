class Stam 
{ 
    private int[][] mat;
    public Stam(int row,int col) 
    {   
        mat = new int[row][col]; 
        for (int i = 0; i < mat.length; i++) 
        { 
            for (int j = 0; j < mat[0].length; j++) 
            { 
                mat[i][j] = ((int)(Math.random()*201))-100; 
            } 
        } 
    }
    
    public String isOrdered()
    {
        for(int i = 0; i < this.mat.length; i++)
        {
            int cntr = 0;
            for(int j = 0; j < this.mat[i].length; j++)
            {
                if(this.mat[i][j] > 0)
                    cntr++;
            }
            if(cntr != i)
                return "unordered";
        }
        return "ordered";
    }
    
    public int numNegCol(int col)
    {
        int cntr = 0;
        for(int i = 0; i < this.mat.length; i++)
        {
            if(this.mat[i][col] < 0)
            {
                cntr++;
            }
        }
        return cntr;
    }
    
    public int maxNegCol(int col)
    {
        int num, currSum;
        currSum = this.numNegCol(0);
        num = 0;
        for(int i = 1; i <  this.mat[i].length; i++)
        {
            if(this.numNegCol(i) > currSum)
            {
                currSum = this.numNegCol(i);
                num = i;
            }
        }
        return num;
    }
}