class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] arr=new int[nums1.length+nums2.length];
        int n=arr.length;
        int i=0,j=0,k=0;
        while(i<nums1.length){
            arr[k++]=nums1[i++];
        }
        while(j<nums2.length){
            arr[k++]=nums2[j++];
        }

        Arrays.sort(arr);

        if(n%2==1){
            return arr[n/2];
        }
        else{
            return (arr[n/2-1]+arr[n/2])/2.0;
        }

        
    }
}
