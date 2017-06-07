/*Codefights.com*/
/*You have two integer arrays, a and b, and an integer target value v. Determine whether there is a pair of numbers, where one number is taken from a and the other from b, that can be added together to get a sum of v. Return true if such a pair exists, otherwise return false.

Example

For a = [1, 2, 3], b = [10, 20, 30, 40], and v = 42, the output should be
sumOfTwo(a, b, v) = true.

Input/Output

    [time limit] 3000ms (java)

    [input] array.integer a

    An array of integers.

    Guaranteed constraints:
    0 ≤ a.length ≤ 105,
    -109 ≤ a[i] ≤ 109.

    [input] array.integer b

    An array of integers.

    Guaranteed constraints:
    0 ≤ b.length ≤ 105,
    -109 ≤ b[i] ≤ 109.

    [input] integer v

    Guaranteed constraints:
    -109 ≤ v ≤ 109.

    [output] boolean

    true if there are two elements from a and b which add up to v, and false otherwise.

*/
boolean tripletSum(int x, int[] a) {
    int blank;
    int length = a.length;
    
    for (int d = 0; d < length; d++)
    {
        for (int c = d + 1; c < length; c++)
        {
            for (int b = c + 1; b < length; b++)
            {
                blank = a[d] + a[c] + a[b];
                
                if (blank == x) return true;
            }
        }
    }
    return false;
}
