package com.example.demo.Proxy;

import java.io.IOException;

public class CommandExecutorImpl implements Command{
    public void runCommand(String cmd) throws IOException{
        Runtime.getRuntime().exec(cmd);
        System.out.println("executed "+cmd);
    }
}
