package truck_on_briedge;

public class main {
    public static void main(String[] args) {
        int bridge_length = 2;
        int weight = 10;
        int[] truck_weights = { 7, 4, 5, 6 };
        Solution solution = new Solution();
        solution.solution(bridge_length, weight, truck_weights);
    }
}
