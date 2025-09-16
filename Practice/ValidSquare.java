import java.util.Arrays;
class ValidSquare{
    public static void main(String[] args){
        int[] p1 ={1,0};
        int[] p2 ={1,1};
        int[] p3 ={1,0};
        int[] p4 ={0,1};

        System.out.println(validSquare(p1,p2,p3,p4));
        
    }
    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        int[] dist = {
            distSq(p1, p2),
            distSq(p1, p2),
            distSq(p1, p3),
            distSq(p1, p4),
            distSq(p2, p3),
            distSq(p2, p4),
            distSq(p3, p4)

        };

        Arrays.sort(dist);

        //side ke liye 
        if(dist[0] == 0 || dist[0] != dist[1] || dist[1] != dist[2] || dist[2] != dist[3]){
            return false;
        }

        //diagonals ke liye
        return dist[4] == dist[5] && dist[4] == 2*dist[0];
    }

    public static int distSq(int[] a, int[] b){
        return (a[0]-b[0])*(a[0]-b[0]) + (a[1]-b[1])*(a[1]-b[1]);
    }
}