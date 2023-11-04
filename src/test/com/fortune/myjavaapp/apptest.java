[4/28, 4:37 PM] Fortune Cloud Technologies
      
  
    
      Meeting in "General"  started
      
      
    
    
  
  

      
      
    ​                  6 replies from Fortune Cloud. Press Enter to expand replies.                                            6 replies from Fortune Cloud              <https://teams.microsoft.com/l/message/19:oEE1xI-DufpBNQMKtgTLa06Y1L9mKx6elrN1WwQHpDg1@thread.tacv2/1682680058462?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=7fe34c2b-3b16-40aa-83d4-c1f1e2b67d7e&amp;parentMessageId=1682680058462&amp;teamName=Devops 23 jan&amp;channelName=General&amp;createdTime=1682680058462&amp;allowXTenantAccess=false>​[5/2, 6:25 PM] Fortune Cloud Technologies
    
zip -r myhtml.zip ./*.html
scp -i linux_kp.pem  -o StrictHostKeyChecking=no myhtml.zip ec2-user@3.82.100.1:.
ssh -i linux_kp.pem  -o StrictHostKeyChecking=no ec2-user@3.82.100.1 << EOF 
sudo cp myhtml.zip /usr/share/nginx/html/
cd /usr/share/nginx/html
sudo rm  *.html
sudo unzip myhtml.zip -d . 
EOF


<https://teams.microsoft.com/l/message/19:oEE1xI-DufpBNQMKtgTLa06Y1L9mKx6elrN1WwQHpDg1@thread.tacv2/1683032108404?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=7fe34c2b-3b16-40aa-83d4-c1f1e2b67d7e&amp;parentMessageId=1683032108404&amp;teamName=Devops 23 jan&amp;channelName=General&amp;createdTime=1683032108404&amp;allowXTenantAccess=false>​[5/2, 4:35 PM] aadiwadekar47 (Guest)
      
  
    
      Meeting started
      
      
    
    
  
  

      
      
    ​                  4 replies. Press Enter to expand replies.                                            4 replies              <https://teams.microsoft.com/l/message/19:oEE1xI-DufpBNQMKtgTLa06Y1L9mKx6elrN1WwQHpDg1@thread.tacv2/1683025525429?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=7fe34c2b-3b16-40aa-83d4-c1f1e2b67d7e&amp;parentMessageId=1683025525429&amp;teamName=Devops 23 jan&amp;channelName=General&amp;createdTime=1683025525429&amp;allowXTenantAccess=false>​[5/3, 4:38 PM] Fortune Cloud Technologies
      
  
    
      Meeting in "Meeting in "Meeting in "General" " "  started
      
      
    
    
  
  

      
      
    ​                  11 replies from Fortune Cloud. Press Enter to expand replies.                                            11 replies from Fortune Cloud              <https://teams.microsoft.com/l/message/19:oEE1xI-DufpBNQMKtgTLa06Y1L9mKx6elrN1WwQHpDg1@thread.tacv2/1683112099366?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=7fe34c2b-3b16-40aa-83d4-c1f1e2b67d7e&amp;parentMessageId=1683112099366&amp;teamName=Devops 23 jan&amp;channelName=General&amp;createdTime=1683112099366&amp;allowXTenantAccess=false>​[5/4, 5:39 PM] Fortune Cloud Technologies
    
package com.fortune.myjavaapp;
/**
 * Hello world!
 */
public class App {​​​​​​​
    private static final String MESSAGE = "Hello World!";
    public App() {​​​​​​​}​​​​​​​
    public static void main(String[] args) {​​​​​​​
        System.out.println(MESSAGE);
    }​​​​​​​
    public String getMessage() {​​​​​​​
        return MESSAGE;
    }​​​​​​​
}​​​​​​​


<https://teams.microsoft.com/l/message/19:oEE1xI-DufpBNQMKtgTLa06Y1L9mKx6elrN1WwQHpDg1@thread.tacv2/1683202174072?tenantId=88738e75-9e08-47e1-908f-bc12b11c19ad&amp;groupId=7fe34c2b-3b16-40aa-83d4-c1f1e2b67d7e&amp;parentMessageId=1683202174072&amp;teamName=Devops 23 jan&amp;channelName=General&amp;createdTime=1683202174072&amp;allowXTenantAccess=false>​[5/4, 5:47 PM] Fortune Cloud Technologies
    
package com.fortune.myjavaapp;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
/**
 * Unit test for simple App.
 */
public class AppTest
{​​​​​​​
    @Test
    public void testAppConstructor() {​​​​​​​
        App app1 = new App();
        App app2 = new App();
        assertEquals(app1.getMessage(), app2.getMessage());
    }​​​​​​​
    @Test
    public void testAppMessage()
    {​​​​​​​
        App app = new App();
        assertEquals("Hello World!", app.getMessage());
    }
}
