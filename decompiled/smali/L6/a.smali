.class public final LL6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static a(LM6/a;)Lcom/rollbar/api/payload/data/body/Trace;
    .locals 12

    .line 1
    new-instance v0, Lcom/rollbar/api/payload/data/body/Trace$Builder;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/rollbar/api/payload/data/body/Trace$Builder;-><init>()V

    .line 4
    .line 5
    .line 6
    iget-object v1, p0, LM6/a;->c:[Ljava/lang/StackTraceElement;

    .line 7
    .line 8
    array-length v2, v1

    .line 9
    invoke-static {v1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, [Ljava/lang/StackTraceElement;

    .line 14
    .line 15
    const/4 v2, 0x0

    .line 16
    iget-object v3, p0, LM6/a;->e:Ljava/lang/Throwable;

    .line 17
    .line 18
    if-nez v3, :cond_0

    .line 19
    .line 20
    sget-object v3, LF6/b;->a:Ljava/util/HashSet;

    .line 21
    .line 22
    move-object v3, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    sget-object v4, LF6/b;->b:LF2/c;

    .line 25
    .line 26
    invoke-virtual {v4}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    move-result-object v4

    .line 30
    check-cast v4, Ljava/util/Map;

    .line 31
    .line 32
    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    check-cast v3, [LF6/a;

    .line 37
    .line 38
    :goto_0
    if-eqz v3, :cond_1

    .line 39
    .line 40
    array-length v4, v3

    .line 41
    add-int/lit8 v4, v4, -0x1

    .line 42
    .line 43
    goto :goto_1

    .line 44
    :cond_1
    const/4 v4, 0x0

    .line 45
    :goto_1
    new-instance v5, Ljava/util/ArrayList;

    .line 46
    .line 47
    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 48
    .line 49
    .line 50
    array-length v6, v1

    .line 51
    add-int/lit8 v6, v6, -0x1

    .line 52
    .line 53
    :goto_2
    if-ltz v6, :cond_5

    .line 54
    .line 55
    aget-object v7, v1, v6

    .line 56
    .line 57
    if-eqz v3, :cond_4

    .line 58
    .line 59
    if-gez v4, :cond_3

    .line 60
    .line 61
    if-gez v4, :cond_2

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_2
    aget-object p0, v3, v4

    .line 65
    .line 66
    throw v2

    .line 67
    :cond_3
    aget-object p0, v3, v4

    .line 68
    .line 69
    throw v2

    .line 70
    :cond_4
    :goto_3
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getFileName()Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    move-result-object v8

    .line 74
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getLineNumber()I

    .line 75
    .line 76
    .line 77
    move-result v9

    .line 78
    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 79
    .line 80
    .line 81
    move-result-object v9

    .line 82
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;

    .line 83
    .line 84
    .line 85
    move-result-object v10

    .line 86
    invoke-virtual {v7}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v7

    .line 90
    new-instance v11, Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 91
    .line 92
    invoke-direct {v11}, Lcom/rollbar/api/payload/data/body/Frame$Builder;-><init>()V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v11, v8}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->filename(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    invoke-virtual {v8, v9}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->lineNumber(Ljava/lang/Integer;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 100
    .line 101
    .line 102
    move-result-object v8

    .line 103
    invoke-virtual {v8, v10}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->method(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 104
    .line 105
    .line 106
    move-result-object v8

    .line 107
    invoke-virtual {v8, v7}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->className(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 108
    .line 109
    .line 110
    move-result-object v7

    .line 111
    invoke-virtual {v7, v2}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->locals(Ljava/util/Map;)Lcom/rollbar/api/payload/data/body/Frame$Builder;

    .line 112
    .line 113
    .line 114
    move-result-object v7

    .line 115
    invoke-virtual {v7}, Lcom/rollbar/api/payload/data/body/Frame$Builder;->build()Lcom/rollbar/api/payload/data/body/Frame;

    .line 116
    .line 117
    .line 118
    move-result-object v7

    .line 119
    invoke-virtual {v5, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 120
    .line 121
    .line 122
    add-int/lit8 v6, v6, -0x1

    .line 123
    .line 124
    add-int/lit8 v4, v4, -0x1

    .line 125
    .line 126
    goto :goto_2

    .line 127
    :cond_5
    invoke-virtual {v0, v5}, Lcom/rollbar/api/payload/data/body/Trace$Builder;->frames(Ljava/util/List;)Lcom/rollbar/api/payload/data/body/Trace$Builder;

    .line 128
    .line 129
    .line 130
    move-result-object v0

    .line 131
    new-instance v1, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;

    .line 132
    .line 133
    invoke-direct {v1}, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;-><init>()V

    .line 134
    .line 135
    .line 136
    iget-object v3, p0, LM6/a;->a:Ljava/lang/String;

    .line 137
    .line 138
    invoke-virtual {v1, v3}, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;->className(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    iget-object p0, p0, LM6/a;->b:Ljava/lang/String;

    .line 143
    .line 144
    invoke-virtual {v1, p0}, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;->message(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;

    .line 145
    .line 146
    .line 147
    move-result-object p0

    .line 148
    invoke-virtual {p0, v2}, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;->description(Ljava/lang/String;)Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;

    .line 149
    .line 150
    .line 151
    move-result-object p0

    .line 152
    invoke-virtual {p0}, Lcom/rollbar/api/payload/data/body/ExceptionInfo$Builder;->build()Lcom/rollbar/api/payload/data/body/ExceptionInfo;

    .line 153
    .line 154
    .line 155
    move-result-object p0

    .line 156
    invoke-virtual {v0, p0}, Lcom/rollbar/api/payload/data/body/Trace$Builder;->exception(Lcom/rollbar/api/payload/data/body/ExceptionInfo;)Lcom/rollbar/api/payload/data/body/Trace$Builder;

    .line 157
    .line 158
    .line 159
    move-result-object p0

    .line 160
    invoke-virtual {p0}, Lcom/rollbar/api/payload/data/body/Trace$Builder;->build()Lcom/rollbar/api/payload/data/body/Trace;

    .line 161
    .line 162
    .line 163
    move-result-object p0

    .line 164
    return-object p0
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
.end method
