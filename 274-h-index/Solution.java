import java.util.Arrays;
class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);

        int n = citations.length;
        int h = 0 ;

        for(int i = n-1; i >= 0; i--){
            int paperCount = n - i;

            if(citations[i] >= paperCount){
                h = paperCount;
            }

            else{
                break;
            }
        }
        return h;
    }
}