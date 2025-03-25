package leetcodes;
import java.util.*;
public class LetterCombinations {
public List<String> letterCombinations(String digits){
	if(digits == null || digits.length()==0) {
		return new ArrayList<>();
	}
	String[] phoneMap= {
		"",
		"",
		"abc",
		"def",
		"ghi",
		"jkl",
		"mno",
		"pqrs",
		"tuv",
		"wxyz"
		
	};
	List<String> combinations=new ArrayList<>();
	backtrack(combinations,phoneMap,digits,0,new StringBuilder());
	return combinations;
	
	
}
	private void backtrack(List<String> combinations, String[] phoneMap, String digits, int index,
		StringBuilder current) {
	// TODO Auto-generated method stub
		if(index==digits.length()) {
			combinations.add(current.toString());
			return;
		}
		String letters = phoneMap[digits.charAt(index) - '0'];
        for (char letter : letters.toCharArray()) {
            current.append(letter);
            backtrack(combinations, phoneMap, digits, index + 1, current);
            current.deleteCharAt(current.length() - 1); 
        }
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LetterCombinations obj = new LetterCombinations();
        System.out.println(obj.letterCombinations("23"));
	}

}
