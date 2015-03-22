package ver1;

import java.util.ArrayList;

public class EquationSolver {

    /**
     * ATTRIBUTES
     */
    private int[] equation;
    ArrayList<int[]> arr;

    public EquationSolver(int degree) {
        equation = new int[degree];
    }

    public void addEquation(int[] eq) {
        if(eq.length == equation.length) {
            arr.add(eq);
        }
    }

    public int[] solve() {
        int[] res = new int[equation.length];
        
        return res;
    }
}
