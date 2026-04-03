//https://leetcode.com/problems/text-justification/description/
//Time Complexity: O(n) because we are traversing the words array once
//Space Complexity: O(1) because we are using only a constant amount of space for the result list and the line StringBuilder
//approach: We use a while loop to traverse the words array and build each line of justified text. For each line, we calculate 
// the number of gaps between words and the total spaces needed to justify the line. We then distribute the spaces evenly between 
// the words, adding extra spaces to the leftmost gaps if necessary. Finally, we add the justified line to the result list and move 
// on to the next set of words.
//techniques used: String manipulation, greedy approach, and handling edge cases for the last line and lines with a single word.
import java.util.ArrayList;
import java.util.List;
class TextJustification {
    public List<String> fullJustify(String[] words, int maxWidth) {
        List<String> result = new ArrayList<>();
        int i = 0;
        while (i < words.length) {
            int j = i, len = 0;
            // Find the range of words that can fit in the current line
            while (j < words.length && len + words[j].length() + (j - i) <= maxWidth) {
                len += words[j].length();
                j++;
            }
            // Calculate the number of gaps and spaces needed for justification
            int gaps = j - i - 1;
            int spaces = maxWidth - len;
            StringBuilder line = new StringBuilder();
            // If it's the last line or the line has only one word, left-justify it
            if (j == words.length || gaps == 0) {
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) line.append(" ");
                }
                while (line.length() < maxWidth) line.append(" ");
            } 
            // Otherwise, distribute spaces evenly between the words
            else {
                int spaceEach = spaces / gaps, extra = spaces % gaps;
                for (int k = i; k < j; k++) {
                    line.append(words[k]);
                    if (k != j - 1) {
                        int toAdd = spaceEach + (extra-- > 0 ? 1 : 0);
                        line.append(" ".repeat(toAdd));
                    }
                }
            }
            result.add(line.toString());
            i = j;
        }
        return result;
    }
}