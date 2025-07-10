package String;

public class shortestPath {
    public static float findingShortesPath(String path) {
        int x = 0, y = 0;
        for(int i=0; i<path.length(); i++) {
            char dir = path.charAt(i);
            //North
            if(dir == 'N') {
                y++;
            }
            //South
            else if(dir == 'S') {
                y--;
            }
            //East
            else if(dir == 'E') {
                x++;
            }
            //West
            else{
                x--;
            }
        }
        int x2 = x*x, y2 = y*y;
        return (float)Math.sqrt(y2+x2);
    }
    public static void main(String[] args) {
        String path = "WNEENESENNN";
        System.out.println(findingShortesPath(path));
    }
}
