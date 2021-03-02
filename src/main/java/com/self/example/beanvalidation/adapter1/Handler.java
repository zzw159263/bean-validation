package com.self.example.beanvalidation.adapter1;

import com.self.example.beanvalidation.domain.bo.MemberBO;

public abstract class Handler<T> {

    protected Handler chain;

    public void next(Handler handler) {
        this.chain = handler;
    }

    public abstract void doHandle(MemberBO member);

    public static class Builder<T> {
        private Handler<T> head;
        private Handler<T> tail;

        public Builder<T> addHeader(Handler<T> handler){
            if (this.head == null){
                this.head = this.tail =handler;
                return this;
            }
            this.tail.next(handler);
            this.tail = handler;

            return this;
        }

        public Handler<T> build(){
            return this.head;
        }
    }
}
