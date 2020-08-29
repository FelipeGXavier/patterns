package com.algorithms.creational.singleton;

import org.json.JSONObject;

public class JsonPayload implements AssembleConnectionPayload {

    private JSONObject credentials;

    public JsonPayload(JSONObject credentials) {
        this.credentials = credentials;
    }

    @Override
    public ConnectionPayload get() {
        return new ConnectionPayload.Builder()
                .withUser(this.credentials.getString("user"))
                .withPassword(this.credentials.getString("password"))
                .withDatabase(this.credentials.getString("database"))
                .build();
    }
}
