package Recursion;

public class Basic {
    public static void printDec(int n) {
        if (n==1){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printDec(n-1);
    }
    public static void printInc(int n){
        if (n==1){
            System.out.print(n+" ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n){
        if (n==0){
            return 1;
        }
        return n * fact(n-1);
    }

    public static int calSum(int n){
        if (n==1){
            return 1;
        }
        return n + calSum(n-1);
    }

    public static int fab(int n){
        if (n==0|| n==1){
            return n;
        }
        return fab(n-1)+fab(n-2);
    }

    public static boolean isSorted(int[] arr, int i){
        if (i == arr.length -1){
            return  true;
        }
        if(arr[0]>arr[i+1]){
            return false;
        }
        return isSorted(arr, i+1);
    }

    public static int firstOcc(int arr[],int key, int i){
        if (i == arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        return firstOcc(arr,key,i+1);
    }

    public static int lastOcc(int[] arr, int key, int i){
        if (i == arr.length){       
            return -1;
        }
        int isFound = lastOcc(arr, key, i+1);
        if (isFound == -1 && arr[i]==key){
            return i;
        }
        return isFound;
    }

    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        return x * power(x,n-1);
    }

    public static int powerOpt(int x, int n){
        if (n==0) {
        return 1;
        }
        int hp = powerOpt(x,n/2) * powerOpt(x, n/2);

        if (n%2!=0){
            return hp * x;
        }
        return hp;
    }

    public static int tilingProblem(int n){ //2*n
        if (n==0 || n==1){
            return 1;
        }
        //kaam
        int fnm1 = tilingProblem(n-1);
        int fnm2 = tilingProblem(n-2);

        return fnm1 + fnm2;
    }

    public static void main(String[] args) {
        int n = 10;
//      printDec(n);
//      printInc(n);
//        System.out.println(fact(5));
//        System.out.println(calSum(5));
//        System.out.println(fab(6));
        int arr[] = {1,2,3,4};
        int occ[]={8,3,6,9,5,10,2,5,3};
//        System.out.println(occ.length);
//        System.out.println(firstOcc(occ,5,0));
//        System.out.println(lastOcc(occ,5,0));
//        System.out.println(isSorted(arr,0));
//        System.out.println(powerOpt(2,11));
        System.out.println(tilingProblem(3));
    }

}
