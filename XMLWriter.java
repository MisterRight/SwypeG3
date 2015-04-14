/*
 * Swype
 */
package swypeg3;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.Namespace;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

/**
 *
 * @author AG
 */
public class XMLWriter {

    public static void main(String[] args) throws IOException {
        List<User> userList = new ArrayList<>();
        userList.add(new User(1, "Jamie", "G", "jaGilbertson", "Swansea", "123456", "1/2/1900", "2/2/2222", "3/3/3333"));
        userList.add(new User(2, "ALZAID", "Abdullah", "AG", "Swansea", "123456", "1/2/1900", "2/2/2222", "3/3/3333"));

        String fileName = "Users.xml";
        wrtieXML(userList, fileName);
    }

    private static void wrtieXML(List<User> userList, String fileName) throws IOException {
        Document doc = new Document();

        doc.setRootElement(new Element("Users", Namespace.getNamespace("http://swype.test")));
        for (User usr : userList) {
            Element user = new Element("User");
            user.setAttribute("UID", "" + usr.getUID());
            user.addContent(new Element("FirstName").setText("" + usr.getFirstName()));
            user.addContent(new Element("LastName").setText(usr.getLastName()));
            user.addContent(new Element("UserName").setText(usr.getUserName()));
            user.addContent(new Element("city").setText(usr.getCity()));
            user.addContent(new Element("phone").setText(usr.getPhone()));
            user.addContent(new Element("birthday").setText(usr.getBirthday()));
            user.addContent(new Element("LastLogin").setText(usr.getLastLogin()));
            user.addContent(new Element("FirstLogin").setText(usr.getFirstLogin()));

            doc.getRootElement().addContent(user);
        }
         XMLOutputter xmlOutputter = new XMLOutputter(Format.getPrettyFormat());
 
        xmlOutputter.output(doc, new FileOutputStream(fileName));
    }
}
