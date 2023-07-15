public class ShortestPath {
    public static float displacement(String path) {
        int x = 0;
        int y = 0;
        for(int i = 0; i < path.length(); i++) {
            if(path.charAt(i) == 'S') {
                y--;
            }
            if(path.charAt(i) == 'W') {
                x--;
            }
            if(path.charAt(i) == 'N') {
                y++;
            }
            if(path.charAt(i) == 'E') {
                x++;
            }
        }
        int disp2 = (x*x + y*y);
        return (float)Math.sqrt(disp2);
    }
    public static void main(String args[]) {
        String path = "WNEENESENNN";
        System.out.print(displacement(path));
    }
}
