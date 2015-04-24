/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swype.client;

/**
 *
 * @author Jamie Gilbertaom & AG
 */

import java.io.*;
import java.net.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.util.GregorianCalendar;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.WebServiceRef;
import chatserver.SwypeServerService;
import chatserver.SwypeServer;

public class SwypeClient {

    private SwypeServerService service;
    private SwypeServer port;
  private UserDetails currentUser;
    private chatserver.UserSearch userSearch;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public int register(String username, String password, String firstName, String lastName, String telephoneNo, String city, Date birthday){
        try{
        GregorianCalendar temp = new GregorianCalendar();
        temp.setTime(birthday);
        XMLGregorianCalendar temp2 = DatatypeFactory.newInstance().newXMLGregorianCalendar(temp);
        port.register(username, password, firstName, lastName, telephoneNo, city, temp2);
     
        return 1;
        }
        catch(Exception e){
        return 0;
        }
    }
            
    public int login(String username, String password){
        currentUser = port.logIn(username, password);
        if (currentUser.getUsername().equals("failed")){
            return 0;
        }
        else
            return 1;
    }
    
    public void logout(Integer ID){
        port.logout(ID);
    }
    
    public UserDetails searchUser(String username){
       return port.userSearch(username);
    }
    
    public UserDetails searchUser(int ID){
       return port.userSearch(new Integer(ID).toString());
    }
    
    public void addFriend(int ID){
        //TODO
     port.addFriend(ID, ID);
    }
    
    public void acceptFriendRequest(int ID){
        port.acceptFriend(ID, ID);
    }
    
    public void removeFriend(int ID){
port.deleteFriend(ID, ID);

    }
    
    public void sendTextMessage(int recipientID, String message){
       
    }
    
    public void sendImageMessage(int recipientID, Byte[] image){
    
    }
    
    public void sendHyperlink(int recipientID, String URL){
        //TODO CAN'T DO THIS YET
    }
    
    public void startConference(ArrayList<Integer> participants){
        //TODO CAN'T DO THIS YET
    }
    
}
