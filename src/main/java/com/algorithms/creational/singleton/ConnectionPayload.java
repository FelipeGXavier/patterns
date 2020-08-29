package com.algorithms.creational.singleton;

public class ConnectionPayload {

    private String user;
    private String database;
    private String password;
    private String port;

    private ConnectionPayload(){

    }

    private void setUser(String user) {
        this.user = user;
    }

    private void setDatabase(String database) {
        this.database = database;
    }

    private void setPassword(String password) {
        this.password = password;
    }

    private void setPort(String port) {
        this.port = port;
    }

    public String getUser() {
        return user;
    }

    public String getDatabase() {
        return database;
    }

    public String getPassword() {
        return password;
    }

    public String getPort() {
        return port;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("ConnectionPayload{");
        sb.append("user='").append(user).append('\'');
        sb.append(", database='").append(database).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append(", port='").append(port).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static class Builder{

        private ConnectionPayload connectionPayload = new ConnectionPayload();

        public Builder withUser(String user){
            this.connectionPayload.setUser(user);
            return this;
        }

        public Builder withDatabase(String database){
            this.connectionPayload.setDatabase(database);
            return this;
        }

        public Builder withPassword(String password){
            this.connectionPayload.setPassword(password);
            return this;
        }

        public Builder withPort(String port){
            this.connectionPayload.setPort(port);
            return this;
        }

        public ConnectionPayload build(){
            return this.connectionPayload;
        }

    }
}
