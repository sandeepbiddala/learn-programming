public class HighestNumberInArray {

    public static void main(String[] args) {
        System.out.println("HighestNumberInArray");
        HighestNumberInArray highestNumberInArray = new HighestNumberInArray();
        int[] integerArray = {10,5,20,100,50};
        highestNumberInArray.highestNumberInArray(integerArray);
    }

    public void highestNumberInArray(int[] integerArray){
             int maxInteger = integerArray[0];
             int lengthOfIntegerArray = integerArray.length;
             for(int i=1; i<lengthOfIntegerArray; i++) {
                 if(integerArray[i] > maxInteger){
                     maxInteger = integerArray[i];
                 }
             }
        System.out.println("Highest Number:"+ maxInteger);
    }
}

