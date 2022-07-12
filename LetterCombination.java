public class LetterCombination {
  public List<String> letterCombinations(String digits) {
    HashMap<Integer, String> ButtonToLetter = new HashMap<Integer, String>();
    ButtonToLetter.put(2,"abc");
    ButtonToLetter.put(3,"def");
    ButtonToLetter.put(4,"ghi");
    ButtonToLetter.put(5,"jkl");
    ButtonToLetter.put(6,"mno");
    ButtonToLetter.put(7,"pqrs");
    ButtonToLetter.put(8,"tuv");
    ButtonToLetter.put(9,"wxyz");
    int[] ButtonPressed = new int[digits.length()];
    ArrayList<Integer> ButtonList = new ArrayList<Integer>();
    for (int i = 0; i < digits.length(); i++){
        ButtonPressed[i] = digits.valueOf(i);    
    }
    for (int i = 0, String letters;i < buttonlist.length(); i++){
        letters = ButtonToLetter.get(ButtonPressed[i]);
    }
 }
}
