
import java.util*;
import java.io.*;
class repeat
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[];
        int c=0,q=0;
        for(int i=0;i<n;i++)
        {
            a[i]=s.nextInt();
        }
        for(int j=0;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                if(a[j]==a[k])
                {
                    q=a[j];
                    c++;
                }
            }
        }
        if(c>0)
        {
            System.out.print(q);
        }
    }
}
