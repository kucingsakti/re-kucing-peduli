package com.rollbar.notifier.sender.result;

import L6.b;
import java.util.Arrays;
import va.a;

/* JADX INFO: loaded from: classes.dex */
public class Response {
    private Result result;
    private int status;

    public static final class Builder {
        private Result result;
        private int status;

        public Response build() {
            return new Response(this);
        }

        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        public Builder status(int i10) {
            this.status = i10;
            return this;
        }
    }

    public Response(Builder builder) {
        this.status = builder.status;
        this.result = builder.result;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Response response = (Response) obj;
            if (this.status == response.status) {
                Result result = this.result;
                Result result2 = response.result;
                a aVar = b.a;
                return result == result2 || (result != null && result.equals(result2));
            }
        }
        return false;
    }

    public Result getResult() {
        return this.result;
    }

    public int getStatus() {
        return this.status;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.status), this.result};
        a aVar = b.a;
        return Arrays.hashCode(objArr);
    }

    public String toString() {
        return "Response{status=" + this.status + ", result=" + this.result + '}';
    }
}
