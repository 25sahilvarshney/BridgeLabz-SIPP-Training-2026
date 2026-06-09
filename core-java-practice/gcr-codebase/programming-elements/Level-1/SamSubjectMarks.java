public class SamSubjectMarks {
    public static void main(String[] args){
        int Mathmarks = 94;
        int Physicsmarks = 95;
        int Chemistrymarks = 96;
        int sum = 0;
        sum  = Mathmarks + Physicsmarks + Chemistrymarks;
        int average = sum / 3;
        int percentage = (sum * 100) / 300;
        System.out.println("Sam's average mark in PCM is:"+ average);
    }
    
}
