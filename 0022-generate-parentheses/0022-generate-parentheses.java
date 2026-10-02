class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;

    }
    private void backtrack(List<String> result, String current, int open_c, int close_c, int n){
        if (current.length() == 2 * n){
            result.add(current);
            return;
        }
        if (open_c < n){
            backtrack(result, current + "(", open_c + 1, close_c, n);
        }
        if (close_c < open_c){
            backtrack(result, current + ")", open_c, close_c + 1, n);
        }
    }
}