package com.example.demo;

public class Command {
    private static String acceptedCommands = "Commands recognized by killchain include: [[b;white;]rules], [[b;white;]man], [[b;white;]help], scan, networkmap, patch, install, train, inject, do <br/>" +
            "To get more information about a command, type man [command]";
    public static String process(String command){
        if (command.equals("help")) {
            return acceptedCommands;
        } else if (command.length() > 4 && command.substring(0,4).equals("man ")){
            String infoRequest = command.substring(4);
            return manPage(infoRequest);
        } else if (command.length() > 4 && command.substring(0,5).equals("rules")){
            return rules();
        } else {
            return "Please enter a recognized command. If you need help, use the [[b;white;]man <<command>>]. \n" +
                    "For example, you could type [[b;white;]man rules].\n"+
                    "If you need a list of all commands. Type [[b;white;]help].";
        }
    }

    private static String manPage(String command){
        if (command.equals("rules")) {
            return "Use the command [[b;white;]rules] to get the rules of Killchain";
        } else if (command.equals("help")) {
            return "Okay, that is a little redundant.";
        } else {
            return command + " is not a command that I can help you with.";
        }
    }

    private static String rules(){
        String myRules = "These are the rules of killchain: \n"+
                        "1. Never talk about killchain. \n"+
                        "2. Do damage onto others before others do damage onto you. \n";
        return myRules;
    }
}

// instant: honeypot, bastion, incident response
// install:
// train: physical, email, personal
// inject: sql, ldap, imap
// do: tailgate, dropusb, phish
//
