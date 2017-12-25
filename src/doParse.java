


import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;

public class doParse {

	public static void main(String[] args) {
		
		try
        {
			
			DocumentBuilderFactory f = DocumentBuilderFactory.newInstance();
			f.setValidating(false);
			
			DocumentBuilder builder = f.newDocumentBuilder();
			Document doc = builder.parse(new File("WORDSTAT.xml"));
			
			doc.getDocumentElement().normalize();
			
			System.out.println("Root element ["+doc.getDocumentElement().getNodeName()+"]");
			
			 NodeList nodeLst=doc.getElementsByTagName("Row");
			 System.out.println("Row");
			 for(int je=0;je<nodeLst.getLength();je++)
	            {
				 Node fstNode=nodeLst.item(je);
				 if(fstNode.getNodeType()==Node.ELEMENT_NODE)
	                {
					 Element elj=(Element)fstNode;
	                    NodeList nljx=elj.getElementsByTagName("Data");
	                    Element eljx=(Element)nljx.item(1);
	                    NodeList nljxc=eljx.getChildNodes();
	                    
	                    System.out.println("x [" + ((Node)nljxc.item(0)).getNodeValue()+", "+"]");
	                  //  System.out.println(((Node)nljxc.item(0)).getNodeValue());
	                            
				 
				 
	            }
	            }
			
        } 
    catch(Exception ei){
    	
    }

		
		

	}

}
