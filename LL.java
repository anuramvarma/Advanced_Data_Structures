import java.util.LinkedList;
public class LL
{
    public static void main(String[] args) 
    {
        LinkedList<Integer> List =new LinkedList<Integer>();

        List.addFirst(10);
        System.out.println("Initial Element :"+List);
        List.addFirst(40);
        System.out.println("Added in First"+List);
        List.addLast(30);
        System.out.println("Added in Last :"+List);
        List.add(2,20);
        System.out.println("Added at Pos- 2 :"+List);
        List.add(50);
        List.add(60);

        System.out.println("Size of List is :"+List.size());
        for(int i=0;i<List.size();i++)
        {
            System.out.print(List.get(i)+"->");
        }
        System.out.println("Null");
//-------------------------------------------------------------------------------
        System.out.println("\n----List After Deletions -------");
        List.removeFirst();
        System.out.println("First Element Removed : "+List);
        List.removeLast();
        System.out.println("Last Element Removed :"+List);
        List.remove(2);
        System.out.println("2nd Pos element Removed :"+List);
        
        for(int i=0;i<List.size();i++)
        {
            System.out.print(List.get(i)+"->");
        }
        System.out.println("Null");
    }
}
