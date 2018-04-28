import java.io.*;
import java.net.*;

public class Server
{
public static void main(String[] args) throws Exception
	{
ServerSocket sersock = new ServerSocket(3000);
System.out.println("Server  ready for chatting");
Socket sock = sersock.accept( );
BufferedReader keyRead = new BufferedReader(new InputStreamReader(System.in));
OutputStream ostream = sock.getOutputStream(); 
PrintWriter pwrite = new PrintWriter(ostream, true);
InputStream istream = sock.getInputStream();
 BufferedReader receiveRead = new BufferedReader(new InputStreamReader(istream));
String receiveMessage, sendMessage;
int j=0;	
while(j!=1)
	{
	if((receiveMessage = receiveRead.readLine()) != null)
		{
			System.out.println(receiveMessage);
			if(receiveMessage=="bye")
			{
			 j=1;
			 break;
			}
        }
    sendMessage = keyRead.readLine();
pwrite.println(sendMessage);
pwrite.flush();
}
}
}