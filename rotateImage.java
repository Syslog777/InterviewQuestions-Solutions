/*Codefights.com*/
/*
You are given an n x n 2D matrix that represents an image. Rotate the image by 90 degrees (clockwise).

Try to solve this in-place - in a real interview, you will only be allowed to use O(1) additional memory.

Example

For

a = [[1, 2, 3],
     [4, 5, 6],
     [7, 8, 9]]

the output should be

rotateImage(a) =
    [[7, 4, 1],
     [8, 5, 2],
     [9, 6, 3]]

Input/Output

    [time limit] 3000ms (java)

    [input] array.array.integer a

    Guaranteed constraints:
    1 ≤ a.length ≤ 100,
    a[i].length = a.length,
    1 ≤ a[i][j] ≤ 104.

    [output] array.array.integer
*/

int[][] rotateImage(int[][] a) {
    int aLength = a.length;
    int[][] newArray = new int[aLength][aLength];
    int x = aLength - 1;
    int y = 0;
    
    for (int[] innerArray: a)
    {
        for (int num: innerArray)
        {
            newArray[y][x] = num;
            y++;
        }
        x--;
        y = 0;
    }
    return newArray;
}

