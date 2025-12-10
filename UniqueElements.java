import java.util.*;
class UniqueElements{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of Elements in the list");
        int n=sc.nextInt();
        List <Integer> l=new ArrayList<>();
        for(int i=0;i<n;i++){
            int c=sc.nextInt();
            l.add(c);

        }
        HashSet<Integer> h=new HashSet<>();
        for(Integer e: l){
            h.add(e);
        }
        int count=0;
        for(Integer e:h){
            count++;
        }
        System.out.print("the Number of Unique Elements is "+count);
    }}