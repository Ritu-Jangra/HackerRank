import java.util.*;
import java.util.LinkedHashSet;
 
public class AlphaAndBeta
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Scanner sc=new Scanner(System.in);
        int i;
        int n=sc.nextInt();
        Integer[] numbers=new Integer[n];
        for(i=0;i<n;i++)
         numbers[i]=sc.nextInt();
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>( Arrays.asList(numbers) );
        Integer[] numbersWithoutDuplicates = linkedHashSet.toArray(new Integer[] {});
        int maxValue = 0;
        int secMax=0;
        int s=linkedHashSet.size();
       for(i=0;i<s;i++)
{
    if(numbersWithoutDuplicates[i]>maxValue)
    {
        secMax=maxValue;
    maxValue=numbersWithoutDuplicates[i];
    }
    else if(numbersWithoutDuplicates[i]>secMax && numbersWithoutDuplicates[i]!=maxValue)
        secMax=numbersWithoutDuplicates[i];
    
}
System.out.println(secMax);
    }
}