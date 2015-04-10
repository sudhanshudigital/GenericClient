# GenericClient

This is Generic Client using this we can use selenium server as well as sikuli server in generic way. i.e. : 

Client client = new Client ("IP")

client.webDriver.get("browser");
client.sikuliDriver.type("My Text");

Here 
IP = IP of remote machine where selenium/sikuli server is running.
browser = To open a browser window using web driver, let say http://www.google.com
My Text = Some text that you want to type using sikuli.

In the same way yua may use all the command for web driver and sikuli server.

List of methods that have been implemented currently for sikuli driver: 

type(String MyText)
click(String image)
doubleClick(String image)
exists(String image)
find(String image)
findAll(String image)
wait(String image, String value)
waitVanish(String image, String value)
dragDrop(String image1, String image2)
