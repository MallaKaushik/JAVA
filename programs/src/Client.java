import java.io.*;
import java.net.*;
public class Client
{
public static void main(String[] args) throws Exception
{
Socket sock = new Socket("127.0.0.1", 3000);
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
PrintWriter pwrite = new PrintWriter(ostream, true);
InputStream istream = sock.getInputStream();
BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
System.out.println("Start the chitchat, type and press Enter key");
String receiveMessage, sendMessage;
int i=0;
while(i!=1)
{
sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
pwrite.flush();
if((receiveMessage = receiveRead.readLine()) != null) //receive from server
{
System.out.println(receiveMessage);
if(receiveMessage=="bye")
{
	i=1;
	break;
}
}
}
}
}