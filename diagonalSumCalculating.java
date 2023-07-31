public class diagonalSumCalculating {
    public static void main(String[] args) {
        int [][] multiArray = {{1,2,3,4},
                               {5,6,7,8},
                            {9,10,11,12},
                           {13,14,15,16}} ;

        int totalSum = 0 ;
        // Optimized Way In terms of time complexity
        for (int i=0 ; i<multiArray.length ; i++){

            totalSum+= multiArray[i][i] ;   // i==j

            if (i!=multiArray.length-i-1){  // i+j = n // j = n-i-1
                 totalSum+=multiArray[i][multiArray.length-i-1] ;
             }
        }
        System.out.println("Total Primary and Secondary Diagonal Sum Is : "+totalSum);
    }
}
