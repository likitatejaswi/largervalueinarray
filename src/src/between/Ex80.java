package between;

public class Ex80 {
    public int large(int[] array){
        int max = -1;

        for(int i = 0; i< array.length; i++){
            if(array[i] > max){
                max = array[i];

            }
        }
        return max;
    }
}
