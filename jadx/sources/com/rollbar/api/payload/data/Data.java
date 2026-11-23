package com.rollbar.api.payload.data;

import U5.c;
import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.payload.data.body.Body;
import com.rollbar.api.truncation.StringTruncatable;
import com.rollbar.api.truncation.TruncationHelper;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class Data implements JsonSerializable, StringTruncatable<Data> {
    private static final long serialVersionUID = 4996853277611613397L;
    private final Body body;
    private final Client client;
    private final String codeVersion;
    private final String context;
    private final Map<String, Object> custom;
    private final String environment;
    private final String fingerprint;
    private final String framework;
    private final boolean isUncaught;
    private final String language;
    private final Level level;
    private final Notifier notifier;
    private final Person person;
    private final String platform;
    private final Request request;
    private final Server server;
    private final Long timestamp;
    private final String title;
    private final String uuid;

    public static final class Builder {
        private Body body;
        private Client client;
        private String codeVersion;
        private String context;
        private Map<String, Object> custom;
        private String environment;
        private String fingerprint;
        private String framework;
        private boolean isUncaught;
        private String language;
        private Level level;
        private Notifier notifier;
        private Person person;
        private String platform;
        private Request request;
        private Server server;
        private Long timestamp;
        private String title;
        private String uuid;

        public Builder() {
        }

        public Builder body(Body body) {
            this.body = body;
            return this;
        }

        public Data build() {
            return new Data(this);
        }

        public Builder client(Client client) {
            this.client = client;
            return this;
        }

        public Builder codeVersion(String str) {
            this.codeVersion = str;
            return this;
        }

        public Builder context(String str) {
            this.context = str;
            return this;
        }

        public Builder custom(Map<String, Object> map) {
            this.custom = map;
            return this;
        }

        public Builder environment(String str) {
            this.environment = str;
            return this;
        }

        public Builder fingerprint(String str) {
            this.fingerprint = str;
            return this;
        }

        public Builder framework(String str) {
            this.framework = str;
            return this;
        }

        public Builder isUncaught(boolean z6) {
            this.isUncaught = z6;
            return this;
        }

        public Builder language(String str) {
            this.language = str;
            return this;
        }

        public Builder level(String str) {
            this.level = Level.valueOf(str);
            return this;
        }

        public Builder notifier(Notifier notifier) {
            this.notifier = notifier;
            return this;
        }

        public Builder person(Person person) {
            this.person = person;
            return this;
        }

        public Builder platform(String str) {
            this.platform = str;
            return this;
        }

        public Builder request(Request request) {
            this.request = request;
            return this;
        }

        public Builder server(Server server) {
            this.server = server;
            return this;
        }

        public Builder timestamp(Long l4) {
            this.timestamp = l4;
            return this;
        }

        public Builder title(String str) {
            this.title = str;
            return this;
        }

        public Builder uuid(String str) {
            this.uuid = str;
            return this;
        }

        public Builder(Data data) {
            this.environment = data.environment;
            this.body = data.body;
            this.level = data.level;
            this.timestamp = data.timestamp;
            this.codeVersion = data.codeVersion;
            this.platform = data.platform;
            this.language = data.language;
            this.framework = data.framework;
            this.context = data.context;
            this.request = data.request;
            this.person = data.person;
            this.server = data.server;
            this.client = data.client;
            this.custom = data.custom;
            this.fingerprint = data.fingerprint;
            this.title = data.title;
            this.uuid = data.uuid;
            this.isUncaught = data.isUncaught;
            this.notifier = data.notifier;
        }

        public Builder level(Level level) {
            this.level = level;
            return this;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            Data data = (Data) obj;
            if (this.isUncaught != data.isUncaught) {
                return false;
            }
            String str = this.environment;
            if (str == null ? data.environment != null : !str.equals(data.environment)) {
                return false;
            }
            Body body = this.body;
            if (body == null ? data.body != null : !body.equals(data.body)) {
                return false;
            }
            if (this.level != data.level) {
                return false;
            }
            Long l4 = this.timestamp;
            if (l4 == null ? data.timestamp != null : !l4.equals(data.timestamp)) {
                return false;
            }
            String str2 = this.codeVersion;
            if (str2 == null ? data.codeVersion != null : !str2.equals(data.codeVersion)) {
                return false;
            }
            String str3 = this.platform;
            if (str3 == null ? data.platform != null : !str3.equals(data.platform)) {
                return false;
            }
            String str4 = this.language;
            if (str4 == null ? data.language != null : !str4.equals(data.language)) {
                return false;
            }
            String str5 = this.framework;
            if (str5 == null ? data.framework != null : !str5.equals(data.framework)) {
                return false;
            }
            String str6 = this.context;
            if (str6 == null ? data.context != null : !str6.equals(data.context)) {
                return false;
            }
            Request request = this.request;
            if (request == null ? data.request != null : !request.equals(data.request)) {
                return false;
            }
            Person person = this.person;
            if (person == null ? data.person != null : !person.equals(data.person)) {
                return false;
            }
            Server server = this.server;
            if (server == null ? data.server != null : !server.equals(data.server)) {
                return false;
            }
            Client client = this.client;
            if (client == null ? data.client != null : !client.equals(data.client)) {
                return false;
            }
            Map<String, Object> map = this.custom;
            if (map == null ? data.custom != null : !map.equals(data.custom)) {
                return false;
            }
            String str7 = this.fingerprint;
            if (str7 == null ? data.fingerprint != null : !str7.equals(data.fingerprint)) {
                return false;
            }
            String str8 = this.title;
            if (str8 == null ? data.title != null : !str8.equals(data.title)) {
                return false;
            }
            String str9 = this.uuid;
            if (str9 == null ? data.uuid != null : !str9.equals(data.uuid)) {
                return false;
            }
            Notifier notifier = this.notifier;
            Notifier notifier2 = data.notifier;
            if (notifier != null) {
                return notifier.equals(notifier2);
            }
            if (notifier2 == null) {
                return true;
            }
        }
        return false;
    }

    public Body getBody() {
        return this.body;
    }

    public Client getClient() {
        return this.client;
    }

    public String getCodeVersion() {
        return this.codeVersion;
    }

    public String getContext() {
        return this.context;
    }

    public Map<String, Object> getCustom() {
        return this.custom;
    }

    public String getEnvironment() {
        return this.environment;
    }

    public String getFingerprint() {
        return this.fingerprint;
    }

    public String getFramework() {
        return this.framework;
    }

    public String getLanguage() {
        return this.language;
    }

    public Level getLevel() {
        return this.level;
    }

    public Notifier getNotifier() {
        return this.notifier;
    }

    public Person getPerson() {
        return this.person;
    }

    public String getPlatform() {
        return this.platform;
    }

    public Request getRequest() {
        return this.request;
    }

    public Server getServer() {
        return this.server;
    }

    public Long getTimestamp() {
        return this.timestamp;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        String str = this.environment;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Body body = this.body;
        int iHashCode2 = (iHashCode + (body != null ? body.hashCode() : 0)) * 31;
        Level level = this.level;
        int iHashCode3 = (iHashCode2 + (level != null ? level.hashCode() : 0)) * 31;
        Long l4 = this.timestamp;
        int iHashCode4 = (iHashCode3 + (l4 != null ? l4.hashCode() : 0)) * 31;
        String str2 = this.codeVersion;
        int iHashCode5 = (iHashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.platform;
        int iHashCode6 = (iHashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.language;
        int iHashCode7 = (iHashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.framework;
        int iHashCode8 = (iHashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.context;
        int iHashCode9 = (iHashCode8 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Request request = this.request;
        int iHashCode10 = (iHashCode9 + (request != null ? request.hashCode() : 0)) * 31;
        Person person = this.person;
        int iHashCode11 = (iHashCode10 + (person != null ? person.hashCode() : 0)) * 31;
        Server server = this.server;
        int iHashCode12 = (iHashCode11 + (server != null ? server.hashCode() : 0)) * 31;
        Client client = this.client;
        int iHashCode13 = (iHashCode12 + (client != null ? client.hashCode() : 0)) * 31;
        Map<String, Object> map = this.custom;
        int iHashCode14 = (iHashCode13 + (map != null ? map.hashCode() : 0)) * 31;
        String str7 = this.fingerprint;
        int iHashCode15 = (iHashCode14 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.title;
        int iHashCode16 = (iHashCode15 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.uuid;
        int iHashCode17 = (((iHashCode16 + (str9 != null ? str9.hashCode() : 0)) * 31) + (this.isUncaught ? 1 : 0)) * 31;
        Notifier notifier = this.notifier;
        return iHashCode17 + (notifier != null ? notifier.hashCode() : 0);
    }

    public boolean isUncaught() {
        return this.isUncaught;
    }

    public String toString() {
        return "Data{environment='" + this.environment + "', body=" + this.body + ", level=" + this.level + ", timestamp=" + this.timestamp + ", codeVersion='" + this.codeVersion + "', platform='" + this.platform + "', language='" + this.language + "', framework='" + this.framework + "', context='" + this.context + "', request=" + this.request + ", person=" + this.person + ", server=" + this.server + ", client=" + this.client + ", custom=" + this.custom + ", fingerprint='" + this.fingerprint + "', title='" + this.title + "', uuid='" + this.uuid + "', isUncaught='" + this.isUncaught + "', notifier=" + this.notifier + '}';
    }

    private Data(Builder builder) {
        this.environment = builder.environment;
        this.body = builder.body;
        this.level = builder.level;
        this.timestamp = builder.timestamp;
        this.codeVersion = builder.codeVersion;
        this.platform = builder.platform;
        this.language = builder.language;
        this.framework = builder.framework;
        this.context = builder.context;
        this.request = builder.request;
        this.person = builder.person;
        this.server = builder.server;
        this.client = builder.client;
        this.custom = builder.custom != null ? builder.custom : null;
        this.fingerprint = builder.fingerprint;
        this.title = builder.title;
        this.uuid = builder.uuid;
        this.isUncaught = builder.isUncaught;
        this.notifier = builder.notifier;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public Map<String, Object> asJson() {
        HashMap map = new HashMap();
        String str = this.environment;
        if (str != null) {
            map.put("environment", str);
        }
        Body body = this.body;
        if (body != null) {
            map.put("body", body);
        }
        Level level = this.level;
        if (level != null) {
            map.put("level", level.asJson());
        }
        Long l4 = this.timestamp;
        if (l4 != null) {
            map.put("timestamp", Double.valueOf(l4.longValue() / 1000.0d));
        }
        String str2 = this.codeVersion;
        if (str2 != null) {
            map.put("code_version", str2);
        }
        String str3 = this.platform;
        if (str3 != null) {
            map.put("platform", str3);
        }
        String str4 = this.language;
        if (str4 != null) {
            map.put("language", str4);
        }
        String str5 = this.framework;
        if (str5 != null) {
            map.put("framework", str5);
        }
        String str6 = this.context;
        if (str6 != null) {
            map.put("context", str6);
        }
        Request request = this.request;
        if (request != null) {
            map.put("request", request);
        }
        Person person = this.person;
        if (person != null) {
            map.put("person", person);
        }
        Server server = this.server;
        if (server != null) {
            map.put("server", server);
        }
        Client client = this.client;
        if (client != null) {
            map.put("client", client);
        }
        Map<String, Object> map2 = this.custom;
        if (map2 != null) {
            map.put(c.PAYLOAD_OS_ROOT_CUSTOM, map2);
        }
        String str7 = this.fingerprint;
        if (str7 != null) {
            map.put("fingerprint", str7);
        }
        String str8 = this.title;
        if (str8 != null) {
            map.put("title", str8);
        }
        String str9 = this.uuid;
        if (str9 != null) {
            map.put("uuid", str9);
        }
        Notifier notifier = this.notifier;
        if (notifier != null) {
            map.put("notifier", notifier);
        }
        return map;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.rollbar.api.truncation.StringTruncatable
    /* JADX INFO: renamed from: truncateStrings */
    public Data truncateStrings2(int i10) {
        return new Builder(this).environment(TruncationHelper.truncateString(this.environment, i10)).body((Body) TruncationHelper.truncateStringsInObject(this.body, i10)).codeVersion(TruncationHelper.truncateString(this.codeVersion, i10)).platform(TruncationHelper.truncateString(this.platform, i10)).language(TruncationHelper.truncateString(this.language, i10)).framework(TruncationHelper.truncateString(this.framework, i10)).context(TruncationHelper.truncateString(this.context, i10)).request((Request) TruncationHelper.truncateStringsInObject(this.request, i10)).person((Person) TruncationHelper.truncateStringsInObject(this.person, i10)).server((Server) TruncationHelper.truncateStringsInObject(this.server, i10)).client((Client) TruncationHelper.truncateStringsInObject(this.client, i10)).custom(TruncationHelper.truncateStringsInMap(this.custom, i10)).fingerprint(TruncationHelper.truncateString(this.fingerprint, i10)).title(TruncationHelper.truncateString(this.title, i10)).uuid(TruncationHelper.truncateString(this.uuid, i10)).notifier((Notifier) TruncationHelper.truncateStringsInObject(this.notifier, i10)).build();
    }
}
