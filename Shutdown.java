import java.io.*;
class Shutdown
{
public static void main(String args[]) throws IOException
{
Runtime r = Runtime.getRuntime();
DataInputStream dis = new DataInputStream(System.in);
System.out.println("Enter the no. of seconds after which you want your computer to shutdown.");
int a=Integer.parseInt(dis.readLine());
Process p = r.exec("shutdown -s -t "+a);
System.exit(0);
}
}
