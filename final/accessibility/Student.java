public class Student {
    private boolean[] hasSubmitted = new boolean[4];
    private int[] allGrades = new int[4];

    public void updateGrade(int assignment, int grade) {
        // correct index
        if (assignment < 0 || assignment > 3) {
            System.out.println("Enter an assignment number from 0-3");
            return;
        }

        // correct grade
        if (grade < 0 || grade > 25) {
            System.out.println("Enter a grade from 0-25");
            return;
        }

        // Update grade
        hasSubmitted[assignment] = true;
        allGrades[assignment] = grade;
        return;
    }

    public boolean[] getHasSubmitted() {
        return hasSubmitted;
    }

    public int[] getGrades() {
        return allGrades;
    }

    public int getTotalGrade() {
        int sum = 0;

        for (int i = 0; i < allGrades.length; i++) {
            sum += allGrades[i];
        }
        
        return sum;
    }
}
