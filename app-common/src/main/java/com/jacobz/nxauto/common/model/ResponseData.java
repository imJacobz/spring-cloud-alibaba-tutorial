package com.jacobz.nxauto.common.model;

import java.util.HashMap;

public class ResponseData extends HashMap<String, Object> {
    public ResponseData success() {
        this.put("status", 200);
        this.put("msg", "OK");
        this.put("data", null);
        return this;
    }

    public ResponseData unauthorized() {
        this.put("status", 401);
        this.put("msg", "Unauthorized");
        this.put("data", null);
        return this;
    }

    public ResponseData notFound() {
        this.put("status", 404);
        this.put("msg", "Not Found");
        this.put("data", null);
        return this;
    }

    public ResponseData internalError() {
        this.put("status", 500);
        this.put("msg", "Internal Error");
        this.put("data", null);
        return this;
    }

    public ResponseData status(int status) {
        this.put("status", status);
        return this;
    }

    public ResponseData msg(String msg) {
        this.put("msg", msg);
        return this;
    }

    public ResponseData data(Object data) {
        this.put("data", data);
        return this;
    }
}
