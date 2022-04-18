package com.TomaszB.Lab1;

public class Task3 {
    public static void main(String[] args){
        int array[] = new int[] {1, 4, 7, 12, 32, 53, 55, 61, 65, 71};
        var index = searchIndex(array, 14);
        System.out.println(index);
    }
    public static int searchIndex(int[] array, int value)
    {
        int index = 0;
        int limit = array.length -1;
        while (index<= limit)
        {
            int point = (int) Math.ceil((index+limit)/2);
            int entry = array[point];
            if (value > entry) {
                index = point + 1;
                continue;
            }
            if (value < entry) {
                limit = point - 1;
                continue;
            }
            return point;
        }
        return -1;

    }
}