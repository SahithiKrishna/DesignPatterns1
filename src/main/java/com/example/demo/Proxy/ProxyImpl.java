package com.example.demo.Proxy;

//Basically this pattern gives restricted access to execute the operations, the impl is in the name itself
//We create a proxy class where we decide whether to give permission to certain user to execute the method or not, basically providing a controlled access to a functionality for the client
//Provide a surrogate or placeholder for another object to control access to it.
public class ProxyImpl {
    public static void main(String[] args){
        Command command = new CommandProxyExecutor("Sahithii");
        try{
            command.runCommand("rm -rf abd.pdf");
        } catch (Exception e) {
            System.out.println("exception occured:"+e.getMessage());
        }
    }
}
