package Collection_AND_DSA.BinarySearch.ScenarioBased;
public class AstronomerStar {

    public static int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return -1;
    }

    public static int searchRotated(int[] arr, int target) {
        int left = 0, right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return mid;

            if (arr[left] <= arr[mid]) {
                if (target >= arr[left] && target < arr[mid])
                    right = mid - 1;
                else
                    left = mid + 1;
            } else {
                if (target > arr[mid] && target <= arr[right])
                    left = mid + 1;
                else
                    right = mid - 1;
            }
        }

        return -1;
    }

    public static int firstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                right = mid - 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    public static int lastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                result = mid;
                left = mid + 1;
            } else if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid - 1;
        }

        return result;
    }

    public static int findMinimum(int[] arr) {
        int left = 0, right = arr.length - 1;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > arr[right])
                left = mid + 1;
            else
                right = mid;
        }

        return arr[left];
    }

    public static void main(String[] args) {
        int[] brightness = {10, 20, 30, 40, 50, 60};

        System.out.println("Binary Search Index: " + binarySearch(brightness, 40));

        int[] rotated = {40, 50, 60, 10, 20, 30};

        System.out.println("Search in Rotated Array: " + searchRotated(rotated, 20));
        System.out.println("Minimum Element: " + findMinimum(rotated));

        int[] repeated = {10, 20, 20, 20, 30, 40};

        System.out.println("First Occurrence: " + firstOccurrence(repeated, 20));
        System.out.println("Last Occurrence: " + lastOccurrence(repeated, 20));
    }
}