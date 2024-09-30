// public class BitManipulation {
//     public static void main(String[] args) {
//         System.out.println((5 & 6));
//         System.out.println((5 | 6));
//         System.out.println((5 ^ 6));
//         System.out.println((~5));
//         System.out.println((5<<2));
//         System.out.println((6 >> 1));
//     }
// }



//check if a number is odd or even

// public class BitManipulation {
//     public static void oddOrEven(int n) {
//         int bitMask = 1;
//         if((n & bitMask) == 0) {
//             System.out.println("it is even number");
//         } else {
//             System.out.println("it is odd number");
//         }
//     }
//     public static void main(String args[]) {
//         oddOrEven(6);
//         oddOrEven(3);
//     }
// }



// operations

public class BitManipulation {
    public static void getIthBit(int n, int i) {
        int bitMask = 1<<i;
        if((n & bitMask) != 0) {
            System.out.println("1 is on this place");
        } else {
            System.out.println("0 is on this place");
        }
    }

    public static int setIthBit(int n, int i) {
        int bitMask = 1<<i;
        return n | bitMask;
    }

    public static int clearIthBit(int n, int i) {
        int bitMask = ~(1<<i);
        return n & bitMask;
    }

    public static int updateIthBit(int n, int i, int newBit) {
        if(newBit == 0) {
            return clearIthBit(n, i);
        } else {
            return setIthBit(n, i);
        }
    }

    public static int clearLastIBits(int n, int i) {
        int bitMask = -1<<i;

        return n & bitMask;
    }

    public static int clearRangeOfBits(int n, int i, int j) {
        int a = ((~0)<<(j+1));
        int b = (1<<i) - 1;
        int bitMask = a | b;
        return n & bitMask;
    }

    public static boolean isTwoPowered(int n) {
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n) {
        int count = 0;

        while(n > 0) {
            if((n & 1) != 0) {
                count++;
            }
            n = n >> 1;
        }
        return count;
    }
    public static void main(String args[]) {
        getIthBit(6, 2);
        System.out.println(setIthBit(9, 1));
        System.out.println(clearIthBit(10, 3));
        System.out.println(updateIthBit(10, 3, 0));
        System.out.println(clearLastIBits(15, 2));
        System.out.println(clearRangeOfBits(10, 2, 4));
        System.out.println(isTwoPowered(4));
        System.out.println(countSetBits(10));
    }
}