package com.s;
import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class ReadXmlSaxParser {

	public static void main(String[] args) {
		SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            UserHandler handler = new UserHandler();
            saxParser.parse(new File("sax_users.xml"), handler);
            // Get Users list
            List < User > userList = handler.getEmpList();
            // print user information
            for (User user: userList)
                System.out.println(user);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }
	}

}
