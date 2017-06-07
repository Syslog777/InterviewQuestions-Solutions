/*Codefights.com*/
/*Note: Write a solution with O(n2) time complexity, since this is what you would be asked to do during a real interview.

You have an array a composed of exactly n elements. Given a number x, determine whether or not a contains three elements for which the sum is exactly x.

Example

    For x = 15 and a = [14, 1, 2, 3, 8, 15, 3], the output should be
    tripletSum(x, a) = false;

    For x = 8 and a = [1, 1, 2, 5, 3], the output should be
    tripletSum(x, a) = true.

    The given array contains the elements 1,2, and 5, which add up to 8.

Input/Output

    [time limit] 3000ms (java)

    [input] integer x

    Guaranteed constraints:
    1 ≤ x ≤ 105.

    [input] array.integer a

    Guaranteed constraints:
    3 ≤ a.length ≤ 6 · 105,

    1 ≤ a[i] ≤ 105.

    [output] boolean

    Return true if the array contains three elements that add up to x and false otherwise.

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
