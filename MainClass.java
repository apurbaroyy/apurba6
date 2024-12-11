public class MainClass {

    public static void main(String[] args) {

        Solver solver = new Solver();
       
        solver.solve();
    }
}
class Solver {

    public Solver() {
        System.out.println("Solver object created.");
    }

    public void solve() {
        System.out.println("Solving the problem...");
   
        int result = computeSolution();
        System.out.println("Solution: " + result);
    }
    private int computeSolution() {

        int a = 5;
        int b = 10;
        return a + b;
    }
} 
