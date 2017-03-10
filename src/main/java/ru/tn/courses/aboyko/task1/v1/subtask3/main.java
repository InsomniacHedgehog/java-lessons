import java.util.Arrays;

    public static void main(String[] args){

        int [] arrayFirst = {-5, 0, 1, 2, 26, 47, 82};
        int [] arraySecond = {-6, 3, 4, 5, 90 };

        System.out.println("Созданны массивы: \n" +
                "A = " + Arrays.toString(arrayFirst) +
                " B = " + Arrays.toString(arraySecond));

        System.out.println("Отсортированный массив: " );

        int i = 0;
        int j = 0;

        while (i != arrayFirst.length && j != arraySecond.length){
            if (arrayFirst[i] <= arraySecond[j]){
                System.out.print(arrayFirst[i] + " ");
                    i++;
            }
            else if (arrayFirst[i] > arraySecond[j]){
                System.out.print(arraySecond[j] + " ");
                    j++;
            }

            if (i == arrayFirst.length){
                while (j != arraySecond.length){
                    System.out.print(arraySecond[j] + " ");
                    j++;
                }
            }
            else if (j == arraySecond.length){
                while (i != arrayFirst.length){
                    System.out.print(arrayFirst[i] + " ");
                    i++;
                }
            }
        }   
    }
