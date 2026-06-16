public class TowerOfHanoi{
    public static void towerOfHanoi(int n, char source, char destination, char helper) {
        if (n == 1) {
            System.out.println("Move disk"+ n + "from" + source + " to " + destination);
            return;
        }
        towerOfHanoi(n - 1, source, helper, destination);
        System.out.println("Move disk " + n + "from " + source + " to " + destination);
        towerOfHanoi(n - 1, hepler, destination, source);
    }

    public static void main(String[] args) {
        int n = 3; 
        towerOfHanoi(n, 'A', 'C', 'B'); 
    }
}