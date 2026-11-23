package com.rollbar.notifier.sender.result;

import L6.b;
import java.util.Arrays;
import va.a;

/* JADX INFO: loaded from: classes.dex */
public class Result {
    private static final int ERROR_CODE = 1;
    private final String content;
    private final int err;

    public static final class Builder {
        private String content;
        private int err;

        public Builder body(String str) {
            this.content = str;
            return this;
        }

        public Result build() {
            return new Result(this);
        }

        public Builder code(int i10) {
            this.err = i10;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Result result = (Result) obj;
            if (this.err == result.err) {
                String str = this.content;
                String str2 = result.content;
                a aVar = b.a;
                return str == str2 || (str != null && str.equals(str2));
            }
        }
        return false;
    }

    public String getContent() {
        return this.content;
    }

    public int getErr() {
        return this.err;
    }

    public int hashCode() {
        Object[] objArr = {Integer.valueOf(this.err), this.content};
        a aVar = b.a;
        return Arrays.hashCode(objArr);
    }

    public boolean isError() {
        return this.err == 1;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Result{err=");
        sb.append(this.err);
        sb.append(", content='");
        return E0.a.l(sb, this.content, "'}");
    }

    private Result(Builder builder) {
        this.err = builder.err;
        this.content = builder.content;
    }
}
