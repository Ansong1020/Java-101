public class Problem {
    public static double sumGrid(double[][] grid) {
        double sum = 0.0; 
        for (int i = 0; i < grid.length; i++) { 
            for (int j = 0; j < grid[i].length; j++) { 
                sum += grid[i][j]; 
            }
        }
        return sum; 
    }

    public static void main(String[] args) {
        double[][] exampleGrid = {
            {1.2, 3.4, 5.6},
            {7.8, 9.1, 0.2},
            {4.5, 6.7, 8.9}
        };
        
        double result = sumGrid(exampleGrid);
        System.out.println("Sum of all elements in the grid: " + result);
    }
}
