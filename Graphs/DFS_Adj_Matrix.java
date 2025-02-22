import java.util.*;
public class DFSAdjMatrix {
   int v;
   int adj[][];
   boolean visted[];
   DFSAdjMatrix(int v){
    this.v = v;
    adj = new int[v][v];
    visted = new boolean[v];
    Arrays.fill(visted,false);
   }
   public void DFS(int start){
    visted[start] = true;
    System.out.print(start+" ");
        for(int i=0;i<v;i++){
            if(adj[start][i]==1 && !visted[i]){
               DFS(i);
            }
        }
    }

   public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("No of vertices:");
    int v = sc.nextInt();
    DFSAdjMatrix b = new DFSAdjMatrix(v);
    System.out.println("Enter adj matrix: "+v+'X'+v );
    for(int i=0;i<v;i++){
        for(int j=0;j<v;j++){
            b.adj[i][j]=sc.nextInt();
        }
    }
    System.out.println("Enter Starting Vertex for BFS:");
    int start= sc.nextInt();
    b.DFS(start);

   }
}
