/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ensisa.crypto.tcpcommon;

/**
 *
 * @author sebastien
 */
public class PROTOCOL 
{
    public static final int PORT = 1337;
    
    public static final int GET_FILE = 0x01;
    public final static int GET_FILE_LIST = 0x02;
    public static final int SEND_FILE_LIST = 0x03;
    public static final int SEND_FILE = 0x04;
}
