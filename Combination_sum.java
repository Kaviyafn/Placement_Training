import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        findCombinations(candidates, target, 0, new ArrayList<>(), result);
        return result;
    }

    private void findCombinations(int[] candidates, int target, int index, List<Integer> current, List<List<Integer>> result) {

        if (target == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = index; i < candidates.length; i++) {
            if (target >= candidates[i]) {
                current.add(candidates[i]);
                findCombinations(candidates, target - candidates[i], i, current, result); // Allow reuse of current element
                current.remove(current.size() - 1);
            }
        }
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();


        int[] candidates = new int[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            candidates[i] = scanner.nextInt();
        }


        System.out.print("Enter the target sum: ");
        int target = scanner.nextInt();
        Solution obj = new Solution();
        List<List<Integer>> result = obj.combinationSum(candidates, target);

        System.out.println("Unique Combinations that sum to " + target + ": " + result);
        scanner.close();
    }
}
