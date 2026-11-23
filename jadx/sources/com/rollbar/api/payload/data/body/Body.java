package com.rollbar.api.payload.data.body;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.truncation.StringTruncatable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class Body implements JsonSerializable, StringTruncatable<Body> {
    private static final long serialVersionUID = -2783273957046705016L;
    private final BodyContent bodyContent;

    public static final class Builder {
        private BodyContent bodyContent;

        public Builder() {
        }

        public Builder bodyContent(BodyContent bodyContent) {
            this.bodyContent = bodyContent;
            return this;
        }

        public Body build() {
            return new Body(this);
        }

        public Builder(Body body) {
            this.bodyContent = body.bodyContent;
        }
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Object asJson() {
        HashMap map = new HashMap();
        BodyContent bodyContent = this.bodyContent;
        if (bodyContent != null) {
            map.put(bodyContent.getKeyName(), this.bodyContent);
        }
        return map;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            BodyContent bodyContent = this.bodyContent;
            BodyContent bodyContent2 = ((Body) obj).bodyContent;
            if (bodyContent != null) {
                return bodyContent.equals(bodyContent2);
            }
            if (bodyContent2 == null) {
                return true;
            }
        }
        return false;
    }

    public BodyContent getContents() {
        return this.bodyContent;
    }

    public int hashCode() {
        BodyContent bodyContent = this.bodyContent;
        if (bodyContent != null) {
            return bodyContent.hashCode();
        }
        return 0;
    }

    public String toString() {
        return "Body{bodyContent=" + this.bodyContent + '}';
    }

    private Body(Builder builder) {
        this.bodyContent = builder.bodyContent;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    public Body truncateStrings(int i10) {
        return this.bodyContent != null ? new Builder(this).bodyContent(this.bodyContent.truncateStrings(i10)).build() : this;
    }
}
