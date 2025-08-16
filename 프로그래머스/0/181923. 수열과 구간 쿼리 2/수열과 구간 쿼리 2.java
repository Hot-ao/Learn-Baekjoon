class Solution {
    public static int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        
        for (int l=0;l<queries.length;l++) {
        		answer[l]=-1;
        		int s=queries[l][0];
        		int e=queries[l][1];
        		int k=queries[l][2];
        		
        		int i=s;

        		int result=Integer.MAX_VALUE;
        		while(i<=e) {
        			if (arr[i]<result&&arr[i]>k) {
        				result=arr[i];
                		answer[l]=result;
        			}
        			i++;
        		}

        }

        return answer;
    }
}