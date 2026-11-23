.class public abstract LI8/s;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/Set;

.field public static final b:Ljava/util/HashMap;

.field public static final c:Ljava/util/HashMap;

.field public static final d:Ljava/util/LinkedHashSet;


# direct methods
.method static constructor <clinit>()V
    .locals 9

    .line 1
    const/4 v0, 0x4

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    invoke-static {}, LI8/r;->values()[LI8/r;

    .line 5
    .line 6
    .line 7
    move-result-object v3

    .line 8
    new-instance v4, Ljava/util/ArrayList;

    .line 9
    .line 10
    array-length v5, v3

    .line 11
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 12
    .line 13
    .line 14
    array-length v5, v3

    .line 15
    move v6, v1

    .line 16
    :goto_0
    if-ge v6, v5, :cond_0

    .line 17
    .line 18
    aget-object v7, v3, v6

    .line 19
    .line 20
    iget-object v7, v7, LI8/r;->t:Lj9/f;

    .line 21
    .line 22
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 23
    .line 24
    .line 25
    add-int/2addr v6, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    invoke-static {v4}, Li8/k;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 28
    .line 29
    .line 30
    move-result-object v3

    .line 31
    sput-object v3, LI8/s;->a:Ljava/util/Set;

    .line 32
    .line 33
    invoke-static {}, LI8/q;->values()[LI8/q;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    new-instance v4, Ljava/util/ArrayList;

    .line 38
    .line 39
    array-length v5, v3

    .line 40
    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    .line 41
    .line 42
    .line 43
    array-length v5, v3

    .line 44
    move v6, v1

    .line 45
    :goto_1
    if-ge v6, v5, :cond_1

    .line 46
    .line 47
    aget-object v7, v3, v6

    .line 48
    .line 49
    iget-object v7, v7, LI8/q;->s:Lj9/f;

    .line 50
    .line 51
    invoke-virtual {v4, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    add-int/2addr v6, v2

    .line 55
    goto :goto_1

    .line 56
    :cond_1
    invoke-static {v4}, Li8/k;->w0(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 57
    .line 58
    .line 59
    new-instance v3, Ljava/util/HashMap;

    .line 60
    .line 61
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 62
    .line 63
    .line 64
    sput-object v3, LI8/s;->b:Ljava/util/HashMap;

    .line 65
    .line 66
    new-instance v3, Ljava/util/HashMap;

    .line 67
    .line 68
    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    .line 69
    .line 70
    .line 71
    sput-object v3, LI8/s;->c:Ljava/util/HashMap;

    .line 72
    .line 73
    sget-object v3, LI8/q;->t:LI8/q;

    .line 74
    .line 75
    const-string v4, "ubyteArrayOf"

    .line 76
    .line 77
    invoke-static {v4}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 78
    .line 79
    .line 80
    move-result-object v4

    .line 81
    new-instance v5, Lh8/f;

    .line 82
    .line 83
    invoke-direct {v5, v3, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    sget-object v3, LI8/q;->u:LI8/q;

    .line 87
    .line 88
    const-string v4, "ushortArrayOf"

    .line 89
    .line 90
    invoke-static {v4}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 91
    .line 92
    .line 93
    move-result-object v4

    .line 94
    new-instance v6, Lh8/f;

    .line 95
    .line 96
    invoke-direct {v6, v3, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 97
    .line 98
    .line 99
    sget-object v3, LI8/q;->v:LI8/q;

    .line 100
    .line 101
    const-string v4, "uintArrayOf"

    .line 102
    .line 103
    invoke-static {v4}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 104
    .line 105
    .line 106
    move-result-object v4

    .line 107
    new-instance v7, Lh8/f;

    .line 108
    .line 109
    invoke-direct {v7, v3, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    sget-object v3, LI8/q;->w:LI8/q;

    .line 113
    .line 114
    const-string v4, "ulongArrayOf"

    .line 115
    .line 116
    invoke-static {v4}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 117
    .line 118
    .line 119
    move-result-object v4

    .line 120
    new-instance v8, Lh8/f;

    .line 121
    .line 122
    invoke-direct {v8, v3, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 123
    .line 124
    .line 125
    new-array v3, v0, [Lh8/f;

    .line 126
    .line 127
    aput-object v5, v3, v1

    .line 128
    .line 129
    aput-object v6, v3, v2

    .line 130
    .line 131
    const/4 v4, 0x2

    .line 132
    aput-object v7, v3, v4

    .line 133
    .line 134
    const/4 v4, 0x3

    .line 135
    aput-object v8, v3, v4

    .line 136
    .line 137
    new-instance v4, Ljava/util/HashMap;

    .line 138
    .line 139
    invoke-static {v0}, Li8/z;->s(I)I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    invoke-direct {v4, v0}, Ljava/util/HashMap;-><init>(I)V

    .line 144
    .line 145
    .line 146
    invoke-static {v4, v3}, Li8/y;->x(Ljava/util/HashMap;[Lh8/f;)V

    .line 147
    .line 148
    .line 149
    invoke-static {}, LI8/r;->values()[LI8/r;

    .line 150
    .line 151
    .line 152
    move-result-object v0

    .line 153
    new-instance v3, Ljava/util/LinkedHashSet;

    .line 154
    .line 155
    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    .line 156
    .line 157
    .line 158
    array-length v4, v0

    .line 159
    move v5, v1

    .line 160
    :goto_2
    if-ge v5, v4, :cond_2

    .line 161
    .line 162
    aget-object v6, v0, v5

    .line 163
    .line 164
    iget-object v6, v6, LI8/r;->u:Lj9/b;

    .line 165
    .line 166
    invoke-virtual {v6}, Lj9/b;->i()Lj9/f;

    .line 167
    .line 168
    .line 169
    move-result-object v6

    .line 170
    invoke-interface {v3, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 171
    .line 172
    .line 173
    add-int/2addr v5, v2

    .line 174
    goto :goto_2

    .line 175
    :cond_2
    sput-object v3, LI8/s;->d:Ljava/util/LinkedHashSet;

    .line 176
    .line 177
    invoke-static {}, LI8/r;->values()[LI8/r;

    .line 178
    .line 179
    .line 180
    move-result-object v0

    .line 181
    array-length v3, v0

    .line 182
    :goto_3
    if-ge v1, v3, :cond_3

    .line 183
    .line 184
    aget-object v4, v0, v1

    .line 185
    .line 186
    sget-object v5, LI8/s;->b:Ljava/util/HashMap;

    .line 187
    .line 188
    iget-object v6, v4, LI8/r;->u:Lj9/b;

    .line 189
    .line 190
    iget-object v7, v4, LI8/r;->s:Lj9/b;

    .line 191
    .line 192
    invoke-virtual {v5, v6, v7}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 193
    .line 194
    .line 195
    sget-object v5, LI8/s;->c:Ljava/util/HashMap;

    .line 196
    .line 197
    iget-object v4, v4, LI8/r;->u:Lj9/b;

    .line 198
    .line 199
    invoke-virtual {v5, v7, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    add-int/2addr v1, v2

    .line 203
    goto :goto_3

    .line 204
    :cond_3
    return-void
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

.method public static final a(LA9/y;)Z
    .locals 2

    .line 1
    invoke-static {p0}, LA9/b0;->l(LA9/y;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {p0}, LA9/y;->D()LA9/O;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    invoke-interface {p0}, LA9/O;->w()LL8/g;

    .line 13
    .line 14
    .line 15
    move-result-object p0

    .line 16
    if-nez p0, :cond_1

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    invoke-interface {p0}, LL8/j;->v()LL8/j;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    instance-of v1, v0, LL8/D;

    .line 24
    .line 25
    if-eqz v1, :cond_2

    .line 26
    .line 27
    check-cast v0, LL8/D;

    .line 28
    .line 29
    check-cast v0, LO8/E;

    .line 30
    .line 31
    iget-object v0, v0, LO8/E;->w:Lj9/c;

    .line 32
    .line 33
    sget-object v1, LI8/o;->k:Lj9/c;

    .line 34
    .line 35
    invoke-static {v0, v1}, Lv8/i;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v0

    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    sget-object v0, LI8/s;->a:Ljava/util/Set;

    .line 42
    .line 43
    invoke-interface {p0}, LL8/j;->getName()Lj9/f;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    invoke-interface {v0, p0}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    .line 48
    .line 49
    .line 50
    move-result p0

    .line 51
    if-eqz p0, :cond_2

    .line 52
    .line 53
    const/4 p0, 0x1

    .line 54
    return p0

    .line 55
    :cond_2
    :goto_0
    const/4 p0, 0x0

    .line 56
    return p0
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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
