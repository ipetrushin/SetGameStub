package com.example.setgamestub;

public class Request {
    /* TODO: Дополнить класс полями согласно синтаксису возможных запросов к серверу
    */

    public static Request RegisterRequest(String nick) {
        return new Request("register", nick);
    }
    // TODO: возможно вам потребуются и другие варианты конструкторов
    public Request(String action, String nickname) {
        this.action = action;
        this.nickname = nickname;
    }

    String action, nickname;
    int token;
}
