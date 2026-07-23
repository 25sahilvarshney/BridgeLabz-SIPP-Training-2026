import java.util.*;

public class DeliveryRouteFinder {
    public List<List<Integer>> findAllRoutes(Map<Integer, List<Integer>> roads, int start, int target) {
        List<List<Integer>> allRoutes = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        Set<Integer> visited = new HashSet<>();
        
        allRoutesHelper(roads, start, target, path, visited, allRoutes);
        return allRoutes;
    }
    
    private void allRoutesHelper(Map<Integer, List<Integer>> roads, int current, int target,
                                 List<Integer> path, Set<Integer> visited, List<List<Integer>> allRoutes) {
        path.add(current);
        visited.add(current);
        
        if (current == target) {
            allRoutes.add(new ArrayList<>(path));
        } else {
            for (int next : roads.getOrDefault(current, Collections.emptyList())) {
                if (!visited.contains(next)) {
                    allRoutesHelper(roads, next, target, path, visited, allRoutes);
                }
            }
        }
        
        path.remove(path.size() - 1); 
        visited.remove(current);       
    }
}