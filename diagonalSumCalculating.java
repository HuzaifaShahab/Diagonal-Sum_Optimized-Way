public class diagonalSumCalculating {
    public static void main(String[] args) {
        int [][] multiarray = {{1,2,3,4},
                               {5,6,7,8},
                            {9,10,11,12},
                           {13,14,15,16}} ;

        int totalSum = 0 ;
        // Optimized Way In terms of time complexity.
        for (int i=0 ; i<multiarray.length ; i++){

            totalSum+= multiarray[i][i] ;   // i==j

            if (i!=multiarray.length-i-1){  // i+j = n -- j = n-i-1
                 totalSum+=multiarray[i][multiarray.length-i-1] ;
             }
        }
        System.out.println("Total Primary & Secondary Diagonal Sum Is : "+totalSum);
    }
}
