public class Hash
{
public void madhu()
{
for(int i=0;i<5;i++)
{
    for(int j=0;j<4-i;j++)
    {
    System.out.print(" ");
    }
    for(int k=0;k<=i;k++)
    {
    System.out.print(" # ");
    }
    }
}
public static void main(String[]args)
{
Hash raj=new Hash();
raj.madhu();
}
}
