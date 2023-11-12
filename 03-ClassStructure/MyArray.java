import java.util.Arrays;


public class MyArray {
    public static int even(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]%2==0){
                count+=1;
            }
        }
        return count;
    }

    public static int positiveOdd(int[] array){
        int count = 0;
        for (int i=0; i<array.length; i++){
            if (array[i]>=0){
                if (array[i]%2!=0){
                    count+=1;
                }
            }
        }
        return count;
    }

    public static int[] reverse(int[] array){
        int[] a = new int[array.length];
        for (int i=array.length-1; i>0; i--){
            a[i] = array[array.length-1-i];
        }
        return a;
    }

    public static boolean compare(int[] array1, int[] array2){
        if (array1.equals(array2)){
            return true;
        } else {
            return false;
        }
    }

    // public static int[] different(int[] array1, int[] array2){
    //     int resultSize = 0;
    //     if (!(array1.equals(array2))){
    //         for (int num1: array1){
    //             for (int num2: array2){
    //                 if (num1!=num2){
    //                     resultSize++;
    //                 }
    //             }
    //         }
    //     }
    //     int[] resultArray = new int[resultSize];
    //     for (int i=1; i<resultArray.length; i++){
    //         System.out.println(resultArray[i]);
    //     }
    //     return resultArray[];
    // }

    public static int[] different(int[] array1, int[] array2){
        int[] resultArray = new int[array1.length];
        int resultSize=0;

        for(int num1 :array1){
            boolean found = false;
            for(int num2:array2){
                if(num1==num2){
                    found=true;
                    break;
                }
            }
            if(!found){
                resultArray[resultSize]=num1;
                resultSize++;
            }
        }

        int[] trimmedResultArray = new int[resultSize];
        System.arraycopy(resultArray, 0, trimmedResultArray, 0, resultSize);
        return trimmedResultArray;
    }

    public static boolean exist(int number, int[] array){
        for (int num : array){
            if (num==number){
                return true;
            }
        }
        return false;
    }

    public static int secondMax(int[] array){
        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int num: array){
            if (num>max){
                max = num;
            }
            if (num != max && num>second){
                second=num;
            }
        }
        return second;
    }

    public static int lastColumn(int[][] array){
        int rows = array.length;
        int lastColumnIndex = array[0].length-1;
        int sum = 0;

        for (int i=0; i<rows; i++){
            sum+=array[i][lastColumnIndex];
        }

        return sum;
    }

    public static int[][] swap(int[][] array){
        int rows = array.length;
        int columns = array[0].length;

        int[][] result = new int [rows][columns];

        for (int i =0; i<rows; i++){
            result[i][0]=array[i][columns-1];
            for(int j=1; j<columns-1;j++){
                result[i][j]=array[i][j];
            }
                result[i][columns-1] = array[i][0];
        }
        return result;
    }

    public static int[] two2one(int[][] array){
        int rows=array.length;
        int columns = array[0].length;

        int[] result= new int[columns*rows];
        int index = 0;

        for(int i = 0; i<rows; i++){
            for(int j = 0; j<columns; j++ ){
                result[index]=array[i][j];
                index++;
            }
        }
        return result;
    }

    public static void main(String[] args){
        int[] numbers = {-1,1};
        int[] number2 = {0,1,4,2,100};
        int[][] matrix = {{1,2,3,4}, {2,3,4,5}, {3,4,5,6}, {4,5,6,7}};
        int[][] swapped = swap(matrix);
        int[] twooned = two2one(matrix);
        for(int i = 0; i<twooned.length; i++){
            System.out.print(twooned[i] + " ");
        }
    }
}