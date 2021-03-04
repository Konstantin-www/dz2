package DZ2;

public class dz2 {
    public static void main(String[] args){

        System.out.println("\r1 - задание");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] == 1 ? 0 : 1;
            System.out.print(arr[i] + " ");
        }


        System.out.println("\r\n2 - задание");
        int[] arr1 = new int[8];
        for (int i = 1, j = 0; i < arr1.length; i++) arr1[i] = j += 3;
        for (int x : arr1) System.out.print(x + " ");



        System.out.println("\r\n3 - задание");
        int[] arr2 = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr2.length; i++) {
            if (arr2[i] < 6) arr2[i] *= 2;
            System.out.print(arr2[i] + " ");
        }


        System.out.println("\r\n4 - задание");
        int[][] arr3 = new int[5][5];
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0, j2 = arr3[i].length; j < arr3[i].length; j++, j2--) {
                if (i == j || i == (j2 - 1)) arr3[i][j] = 1;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.print("\r\n");
        }


        System.out.println("\r\n5 - задание");
        int[] arr4 = {9, 3, 5, 7, 10, 1, 2, 4, 6, 8, 11, 12};
        int min = arr4[0], max = arr4[0], indMax = 0, indMin = 0;
        for (int i = 0; i < arr4.length; i++) {
            if (arr4[i] > max) {
                max = arr4[i];
                indMax = i;
            }
            if (arr4[i] < min) {
                min = arr4[i];
                indMin = i;
            }
        }
        System.out.println("Максимальный элемент находится в массиве под индексом " + indMax + " со значением  = " + max);
        System.out.println("Минимальный элемент находится в массиве под индексом " + indMin + " со значением  = " + min);


    }




















    }



















