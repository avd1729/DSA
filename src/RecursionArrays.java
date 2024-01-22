import java.util.ArrayList;

public class RecursionArrays {
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,4};
        System.out.println(isSorted(arr,0));
        int idx = linearsearch(arr , 0 , 12);
        System.out.println(idx);
        ArrayList<Integer> ans = LS(arrlst , arr , 0 , 4);
        System.out.println(ans);
        LS2(arr , 0 , 4);
        System.out.println(arrlst2);
        ArrayList<Integer> ans2 = LS3(arr , 0 , 4);
        System.out.println(ans2);

    }

    static boolean isSorted(int[] arr , int idx){


        if (idx < arr.length){
            if (idx == arr.length-1){
                return true;
            }
            else {
                if (arr[idx] <= arr[idx+1]){
                    return isSorted(arr, idx + 1);
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }

    static int linearsearch(int[] arr , int idx , int target){

        if (idx <= arr.length){
            if (idx == arr.length){
                return -1;
            }
            else{
                if(arr[idx] == target){
                    return idx;
                }
                else{
                    return linearsearch(arr , idx+1 , target);
                }
            }
        }
        return -1;
    }
    static ArrayList<Integer> arrlst = new ArrayList<>();
    static ArrayList<Integer> LS(ArrayList<Integer> arrlst , int[] arr , int idx , int target){

        if (idx <= arr.length){
            if (idx == arr.length){
                if(arrlst.isEmpty()){
                    arrlst.add(-1);
                }
                return arrlst;
            }
            else{
                if(arr[idx] == target){
                    arrlst.add(idx);
                }
                return LS(arrlst ,arr , idx+1 , target);
            }
        }
        return arrlst;
    }
    static ArrayList<Integer> arrlst2 = new ArrayList<>();
    static void LS2(int[] arr , int idx , int target){

        if (idx <= arr.length){
            if (idx == arr.length){
                if(arrlst2.isEmpty()){
                    arrlst2.add(-1);
                }
            }
            else{
                if(arr[idx] == target){
                    arrlst2.add(idx);
                }
                LS2(arr , idx+1 , target);
            }
        }
    }

    static ArrayList<Integer> LS3(int[] arr , int idx , int target){

        ArrayList<Integer> arrlst = new ArrayList<>();

        if (idx == arr.length){
            return arrlst;
        }

        if (arr[idx] == target){
            arrlst.add(idx);
        }

        ArrayList<Integer> temp = LS3(arr , idx+1 , target);

        arrlst.addAll(temp);

        return arrlst;
    }

}
