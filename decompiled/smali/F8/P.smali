.class public final LF8/P;
.super LF8/B;
.source "SourceFile"


# static fields
.field public static final synthetic g:[LC8/u;


# instance fields
.field public final c:LF8/r0;

.field public final d:LF8/r0;

.field public final e:LF8/s0;

.field public final f:LF8/s0;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    new-instance v0, Lv8/n;

    .line 2
    .line 3
    sget-object v1, Lv8/u;->a:Lv8/v;

    .line 4
    .line 5
    const-class v2, LF8/P;

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    const-string v4, "kotlinClass"

    .line 12
    .line 13
    const-string v5, "getKotlinClass()Lorg/jetbrains/kotlin/descriptors/runtime/components/ReflectKotlinClass;"

    .line 14
    .line 15
    invoke-direct {v0, v3, v4, v5}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v0}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 19
    .line 20
    .line 21
    move-result-object v0

    .line 22
    new-instance v3, Lv8/n;

    .line 23
    .line 24
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    const-string v5, "scope"

    .line 29
    .line 30
    const-string v6, "getScope()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"

    .line 31
    .line 32
    invoke-direct {v3, v4, v5, v6}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1, v3}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 36
    .line 37
    .line 38
    move-result-object v3

    .line 39
    new-instance v4, Lv8/n;

    .line 40
    .line 41
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 42
    .line 43
    .line 44
    move-result-object v5

    .line 45
    const-string v6, "multifileFacade"

    .line 46
    .line 47
    const-string v7, "getMultifileFacade()Ljava/lang/Class;"

    .line 48
    .line 49
    invoke-direct {v4, v5, v6, v7}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v4}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    new-instance v5, Lv8/n;

    .line 57
    .line 58
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 59
    .line 60
    .line 61
    move-result-object v6

    .line 62
    const-string v7, "metadata"

    .line 63
    .line 64
    const-string v8, "getMetadata()Lkotlin/Triple;"

    .line 65
    .line 66
    invoke-direct {v5, v6, v7, v8}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v5}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 70
    .line 71
    .line 72
    move-result-object v5

    .line 73
    new-instance v6, Lv8/n;

    .line 74
    .line 75
    invoke-virtual {v1, v2}, Lv8/v;->b(Ljava/lang/Class;)LC8/c;

    .line 76
    .line 77
    .line 78
    move-result-object v2

    .line 79
    const-string v7, "members"

    .line 80
    .line 81
    const-string v8, "getMembers()Ljava/util/Collection;"

    .line 82
    .line 83
    invoke-direct {v6, v2, v7, v8}, Lv8/n;-><init>(LC8/e;Ljava/lang/String;Ljava/lang/String;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v6}, Lv8/v;->f(Lv8/n;)LC8/r;

    .line 87
    .line 88
    .line 89
    move-result-object v1

    .line 90
    const/4 v2, 0x5

    .line 91
    new-array v2, v2, [LC8/u;

    .line 92
    .line 93
    const/4 v6, 0x0

    .line 94
    aput-object v0, v2, v6

    .line 95
    .line 96
    const/4 v0, 0x1

    .line 97
    aput-object v3, v2, v0

    .line 98
    .line 99
    const/4 v0, 0x2

    .line 100
    aput-object v4, v2, v0

    .line 101
    .line 102
    const/4 v0, 0x3

    .line 103
    aput-object v5, v2, v0

    .line 104
    .line 105
    const/4 v0, 0x4

    .line 106
    aput-object v1, v2, v0

    .line 107
    .line 108
    sput-object v2, LF8/P;->g:[LC8/u;

    .line 109
    .line 110
    return-void
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
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

.method public constructor <init>(LF8/S;)V
    .locals 3

    .line 1
    invoke-direct {p0, p1}, LF8/B;-><init>(LF8/D;)V

    .line 2
    .line 3
    .line 4
    new-instance v0, LF8/M;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, LF8/M;-><init>(LF8/S;I)V

    .line 8
    .line 9
    .line 10
    const/4 v1, 0x0

    .line 11
    invoke-static {v1, v0}, LF8/t0;->j(LL8/c;Lu8/a;)LF8/r0;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iput-object v0, p0, LF8/P;->c:LF8/r0;

    .line 16
    .line 17
    new-instance v0, LF8/O;

    .line 18
    .line 19
    const/4 v2, 0x1

    .line 20
    invoke-direct {v0, p0, v2}, LF8/O;-><init>(LF8/P;I)V

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v0}, LF8/t0;->j(LL8/c;Lu8/a;)LF8/r0;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    iput-object v0, p0, LF8/P;->d:LF8/r0;

    .line 28
    .line 29
    new-instance v0, LF8/N;

    .line 30
    .line 31
    invoke-direct {v0, p0, p1}, LF8/N;-><init>(LF8/P;LF8/S;)V

    .line 32
    .line 33
    .line 34
    new-instance v2, LF8/s0;

    .line 35
    .line 36
    invoke-direct {v2, v0}, LF8/s0;-><init>(Lu8/a;)V

    .line 37
    .line 38
    .line 39
    iput-object v2, p0, LF8/P;->e:LF8/s0;

    .line 40
    .line 41
    new-instance v0, LF8/O;

    .line 42
    .line 43
    const/4 v2, 0x0

    .line 44
    invoke-direct {v0, p0, v2}, LF8/O;-><init>(LF8/P;I)V

    .line 45
    .line 46
    .line 47
    new-instance v2, LF8/s0;

    .line 48
    .line 49
    invoke-direct {v2, v0}, LF8/s0;-><init>(Lu8/a;)V

    .line 50
    .line 51
    .line 52
    iput-object v2, p0, LF8/P;->f:LF8/s0;

    .line 53
    .line 54
    new-instance v0, LF8/N;

    .line 55
    .line 56
    invoke-direct {v0, p1, p0}, LF8/N;-><init>(LF8/S;LF8/P;)V

    .line 57
    .line 58
    .line 59
    invoke-static {v1, v0}, LF8/t0;->j(LL8/c;Lu8/a;)LF8/r0;

    .line 60
    .line 61
    .line 62
    return-void
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
.end method
