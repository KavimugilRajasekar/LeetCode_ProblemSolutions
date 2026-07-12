class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

    //     int i = m - 1;
    //     int j = n - 1;
    //     int k = m + n - 1;

    //     while (i >= 0 && j >= 0) {

    //         if (nums1[i] > nums2[j]) {
    //             nums1[k] = nums1[i];
    //             i--;
    //         } else {
    //             nums1[k] = nums2[j];
    //             j--;
    //         }

    //         k--;
    //     }

    //     // Copy any remaining elements from nums2
    //     while (j >= 0) {
    //         nums1[k] = nums2[j];
    //         j--;
    //         k--;
    //     }
    // }
    if(n == 0){
        return ;
    }
    else if( m == 0 && n != 0 ){
        for(int i = m ; i < n ; i++){
            nums1[i] = nums2[i];
        }
        return ;
    }else{
        for(int i = m , p1 = 0 ; i < nums1.length ; i++ , p1++){
            nums1[i] = nums2[p1] ;
        }
        Arrays.sort(nums1);
        return ;    
    }
}
}