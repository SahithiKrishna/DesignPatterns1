package com.example.demo.Proxy;

import java.io.IOException;

public class CommandProxyExecutor implements Command{

    private boolean isAdmin;
    private Command command;

    public CommandProxyExecutor(String user){
        if("Sahithi".equalsIgnoreCase(user))
            isAdmin= true;
        command = new CommandExecutorImpl();
    }
    public void runCommand(String cmd) throws Exception {
            if(isAdmin){
                command.runCommand(cmd);
            }else{
                if(cmd.trim().startsWith("rm")){
                    throw new Exception("not allowed to execute rm command");
                }else{
                    command.runCommand(cmd);
                }
            }
    }
}
