.class public abstract LU8/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lj9/c;

.field public static final b:Lj9/c;

.field public static final c:Lj9/c;

.field public static final d:Lj9/c;

.field public static final e:Ljava/util/List;

.field public static final f:Ljava/lang/Object;

.field public static final g:Ljava/util/LinkedHashMap;

.field public static final h:Ljava/util/Set;


# direct methods
.method static constructor <clinit>()V
    .locals 10

    .line 1
    new-instance v0, Lj9/c;

    .line 2
    .line 3
    const-string v1, "javax.annotation.meta.TypeQualifierNickname"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    sput-object v0, LU8/b;->a:Lj9/c;

    .line 9
    .line 10
    new-instance v0, Lj9/c;

    .line 11
    .line 12
    const-string v1, "javax.annotation.meta.TypeQualifier"

    .line 13
    .line 14
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    sput-object v0, LU8/b;->b:Lj9/c;

    .line 18
    .line 19
    new-instance v0, Lj9/c;

    .line 20
    .line 21
    const-string v1, "javax.annotation.meta.TypeQualifierDefault"

    .line 22
    .line 23
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    sput-object v0, LU8/b;->c:Lj9/c;

    .line 27
    .line 28
    new-instance v0, Lj9/c;

    .line 29
    .line 30
    const-string v1, "kotlin.annotations.jvm.UnderMigration"

    .line 31
    .line 32
    invoke-direct {v0, v1}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, LU8/b;->d:Lj9/c;

    .line 36
    .line 37
    sget-object v0, LU8/a;->u:LU8/a;

    .line 38
    .line 39
    const/4 v1, 0x5

    .line 40
    new-array v1, v1, [LU8/a;

    .line 41
    .line 42
    sget-object v2, LU8/a;->v:LU8/a;

    .line 43
    .line 44
    const/4 v3, 0x0

    .line 45
    aput-object v2, v1, v3

    .line 46
    .line 47
    sget-object v2, LU8/a;->t:LU8/a;

    .line 48
    .line 49
    const/4 v4, 0x1

    .line 50
    aput-object v2, v1, v4

    .line 51
    .line 52
    const/4 v2, 0x2

    .line 53
    aput-object v0, v1, v2

    .line 54
    .line 55
    sget-object v5, LU8/a;->x:LU8/a;

    .line 56
    .line 57
    const/4 v6, 0x3

    .line 58
    aput-object v5, v1, v6

    .line 59
    .line 60
    sget-object v5, LU8/a;->w:LU8/a;

    .line 61
    .line 62
    const/4 v6, 0x4

    .line 63
    aput-object v5, v1, v6

    .line 64
    .line 65
    invoke-static {v1}, Li8/l;->C([Ljava/lang/Object;)Ljava/util/List;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    sput-object v1, LU8/b;->e:Ljava/util/List;

    .line 70
    .line 71
    sget-object v5, LU8/y;->c:Lj9/c;

    .line 72
    .line 73
    new-instance v6, LU8/n;

    .line 74
    .line 75
    new-instance v7, Lb9/i;

    .line 76
    .line 77
    sget-object v8, Lb9/h;->u:Lb9/h;

    .line 78
    .line 79
    invoke-direct {v7, v8}, Lb9/i;-><init>(Lb9/h;)V

    .line 80
    .line 81
    .line 82
    check-cast v1, Ljava/util/Collection;

    .line 83
    .line 84
    invoke-direct {v6, v7, v1, v3}, LU8/n;-><init>(Lb9/i;Ljava/util/Collection;Z)V

    .line 85
    .line 86
    .line 87
    new-instance v7, Lh8/f;

    .line 88
    .line 89
    invoke-direct {v7, v5, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 90
    .line 91
    .line 92
    sget-object v5, LU8/y;->f:Lj9/c;

    .line 93
    .line 94
    new-instance v6, LU8/n;

    .line 95
    .line 96
    new-instance v9, Lb9/i;

    .line 97
    .line 98
    invoke-direct {v9, v8}, Lb9/i;-><init>(Lb9/h;)V

    .line 99
    .line 100
    .line 101
    invoke-direct {v6, v9, v1, v3}, LU8/n;-><init>(Lb9/i;Ljava/util/Collection;Z)V

    .line 102
    .line 103
    .line 104
    new-instance v1, Lh8/f;

    .line 105
    .line 106
    invoke-direct {v1, v5, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 107
    .line 108
    .line 109
    new-array v5, v2, [Lh8/f;

    .line 110
    .line 111
    aput-object v7, v5, v3

    .line 112
    .line 113
    aput-object v1, v5, v4

    .line 114
    .line 115
    invoke-static {v5}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 116
    .line 117
    .line 118
    move-result-object v1

    .line 119
    sput-object v1, LU8/b;->f:Ljava/lang/Object;

    .line 120
    .line 121
    new-instance v5, Lj9/c;

    .line 122
    .line 123
    const-string v6, "javax.annotation.ParametersAreNullableByDefault"

    .line 124
    .line 125
    invoke-direct {v5, v6}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 126
    .line 127
    .line 128
    new-instance v6, LU8/n;

    .line 129
    .line 130
    new-instance v7, Lb9/i;

    .line 131
    .line 132
    sget-object v9, Lb9/h;->t:Lb9/h;

    .line 133
    .line 134
    invoke-direct {v7, v9}, Lb9/i;-><init>(Lb9/h;)V

    .line 135
    .line 136
    .line 137
    invoke-static {v0}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 138
    .line 139
    .line 140
    move-result-object v9

    .line 141
    check-cast v9, Ljava/util/Collection;

    .line 142
    .line 143
    invoke-direct {v6, v7, v9}, LU8/n;-><init>(Lb9/i;Ljava/util/Collection;)V

    .line 144
    .line 145
    .line 146
    new-instance v7, Lh8/f;

    .line 147
    .line 148
    invoke-direct {v7, v5, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 149
    .line 150
    .line 151
    new-instance v5, Lj9/c;

    .line 152
    .line 153
    const-string v6, "javax.annotation.ParametersAreNonnullByDefault"

    .line 154
    .line 155
    invoke-direct {v5, v6}, Lj9/c;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    new-instance v6, LU8/n;

    .line 159
    .line 160
    new-instance v9, Lb9/i;

    .line 161
    .line 162
    invoke-direct {v9, v8}, Lb9/i;-><init>(Lb9/h;)V

    .line 163
    .line 164
    .line 165
    invoke-static {v0}, Lcom/bumptech/glide/d;->u(Ljava/lang/Object;)Ljava/util/List;

    .line 166
    .line 167
    .line 168
    move-result-object v0

    .line 169
    check-cast v0, Ljava/util/Collection;

    .line 170
    .line 171
    invoke-direct {v6, v9, v0}, LU8/n;-><init>(Lb9/i;Ljava/util/Collection;)V

    .line 172
    .line 173
    .line 174
    new-instance v0, Lh8/f;

    .line 175
    .line 176
    invoke-direct {v0, v5, v6}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 177
    .line 178
    .line 179
    new-array v5, v2, [Lh8/f;

    .line 180
    .line 181
    aput-object v7, v5, v3

    .line 182
    .line 183
    aput-object v0, v5, v4

    .line 184
    .line 185
    invoke-static {v5}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 186
    .line 187
    .line 188
    move-result-object v0

    .line 189
    new-instance v5, Ljava/util/LinkedHashMap;

    .line 190
    .line 191
    invoke-direct {v5, v0}, Ljava/util/LinkedHashMap;-><init>(Ljava/util/Map;)V

    .line 192
    .line 193
    .line 194
    invoke-virtual {v5, v1}, Ljava/util/AbstractMap;->putAll(Ljava/util/Map;)V

    .line 195
    .line 196
    .line 197
    sput-object v5, LU8/b;->g:Ljava/util/LinkedHashMap;

    .line 198
    .line 199
    new-array v0, v2, [Lj9/c;

    .line 200
    .line 201
    sget-object v1, LU8/y;->h:Lj9/c;

    .line 202
    .line 203
    aput-object v1, v0, v3

    .line 204
    .line 205
    sget-object v1, LU8/y;->i:Lj9/c;

    .line 206
    .line 207
    aput-object v1, v0, v4

    .line 208
    .line 209
    invoke-static {v0}, Li8/i;->K([Ljava/lang/Object;)Ljava/util/Set;

    .line 210
    .line 211
    .line 212
    move-result-object v0

    .line 213
    sput-object v0, LU8/b;->h:Ljava/util/Set;

    .line 214
    .line 215
    return-void
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
