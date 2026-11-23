.class public final LE6/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LI6/a;


# instance fields
.field public final s:I

.field public final t:Ljava/lang/String;

.field public final u:I


# direct methods
.method public constructor <init>(LE/g;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget v0, p1, LE/g;->s:I

    .line 5
    .line 6
    iput v0, p0, LE6/a;->s:I

    .line 7
    .line 8
    iget-object p1, p1, LE/g;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Ljava/lang/String;

    .line 11
    .line 12
    iput-object p1, p0, LE6/a;->t:Ljava/lang/String;

    .line 13
    .line 14
    const/4 p1, 0x0

    .line 15
    iput p1, p0, LE6/a;->u:I

    .line 16
    .line 17
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final b()Ljava/lang/Object;
    .locals 8

    .line 1
    new-instance v0, Ljava/util/HashMap;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    .line 4
    .line 5
    .line 6
    const-string v1, "phone_model"

    .line 7
    .line 8
    sget-object v2, Landroid/os/Build;->MODEL:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    const-string v1, "android_version"

    .line 14
    .line 15
    sget-object v2, Landroid/os/Build$VERSION;->RELEASE:Ljava/lang/String;

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    const-string v1, "code_version"

    .line 21
    .line 22
    iget-object v2, p0, LE6/a;->t:Ljava/lang/String;

    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    iget v3, p0, LE6/a;->s:I

    .line 28
    .line 29
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object v4

    .line 33
    const-string v5, "version_code"

    .line 34
    .line 35
    invoke-virtual {v0, v5, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    const-string v4, "version_name"

    .line 39
    .line 40
    invoke-virtual {v0, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    .line 42
    .line 43
    new-instance v6, Lcom/rollbar/api/payload/data/Client$Builder;

    .line 44
    .line 45
    invoke-direct {v6}, Lcom/rollbar/api/payload/data/Client$Builder;-><init>()V

    .line 46
    .line 47
    .line 48
    const-string v7, "android"

    .line 49
    .line 50
    invoke-virtual {v6, v7, v0}, Lcom/rollbar/api/payload/data/Client$Builder;->addClient(Ljava/lang/String;Ljava/util/Map;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 55
    .line 56
    .line 57
    move-result-object v6

    .line 58
    invoke-virtual {v0, v1, v6}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 59
    .line 60
    .line 61
    move-result-object v0

    .line 62
    const-string v1, "name_version"

    .line 63
    .line 64
    invoke-virtual {v0, v1, v2}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 65
    .line 66
    .line 67
    move-result-object v0

    .line 68
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 69
    .line 70
    .line 71
    move-result-object v1

    .line 72
    invoke-virtual {v0, v5, v1}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 73
    .line 74
    .line 75
    move-result-object v0

    .line 76
    invoke-virtual {v0, v4, v2}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 77
    .line 78
    .line 79
    move-result-object v0

    .line 80
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 81
    .line 82
    .line 83
    move-result-wide v1

    .line 84
    const-wide/16 v3, 0x3e8

    .line 85
    .line 86
    div-long/2addr v1, v3

    .line 87
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 88
    .line 89
    .line 90
    move-result-object v1

    .line 91
    const-string v2, "timestamp"

    .line 92
    .line 93
    invoke-virtual {v0, v2, v1}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 94
    .line 95
    .line 96
    move-result-object v0

    .line 97
    const-string v1, "user_ip"

    .line 98
    .line 99
    iget v2, p0, LE6/a;->u:I

    .line 100
    .line 101
    if-nez v2, :cond_0

    .line 102
    .line 103
    const-string v2, "$remote_ip"

    .line 104
    .line 105
    invoke-virtual {v0, v1, v2}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_0
    const/4 v3, 0x1

    .line 110
    if-ne v2, v3, :cond_1

    .line 111
    .line 112
    const-string v2, "$remote_ip_anonymize"

    .line 113
    .line 114
    invoke-virtual {v0, v1, v2}, Lcom/rollbar/api/payload/data/Client$Builder;->addTopLevel(Ljava/lang/String;Ljava/lang/Object;)Lcom/rollbar/api/payload/data/Client$Builder;

    .line 115
    .line 116
    .line 117
    :cond_1
    :goto_0
    invoke-virtual {v0}, Lcom/rollbar/api/payload/data/Client$Builder;->build()Lcom/rollbar/api/payload/data/Client;

    .line 118
    .line 119
    .line 120
    move-result-object v0

    .line 121
    return-object v0
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
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
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
.end method
