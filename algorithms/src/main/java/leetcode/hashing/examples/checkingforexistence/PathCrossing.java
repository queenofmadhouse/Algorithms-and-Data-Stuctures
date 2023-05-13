package leetcode.hashing.examples.checkingforexistence;

import java.util.HashSet;
import java.util.Set;

public class PathCrossing {
    public boolean isPathCrossing(String path) {
        int x = 0, y = 0;
        Set<String> visited = new HashSet<>();
        visited.add(x+","+y);

        char[] pathCars = path.toCharArray();

        for(char c : pathCars) {
            if(c == 'N'){
                y++;
            }
            else if(c== 'S'){
                y--;
            }
            else if(c == 'E'){
                x++;
            }
            else if(c == 'W'){
                x--;
            }
            String temp = x + "," + y;
            if(visited.contains(temp)){
                return true;
            }
            else{
                visited.add(temp);
            }
        }
        return false;
    }
}
