public class DjikstraAlgoritma {

    public static void main(String args[]) {
        int grap[][] = new int[][] { {Likes, Comments, share },
                { John, 4, 101, 8 },
                { Rudi, 2, 302, 10 },
                { Shinta, 50, 430, 45 },
                { Dody, 8, 106, 9 } };

        int minDistance = integer.MAX_VALUE;
        int minVertexDist = -1;
        int[] distance = new int[5];
        boolean[] visited = new boolean[5];

        for(int i=0;i<5;i++){
            System.out.println("ArrayDistance is = " + distance[t]);
        }

        for(int s=0s<5;s++){
            System.out.println("Looping = " + s);
            System.out.println("visited = " + visited[s]);
            System.out.println("distance["+ s+"] = " + distance[s]);
            System.out.println("mindistance = " + minDistance);
            if(!visited[s] && distance[s] <= minDistance){
                System.out.println("HASIL ");
                minDistance = distance[s];
                minVertexDist = s;
                System.out.println("MinDistance = " + minDistance);
                System.out.println("MinVertex = " + minVertexDist + "\n");
            }
        }
        System.out.println(" ");
        int u = minVertexDist;
        for(int v=0;v<5;v++){
            System.out.println("Looping V = " + v);
            System.out.println("Visited[" + v + "]");
            if(!visited[v] && grap[u][v] != 0 && (distance[u] + grap[v] < distance[v])){
                System.out.println("HASIL ");
                System.out.println("GRAPH[" + u + "][" + v +"] = "+grap[u][v]);
                System.out.println("distance[" + u +") V = "+distance[u]);
                distance[v] = distance[u] + grap[u][v];
                System.out.println("distance[" + v + "] V = " + distance[v] + "\n");
            }
        }

        for(int z=0;z<5;z++){
            System.out.println("distance is = " + distance[z]);
        }
    }
}