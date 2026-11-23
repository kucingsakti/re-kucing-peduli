package com.rollbar.notifier.sender.json;

import com.rollbar.api.json.JsonSerializable;
import com.rollbar.api.payload.Payload;
import com.rollbar.notifier.sender.result.Result;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Collection;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes.dex */
public class JsonSerializerImpl implements JsonSerializer {
    private final boolean prettyPrint;
    private static final Pattern CODE_PATTERN = Pattern.compile("\"err\"\\s*:\\s*(\\d)");
    private static final Pattern MESSAGE_PATTERN = Pattern.compile("\"message\"\\s*:\\s*\"([^\"]*)\"");
    private static final Pattern UUID_PATTERN = Pattern.compile("\"uuid\"\\s*:\\s*\"([^\"]*)\"");
    private static final String[] REPLACEMENT_CHARS = new String[128];

    static {
        for (int i10 = 0; i10 <= 31; i10++) {
            REPLACEMENT_CHARS[i10] = String.format("\\u%04x", Integer.valueOf(i10));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
    }

    public JsonSerializerImpl() {
        this(false);
    }

    private static Map<String, Object> asMap(Map map) {
        return map;
    }

    private static void indent(StringBuilder sb, int i10) {
        for (int i11 = 0; i11 <= i10; i11++) {
            sb.append("  ");
        }
    }

    private void serializeArray(StringBuilder sb, Object[] objArr, int i10) {
        sb.append('[');
        int length = objArr.length;
        String str = "";
        int i11 = 0;
        while (i11 < length) {
            Object obj = objArr[i11];
            sb.append(str);
            if (this.prettyPrint) {
                sb.append("\n");
                indent(sb, i10);
            }
            serializeValue(sb, obj, i10 + 1);
            i11++;
            str = ",";
        }
        sb.append(']');
    }

    private static void serializeBoolean(StringBuilder sb, Boolean bool) {
        sb.append(bool.booleanValue() ? "true" : "false");
    }

    private static void serializeDefault(StringBuilder sb, Object obj) {
        serializeString(sb, obj == null ? "" : obj.toString());
    }

    private static void serializeNull(StringBuilder sb) {
        sb.append("null");
    }

    private static void serializeNumber(StringBuilder sb, Number number) {
        sb.append(number);
    }

    private void serializeObject(Map<String, Object> map, StringBuilder sb, int i10) {
        sb.append('{');
        String str = "";
        for (Map.Entry<String, Object> entry : map.entrySet()) {
            sb.append(str);
            if (this.prettyPrint) {
                sb.append("\n");
                indent(sb, i10);
            }
            serializeString(sb, entry.getKey());
            sb.append(':');
            if (this.prettyPrint) {
                sb.append(" ");
            }
            serializeValue(sb, entry.getValue(), i10 + 1);
            str = ",";
        }
        if (this.prettyPrint) {
            sb.append("\n");
        }
        sb.append('}');
    }

    /* JADX WARN: Code duplicated, block: B:16:0x002b  */
    private static void serializeString(StringBuilder sb, String str) {
        String str2;
        sb.append('\"');
        int length = str.length();
        int i10 = 0;
        for (int i11 = 0; i11 < length; i11++) {
            char cCharAt = str.charAt(i11);
            if (cCharAt < 128) {
                str2 = REPLACEMENT_CHARS[cCharAt];
                if (str2 != null) {
                    if (i10 < i11) {
                        sb.append((CharSequence) str, i10, i11);
                    }
                    sb.append(str2);
                    i10 = i11 + 1;
                }
            } else {
                if (cCharAt == 8232) {
                    str2 = "\\u2028";
                } else if (cCharAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i10 < i11) {
                    sb.append((CharSequence) str, i10, i11);
                }
                sb.append(str2);
                i10 = i11 + 1;
            }
        }
        if (i10 < length) {
            sb.append((CharSequence) str, i10, length);
        }
        sb.append('\"');
    }

    private static void serializeThrowable(StringBuilder sb, Throwable th) {
        th.printStackTrace(new PrintWriter(new StringWriter()));
        serializeString(sb, th.toString());
    }

    private void serializeValue(StringBuilder sb, Object obj, int i10) {
        if (obj == null) {
            serializeNull(sb);
            return;
        }
        if (obj instanceof Boolean) {
            serializeBoolean(sb, (Boolean) obj);
            return;
        }
        if (obj instanceof Number) {
            serializeNumber(sb, (Number) obj);
            return;
        }
        if (obj instanceof String) {
            serializeString(sb, (String) obj);
            return;
        }
        if (obj instanceof JsonSerializable) {
            serializeValue(sb, ((JsonSerializable) obj).asJson(), i10);
            return;
        }
        if (obj instanceof Map) {
            serializeObject(asMap((Map) obj), sb, i10);
            return;
        }
        if (obj instanceof Collection) {
            serializeArray(sb, ((Collection) obj).toArray(), i10);
            return;
        }
        if (obj instanceof Object[]) {
            serializeArray(sb, (Object[]) obj, i10);
        } else if (obj instanceof Throwable) {
            serializeThrowable(sb, (Throwable) obj);
        } else {
            serializeDefault(sb, obj);
        }
    }

    @Override // com.rollbar.notifier.sender.json.JsonSerializer
    public Result resultFrom(String str) {
        int i10;
        Matcher matcher = CODE_PATTERN.matcher(str);
        if (!matcher.find()) {
            return new Result.Builder().code(1).body(str).build();
        }
        try {
            i10 = Integer.parseInt(matcher.group(1));
        } catch (Exception unused) {
            i10 = -1;
        }
        Matcher matcher2 = (i10 == 0 ? UUID_PATTERN : MESSAGE_PATTERN).matcher(str);
        matcher2.find();
        return new Result.Builder().code(i10).body(matcher2.group(1)).build();
    }

    @Override // com.rollbar.notifier.sender.json.JsonSerializer
    public String toJson(Payload payload) {
        String str = payload.json;
        return str != null ? str : toJson(payload.asJson());
    }

    public JsonSerializerImpl(boolean z6) {
        this.prettyPrint = z6;
    }

    public String toJson(Map<String, Object> map) {
        StringBuilder sb = new StringBuilder();
        serializeObject(map, sb, 0);
        return sb.toString();
    }
}
