package com.company;

public  class Salary implements Sendable<Integer> {
    private final String job;
    private final String name;
    private final Integer salary;

    public Salary(String Job, String Name, Integer Salary){
        this.job = Job;
        this.name = Name;
        this.salary = Salary;
    }
    @Override
    public String getTo(){
        return name;
    }

    @Override
    public Integer getContent() {
        return salary;
    }
}
