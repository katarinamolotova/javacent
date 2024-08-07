package org.centrifugo.models.requests.publication;

import org.centrifugo.models.requests.RequestModel;

public abstract class DataRequestAbstract<T> implements RequestModel {
    private T data;

    public DataRequestAbstract(T data) {
        this.data = data;
    }

    public DataRequestAbstract() {
    }

    public T getData() {
        return this.data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
