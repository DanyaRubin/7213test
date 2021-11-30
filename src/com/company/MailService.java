package com.company;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public  class MailService<T> implements Consumer<Sendable<T>> {
    private final Map<String, List<T>> mailBox;

    public MailService() {
        mailBox = new HashMap<String, List<T>>() {
            @Override
            public List<T> get(Object key) {
                if (mailBox.containsKey(key)) {
                    return mailBox.getOrDefault(key, null);
                } else {
                    List<T> lst = new LinkedList<>();
                    mailBox.put((String) key, lst);
                    return lst;
                }
            }
        };
    }

    public Map<String, List<T>> getMailBox() {
        return mailBox;
    }

    @Override
    public void accept(Sendable<T> t) {
        List<T> lst = mailBox.get(t.getTo());
        lst.add(t.getContent());
    }
}
