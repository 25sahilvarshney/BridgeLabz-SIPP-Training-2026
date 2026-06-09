public class PensDistributed {
    public static void main(String[] args){
        int totalPens = 14;
        int students = 3;
        int remainingPens = totalPens % students;
        int distributedPens = totalPens / students;
        System.out.printf("The Pen Per Student is %d and the Remaining Pen not distributed is %d", distributedPens, remainingPens);
    }
    
}
