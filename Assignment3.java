public class Exercise {
    public static void main (String[] args) throws Exception {
        int [][] mdArray = {{1,2,3,4}, {5,6,7,8}, {9,10,11,12},{13,14,15,16}};

        //PATTERN 1
        System.out.println ("1. SUM OF PATTERN 1");
        int sum = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 0) {
                sum += mdArray[i][j];
                }
            }
            break;
        }
        System.out.println(sum);
       

        //PATTERN 2
        System.out.println ("");
        System.out.println ("2. SUM OF PATTERN 2");
        int sum1 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (j == 0) {
                sum1 += mdArray[i][j];
                }
            }    
        }
        System.out.println(sum1);
        

        //PATTERN 3
        System.out.println ("");
        System.out.println ("3. SUM OF PATTERN 3");
        int sum2 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if (i == 0 || j == 0) {
                sum2 += mdArray[i][j];
                }
            }    
        }
        System.out.println(sum2);
        

        //PATTERN 4
        System.out.println ("");
        System.out.println ("4. SUM OF PATTERN 4");
        int sum3 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 0 && j == 0) || (i == 3 && j == 3)) {
                sum3 += mdArray[i][j]; 
                }
                if ((i == 0 && j == 3) || (i == 3 && j == 0)) {
                sum3 += mdArray[i][j];
                }
            }    
        }
        System.out.println(sum3);
        

        //PATTERN 5
        System.out.println ("");
        System.out.println ("5. SUM OF PATTERN 5");
        int sum4 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 1 && j == 1) || (i == 2 && j == 2)) {
                sum4 += mdArray[i][j]; 
                }
                if ((i == 1 && j == 2) || (i == 2 && j == 1)) {
                sum4 += mdArray[i][j];
                } 
            }    
        }
        System.out.println(sum4);
        

        //PATTERN 6
        System.out.println ("");
        System.out.println ("6. SUM OF PATTERN 6");
        int sum5 = 0;
        for (int i = 0; i < mdArray.length; i++) {
            for (int j = 0; j < mdArray.length; j++) {
                if ((i == 1 && j == 1) || (i == 2 && j == 2) || (i == 1 && j == 2) || (i == 2 && j == 1) || (i == 0 && j == 0) 
                    || (i == 3 && j == 3) || (i == 0 && j == 3) || (i == 3 && j == 0)) {
                sum5 += mdArray[i][j]; 
                }
            }    
        }
        System.out.println(sum5);
    }  
}

