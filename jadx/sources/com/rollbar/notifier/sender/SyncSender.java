package com.rollbar.notifier.sender;

import E0.a;
import L6.b;
import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.json.JsonSerializer;
import com.rollbar.notifier.sender.json.JsonSerializerImpl;
import com.rollbar.notifier.sender.result.Response;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.Proxy;
import java.net.URL;

/* JADX INFO: loaded from: classes.dex */
public class SyncSender extends AbstractSender {
    public static final String DEFAULT_API_ENDPOINT = "https://api.rollbar.com/api/1/item/";
    public static final String UTF_8 = "UTF-8";
    private final String accessToken;
    private final JsonSerializer jsonSerializer;
    private final Proxy proxy;
    private final URL url;

    public static final class Builder {
        private String accessToken;
        private JsonSerializer jsonSerializer;
        private Proxy proxy;
        private URL url;

        public Builder() {
            this(SyncSender.DEFAULT_API_ENDPOINT);
        }

        private static URL parseUrl(String str) {
            try {
                return new URL(str);
            } catch (MalformedURLException e10) {
                throw new IllegalArgumentException(a.h("The url provided is not valid: ", str), e10);
            }
        }

        public Builder accessToken(String str) {
            this.accessToken = str;
            return this;
        }

        public SyncSender build() {
            return new SyncSender(this);
        }

        public Builder jsonSerializer(JsonSerializer jsonSerializer) {
            this.jsonSerializer = jsonSerializer;
            return this;
        }

        public Builder proxy(Proxy proxy) {
            this.proxy = proxy;
            return this;
        }

        public Builder url(String str) {
            this.url = parseUrl(str);
            return this;
        }

        public Builder(String str) {
            this.url = parseUrl(str);
            this.jsonSerializer = new JsonSerializerImpl();
            this.proxy = null;
        }

        public Builder url(URL url) {
            this.url = url;
            return this;
        }
    }

    public SyncSender(Builder builder) {
        this.url = builder.url;
        this.jsonSerializer = builder.jsonSerializer;
        this.accessToken = builder.accessToken;
        this.proxy = builder.proxy != null ? builder.proxy : Proxy.NO_PROXY;
    }

    private HttpURLConnection getConnection() throws IOException {
        HttpURLConnection httpURLConnection = (HttpURLConnection) this.url.openConnection(this.proxy);
        String str = this.accessToken;
        if (str != null && !"".equals(str)) {
            httpURLConnection.setRequestProperty("x-rollbar-access-token", this.accessToken);
        }
        httpURLConnection.setRequestProperty("Accept-Charset", UTF_8);
        httpURLConnection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
        httpURLConnection.setRequestProperty("Accept", "application/json");
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setRequestMethod("POST");
        return httpURLConnection;
    }

    private static String getResponseContent(HttpURLConnection httpURLConnection) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getResponseCode() == 200 ? httpURLConnection.getInputStream() : httpURLConnection.getErrorStream(), UTF_8));
        StringBuilder sb = new StringBuilder();
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) {
                bufferedReader.close();
                return sb.toString();
            }
            if (sb.length() != 0) {
                sb.append("\n");
            }
            sb.append(line);
        }
    }

    private Response send(String str) throws IOException {
        HttpURLConnection connection = getConnection();
        sendJson(connection, str.getBytes(UTF_8));
        return readResponse(connection);
    }

    private void sendJson(HttpURLConnection httpURLConnection, byte[] bArr) throws IOException {
        OutputStream outputStream = null;
        try {
            try {
                outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr, 0, bArr.length);
                b.a(outputStream);
            } catch (IOException e10) {
                throw e10;
            }
        } catch (Throwable th) {
            b.a(outputStream);
            throw th;
        }
    }

    @Override // com.rollbar.notifier.sender.AbstractSender, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        getConnection().disconnect();
    }

    @Override // com.rollbar.notifier.sender.AbstractSender
    public Response doSend(Payload payload) throws Exception {
        return send(this.jsonSerializer.toJson(payload));
    }

    public Response readResponse(HttpURLConnection httpURLConnection) throws IOException {
        int responseCode = httpURLConnection.getResponseCode();
        return new Response.Builder().status(responseCode).result(this.jsonSerializer.resultFrom(getResponseContent(httpURLConnection))).build();
    }
}
