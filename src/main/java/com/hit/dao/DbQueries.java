package com.hit.dao;

public class DbQueries {
    private static DbQueries instance;

    private DbQueries() {

    }

    public static DbQueries getInstance() {
        if(instance == null) {
            instance = new DbQueries();
        }
        return instance;
    }
    //games table queries
    public String addGame = "insert into games (id, name, image, category)" +
    "values (?, ?, ?, ?);";
    public String getAllGames = "select * from games;";
    public String deleteGame = "delete from games where name=?;";
    //user table queries
    public String addUser = "insert into users (id, name, email, password, salt)" +
    "values (?, ?, ?, ?, ?);";
    public String getAllUsers = "select * from users;";
    public String deleteUser = "delete from users where name=?;";
    //friend table queries
    public String getUserFriends = "select * from friends where id=?;";
    public String addUserFriend = "insert into friends (idUser, idFriend) values (?, ?);";
    public String deleteUserFriend = "delete from friends where idUser=? and idFriend=?;";
}
