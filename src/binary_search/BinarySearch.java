/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary_search;

/**
 *
 * @author Maruf
 */
public class BinarySearch {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16};
        int mid, left = 0, right = arr.length - 1, flag = 0;
        while (left <= right) {
            mid = (left + right) / 2;
            if (arr[mid] == 16) {
                flag = 1;
                System.out.println(mid);
            }
            if (arr[mid] < 16) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if (flag == 0) {
            System.out.println("Value not found by binary search");
        }

    }

}
