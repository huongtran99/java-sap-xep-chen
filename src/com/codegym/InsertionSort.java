package com.codegym;

public class InsertionSort {

    static int arrList[] = {3, 2, 4, 8, -1, 0, 5, 7};
// 2 3
    public static void main(String[] args) {
        System.out.println("Mảng ban đầu:");
        for (int arr: arrList) {
            System.out.print(arr + " ");
        }
        insertionSort(arrList);
        System.out.println("Mảng sau khi sắp xếp:");
        for (int arr: arrList) {
            System.out.print(arr + " ");
        }
    }

    private static void insertionSort(int[] list){
        int key, j;
        for (int i = 1; i < list.length; i++) {
            key = list[i];
            j = i-1;
            System.out.println();
            while (j >= 0 && list[j] > key) {
                System.out.println("so sánh " + list[j] + " > " + key + " đổi chỗ " + key + " " + list[j]);
                list[j+1] = list[j];
                j = j-1;
            }
            list[j+1] = key;
            for (int arr: arrList) {
                System.out.print(arr + " ");
            }
            System.out.println();
        }
    }

}
