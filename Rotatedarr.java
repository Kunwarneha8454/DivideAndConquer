public class Rotatedarr {
    /*
     * QUE - Sorted,Rotated array with distinct numbers (in ascending order) It is
     * rotated at a pivot point.
     * find the index of given element.
     */

    public static int Search(int arr[], int target, int si, int ei) {
        if(si>ei){
            return -1;
        }

        int mid = si + (ei-si) / 2;
        //Case:target FOUND.
        if(arr[mid]==target) {
            return mid;
        }

        if(arr[si] <= arr[mid]) {
            if(arr[si] <= target && target <= arr[mid]) {
                return Search(arr, target, si, mid);
            }else{
                return Search(arr, target, mid+1, ei);
            }
        }
        else{
            if(arr[mid] <= target && target<=arr[ei]){
                return Search(arr, target, mid+1, ei);
            }

            return Search(arr, target, si, mid-1);
        }


    }

    public static void main(String args[]) {
        int arr[] = { 4, 5, 6, 7, 8, 0, 1, 2, 3 };
        int target = 0;
        int tarIdx = Search(arr, target, 0, arr.length - 1);
        System.out.println(tarIdx); // (tarIdx = target index:)
    }

}
