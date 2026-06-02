class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length ; 

        int[] result =  new int[m+n];
        int last = m+n-1;
         while( m>0 && n>0 ){
            if(nums1[m-1] > nums2[n-1]) {
                result[last] = nums1[m-1];
                m--;
            } else { 
                result[last] = nums2[n-1];
                n--;
            }
            last--;
         }

         while(m>0) {
            result[last] = nums1[m-1];
            last--;
            m--;
         }

          while(n>0){
            result[last] = nums2[n-1];
            last--;
            n--;
        }

         int finalLength = result.length;
        double medianValue = 0;
        int index = finalLength/2;
        if(finalLength % 2 == 0) {
            medianValue = (double) (result[index] + result[index -1])/2;
        } else {
            medianValue =(double) result[index];
        }
        String formatted = String.format("%.5f", medianValue);
        return medianValue;

        
    }
}