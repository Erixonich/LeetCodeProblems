/**
 * Created by Erixon on 05.06.2017.
 */
public class P4MedianofTwoSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ret = 0;
        int m,n;

        boolean even = false;
        boolean use1, use2;
        use1 = use2 =true;
        if (nums1.length == 0) use1 = false;
        if (nums2.length == 0) use2 = false;
        m = n = 0;

        int ln = nums1.length + nums2.length;

        if (ln%2 == 0) even = true;
        int[] num = new int[ln];
        for (int i = 0; i <= ln/2; i++) {
            if(use1 && use2){
                if (nums1[m] < nums2[n]){
                    num[i] = nums1[m];
                    m++;
                    if (m >= nums1.length) use1 =false;
                } else{
                    num[i] = nums2[n];
                    n++;
                    if (n >= nums2.length) use2 =false;
                }
            }
            else if(use1){
                num[i] = nums1[m];
                m++;
            } else{
                num[i] = nums2[n];
                n++;
            }
        }
        if (even) ret = (double) (num[ln/2] + num[ln/2-1])/2;
        else ret = (double) num[ln/2];
        return ret;
    }
}
