// Activity Selection  (end time is sorted)

 import java.util.*;

public class Greedy {
public static void main(String args[]) {
    int start[] = {1, 3, 0, 5, 8, 5};
    int end[] = {2, 4, 6, 7, 9, 9};

    //end time basis sorted

    int maxAct = 0;
    ArrayList<Integer> ans = new ArrayList<>();
    
    //1st activity
    maxAct = 1;
    ans.add(0);

    int lastEnd = end[0];
    for(int i = 1; i < start.length; i++) {
        if(start[i] >= lastEnd) {
            //activity selection
            maxAct++;
            ans.add(i);
            lastEnd = end[i];
            }
        }

        System.out.println("Max activities = " + maxAct);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}



// Activity Selection  (end time is not sorted)

import java.util.Arrays;
import java.util.*;

public class Greedy {
    public static void main(String args[]) {
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};

        //sorting
        int activities[][] = new int [start.length][3];
        for(int i = 0; i < start.length; i++) {
            activities[i][0] = i;
            activities[i][1] = start[i];
            activities[i][2] = end[i];
        }

        //lambda function -> shortform
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));  // sorting based on end time

        int maxAct = 0;
        ArrayList<Integer> ans = new ArrayList<>();

        maxAct = 1;
        ans.add(activities[0][0]);
        
        int lastEnd = activities[0][2];
        for(int i = 1; i < start.length; i++) {
            if(activities[i][1] >= lastEnd) {
                maxAct++;
                ans.add(activities[i][0]);
                lastEnd = activities[i][2];
            }
        }

        System.out.println("max activities = " + maxAct);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();
    }
}



//Fractional Knapsack

import java.util.*;
import java.util.Arrays;

public class Greedy {
    public static void main(String args[]) {
        int value[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[value.length][2];
        
        for(int i = 0; i < value.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = value[i]/(double)weight[i];
        }

        //ascending order
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));

        int capacity = W;
        int finalValue = 0;
        for(int i = ratio.length - 1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if(capacity >= weight[idx]) {  //include full item
                finalValue += value[idx];
                capacity -= weight[idx];
            } else {
                //include fractional
                finalValue += (ratio[i][1] * capacity);
                capacity = 0;
                break;
            }
        }

        System.out.println("final value is " + finalValue);
    }
}



//Minimum Absolute Difference Pairs

import java.util.*;
import java.util.Arrays;

public class Greedy {
    public static void main(String args[]) {
        int A[] = {1, 4, 7, 8};
        int B[] = {2, 3, 5, 6};

        Arrays.sort(A);
        Arrays.sort(B);

        int minDiff = 0;
        for(int i = 0; i < A.length; i++) {
            minDiff += Math.abs(A[i] - B[i]);
        }

        System.out.println("min absolute is " + minDiff);
    }
}



//Max Length Chain of Pairs  //0 (nlogn)

import java.util.*;
import java.util.Arrays;

public class Greed {
    public static void main(String args[]) {
        int pairs [][] = {{5, 24}, {39, 60}, {5, 28}, {27, 40}, {50, 90}};
        int pairs2 [][] = new int [pairs.length][3];
        for(int i = 0; i < pairs2.length; i++) {
            pairs2[i][0] = i;
            pairs2[i][1] = pairs[i][0];
            pairs2[i][2] = pairs[i][1];
        }

        ArrayList<Integer> ans = new ArrayList<>();

        Arrays.sort(pairs2, Comparator.comparingDouble(o -> o[2]));

        int larChain = 1;
        int endChain = pairs2[0][2];
        ans.add(0);

        for(int i = 1; i < pairs.length; i++) {
            if(pairs2[i][1] >= endChain) {
                larChain++;
                ans.add(pairs2[i][0]);
                endChain = pairs2[i][2];
            }
        }

        System.out.println("longest chain is " + larChain);
        for(int i = 0; i < ans.size(); i++) {
            System.out.print("Pair " + ans.get(i) + " ");
        }
    }
}

//Indian Coins

import java.util.*;
import java.util.Arrays;

public class Greedy {
    public static void main(String args[]) {
        Integer coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};

        Arrays.sort(coins, Comparator.reverseOrder());

        int countOfCoins = 0;
        int amount = 590;

        ArrayList<Integer> ans = new ArrayList<>();

        for(int i = 0; i < coins.length; i++) {
            if(coins[i] <= amount) {
                while (coins[i] <= amount) {
                    countOfCoins++;
                    ans.add(coins[i]);
                    amount -= coins[i];
                }
            }
        }
        System.out.println("total min coins used " + countOfCoins);

        for(int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }
}



//Chocola Problem

import java.util.*;
import java.util.Arrays;;

public class Greedy {
    public static void main(String args[]) {
        int n = 4, m = 6;
        Integer costVer[] = {2, 1, 3, 1, 4};  //m-1
        Integer costHor[] = {4, 1, 2};  // n-1

        Arrays.sort(costVer, Comparator.reverseOrder());
        Arrays.sort(costHor, Comparator.reverseOrder());

        int h = 0, v = 0;
        int horizontalPieces = 1, verticalPieces = 1;
        int cost = 0;

        while(h < costHor.length && v < costVer.length) {
            if(costVer[v] <= costHor[h]) {
                cost += (costHor[h] * verticalPieces);
                horizontalPieces++;
                h++;
            } else {
                cost += (costVer[v] * horizontalPieces);
                verticalPieces++;
                v++;
            }
        }

        while(h < costHor.length) {
            cost += (costHor[h] * verticalPieces);
            horizontalPieces++;
            h++;
        }

        while(v < costVer.length) {
            cost += (costVer[v] * horizontalPieces);
            verticalPieces++;
            v++;
        }

        System.out.println("min cost of cuts = " + cost);
    }
}
