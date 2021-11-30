package com.company;

public class MailMessage implements Sendable<String> {
    private final String from;
    private final String to;
    private final String content;
    public String getFrom(){
        return from;
    }
    @Override
    public String getTo(){
        return to;
    }
    @Override
    public String getContent(){
        return content;
    }
    public MailMessage (String From, String To, String Content){
        this.from = From;
        this.to = To;
        this.content = Content;
    }
}
