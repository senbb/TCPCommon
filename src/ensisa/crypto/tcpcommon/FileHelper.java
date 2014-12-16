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
public class FileHelper {
    private String name;
    private String extension;
    private byte[] content;
    
    public FileHelper(byte[] content,String extension)
    {
        this.extension=extension;
        this.content=content;
        
        name = "default";
    }
    
    public void setName(String name)
    {
        this.name = name;
    }
}
