import java.io.*;
class Price
{
    public static void main(String args[])throws IOException
    {
        int selling,profit,costprice;
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("Enter selling price");
        selling=Integer.parseInt(br.readLine());
        System.out.println("Enter profit price");
        profit=Integer.parseInt(br.readLine());
        costprice=selling-profit;
        System.out.println("cost price="+costprice);
    }
}