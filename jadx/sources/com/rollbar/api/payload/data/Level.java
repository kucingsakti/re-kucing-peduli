package com.rollbar.api.payload.data;

import com.rollbar.api.json.JsonSerializable;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public enum Level implements Comparable<Level>, JsonSerializable {
    CRITICAL("critical", 50),
    ERROR("error", 40),
    WARNING("warning", 30),
    INFO("info", 20),
    DEBUG("debug", 10);

    private static final HashMap<String, Level> nameIndex = new HashMap<>(values().length * 2);
    private final String jsonName;
    private final int level;

    static {
        for (Level level : values()) {
            nameIndex.put(level.jsonName, level);
        }
    }

    Level(String str, int i10) {
        this.jsonName = str;
        this.level = i10;
    }

    public static Level lookupByName(String str) {
        if (str != null) {
            return nameIndex.get(str.toLowerCase());
        }
        return null;
    }

    public int level() {
        return this.level;
    }

    @Override // com.rollbar.api.json.JsonSerializable
    public String asJson() {
        return this.jsonName;
    }
}
