//https://leetcode.com/problems/h-index/description/
//time complexity: O(n)
//space complexity: O(n)
class H_index{
    public int hIndex(int[] citations) {
        int papers = citations.length;
        int[] citationBuckets = new int[papers + 1];
        //Count the number of papers for each citation count, capping at the total number of papers 
        for (int citation : citations) {
            citationBuckets[Math.min(citation, papers)]++;
        }

        int cumulativePapers = 0;
        //Iterate from the highest possible h-index down to 0, accumulating the number of papers with at least that many citations until we find the maximum h-index where the number of papers is at least equal to the h-index    
        for (int hIndex = papers; hIndex >= 0; hIndex--) {
            cumulativePapers += citationBuckets[hIndex];
            if (cumulativePapers >= hIndex) {
                return hIndex;
            }
        }
        return 0;        
    }
}