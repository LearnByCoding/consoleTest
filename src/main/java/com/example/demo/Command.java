package com.example.demo;

public class Command {
    public String process(String command){
        if (command.equals("help")){
            return "Commands recognized by killchain include: scan, networkmap, patch, install, train, inject, do"
        }
    }
}

// instant: honeypot, bastion, incident response
// install:
// train: physical, email, personal
// inject: sql, ldap, imap
// do: xss,
