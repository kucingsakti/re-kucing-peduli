.class public abstract LV8/e;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/lang/Object;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 16

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x2

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    const-class v4, LM8/n;

    .line 6
    .line 7
    invoke-static {v4}, Ljava/util/EnumSet;->noneOf(Ljava/lang/Class;)Ljava/util/EnumSet;

    .line 8
    .line 9
    .line 10
    move-result-object v4

    .line 11
    new-instance v5, Lh8/f;

    .line 12
    .line 13
    const-string v6, "PACKAGE"

    .line 14
    .line 15
    invoke-direct {v5, v6, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    sget-object v4, LM8/n;->G:LM8/n;

    .line 19
    .line 20
    sget-object v6, LM8/n;->S:LM8/n;

    .line 21
    .line 22
    invoke-static {v4, v6}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 23
    .line 24
    .line 25
    move-result-object v4

    .line 26
    new-instance v6, Lh8/f;

    .line 27
    .line 28
    const-string v7, "TYPE"

    .line 29
    .line 30
    invoke-direct {v6, v7, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    sget-object v4, LM8/n;->H:LM8/n;

    .line 34
    .line 35
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    new-instance v7, Lh8/f;

    .line 40
    .line 41
    const-string v8, "ANNOTATION_TYPE"

    .line 42
    .line 43
    invoke-direct {v7, v8, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 44
    .line 45
    .line 46
    sget-object v4, LM8/n;->I:LM8/n;

    .line 47
    .line 48
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 49
    .line 50
    .line 51
    move-result-object v4

    .line 52
    new-instance v8, Lh8/f;

    .line 53
    .line 54
    const-string v9, "TYPE_PARAMETER"

    .line 55
    .line 56
    invoke-direct {v8, v9, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    sget-object v4, LM8/n;->K:LM8/n;

    .line 60
    .line 61
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 62
    .line 63
    .line 64
    move-result-object v4

    .line 65
    new-instance v9, Lh8/f;

    .line 66
    .line 67
    const-string v10, "FIELD"

    .line 68
    .line 69
    invoke-direct {v9, v10, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 70
    .line 71
    .line 72
    sget-object v4, LM8/n;->L:LM8/n;

    .line 73
    .line 74
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 75
    .line 76
    .line 77
    move-result-object v4

    .line 78
    new-instance v10, Lh8/f;

    .line 79
    .line 80
    const-string v11, "LOCAL_VARIABLE"

    .line 81
    .line 82
    invoke-direct {v10, v11, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 83
    .line 84
    .line 85
    sget-object v4, LM8/n;->M:LM8/n;

    .line 86
    .line 87
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    new-instance v11, Lh8/f;

    .line 92
    .line 93
    const-string v12, "PARAMETER"

    .line 94
    .line 95
    invoke-direct {v11, v12, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    sget-object v4, LM8/n;->N:LM8/n;

    .line 99
    .line 100
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 101
    .line 102
    .line 103
    move-result-object v4

    .line 104
    new-instance v12, Lh8/f;

    .line 105
    .line 106
    const-string v13, "CONSTRUCTOR"

    .line 107
    .line 108
    invoke-direct {v12, v13, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 109
    .line 110
    .line 111
    sget-object v4, LM8/n;->O:LM8/n;

    .line 112
    .line 113
    sget-object v13, LM8/n;->P:LM8/n;

    .line 114
    .line 115
    sget-object v14, LM8/n;->Q:LM8/n;

    .line 116
    .line 117
    invoke-static {v4, v13, v14}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;Ljava/lang/Enum;Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 118
    .line 119
    .line 120
    move-result-object v4

    .line 121
    new-instance v13, Lh8/f;

    .line 122
    .line 123
    const-string v14, "METHOD"

    .line 124
    .line 125
    invoke-direct {v13, v14, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 126
    .line 127
    .line 128
    sget-object v4, LM8/n;->R:LM8/n;

    .line 129
    .line 130
    invoke-static {v4}, Ljava/util/EnumSet;->of(Ljava/lang/Enum;)Ljava/util/EnumSet;

    .line 131
    .line 132
    .line 133
    move-result-object v4

    .line 134
    new-instance v14, Lh8/f;

    .line 135
    .line 136
    const-string v15, "TYPE_USE"

    .line 137
    .line 138
    invoke-direct {v14, v15, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 139
    .line 140
    .line 141
    const/16 v4, 0xa

    .line 142
    .line 143
    new-array v4, v4, [Lh8/f;

    .line 144
    .line 145
    aput-object v5, v4, v3

    .line 146
    .line 147
    aput-object v6, v4, v2

    .line 148
    .line 149
    aput-object v7, v4, v1

    .line 150
    .line 151
    aput-object v8, v4, v0

    .line 152
    .line 153
    const/4 v5, 0x4

    .line 154
    aput-object v9, v4, v5

    .line 155
    .line 156
    const/4 v5, 0x5

    .line 157
    aput-object v10, v4, v5

    .line 158
    .line 159
    const/4 v5, 0x6

    .line 160
    aput-object v11, v4, v5

    .line 161
    .line 162
    const/4 v5, 0x7

    .line 163
    aput-object v12, v4, v5

    .line 164
    .line 165
    const/16 v5, 0x8

    .line 166
    .line 167
    aput-object v13, v4, v5

    .line 168
    .line 169
    const/16 v5, 0x9

    .line 170
    .line 171
    aput-object v14, v4, v5

    .line 172
    .line 173
    invoke-static {v4}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 174
    .line 175
    .line 176
    move-result-object v4

    .line 177
    sput-object v4, LV8/e;->a:Ljava/lang/Object;

    .line 178
    .line 179
    sget-object v4, LM8/m;->s:LM8/m;

    .line 180
    .line 181
    new-instance v5, Lh8/f;

    .line 182
    .line 183
    const-string v6, "RUNTIME"

    .line 184
    .line 185
    invoke-direct {v5, v6, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 186
    .line 187
    .line 188
    sget-object v4, LM8/m;->t:LM8/m;

    .line 189
    .line 190
    new-instance v6, Lh8/f;

    .line 191
    .line 192
    const-string v7, "CLASS"

    .line 193
    .line 194
    invoke-direct {v6, v7, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 195
    .line 196
    .line 197
    sget-object v4, LM8/m;->u:LM8/m;

    .line 198
    .line 199
    new-instance v7, Lh8/f;

    .line 200
    .line 201
    const-string v8, "SOURCE"

    .line 202
    .line 203
    invoke-direct {v7, v8, v4}, Lh8/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 204
    .line 205
    .line 206
    new-array v0, v0, [Lh8/f;

    .line 207
    .line 208
    aput-object v5, v0, v3

    .line 209
    .line 210
    aput-object v6, v0, v2

    .line 211
    .line 212
    aput-object v7, v0, v1

    .line 213
    .line 214
    invoke-static {v0}, Li8/y;->w([Lh8/f;)Ljava/util/Map;

    .line 215
    .line 216
    .line 217
    move-result-object v0

    .line 218
    sput-object v0, LV8/e;->b:Ljava/lang/Object;

    .line 219
    .line 220
    return-void
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

.method public static a(Ljava/util/List;)Lo9/b;
    .locals 4

    .line 1
    check-cast p0, Ljava/lang/Iterable;

    .line 2
    .line 3
    new-instance v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    .line 14
    .line 15
    move-result v1

    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    .line 20
    .line 21
    move-result-object v1

    .line 22
    instance-of v2, v1, LR8/s;

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    goto :goto_0

    .line 30
    :cond_1
    new-instance p0, Ljava/util/ArrayList;

    .line 31
    .line 32
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 40
    .line 41
    .line 42
    move-result v1

    .line 43
    if-eqz v1, :cond_3

    .line 44
    .line 45
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    check-cast v1, LR8/s;

    .line 50
    .line 51
    iget-object v1, v1, LR8/s;->b:Ljava/lang/Enum;

    .line 52
    .line 53
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    move-result-object v1

    .line 57
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 58
    .line 59
    .line 60
    move-result-object v1

    .line 61
    invoke-virtual {v1}, Lj9/f;->g()Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    move-result-object v1

    .line 65
    sget-object v2, LV8/e;->a:Ljava/lang/Object;

    .line 66
    .line 67
    invoke-interface {v2, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    check-cast v1, Ljava/util/EnumSet;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    .line 75
    goto :goto_2

    .line 76
    :cond_2
    sget-object v1, Li8/u;->s:Li8/u;

    .line 77
    .line 78
    :goto_2
    invoke-static {p0, v1}, Li8/q;->J(Ljava/util/Collection;Ljava/lang/Iterable;)V

    .line 79
    .line 80
    .line 81
    goto :goto_1

    .line 82
    :cond_3
    new-instance v0, Ljava/util/ArrayList;

    .line 83
    .line 84
    const/16 v1, 0xa

    .line 85
    .line 86
    invoke-static {p0, v1}, Li8/m;->H(Ljava/lang/Iterable;I)I

    .line 87
    .line 88
    .line 89
    move-result v1

    .line 90
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 94
    .line 95
    .line 96
    move-result-object p0

    .line 97
    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 98
    .line 99
    .line 100
    move-result v1

    .line 101
    if-eqz v1, :cond_4

    .line 102
    .line 103
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 104
    .line 105
    .line 106
    move-result-object v1

    .line 107
    check-cast v1, LM8/n;

    .line 108
    .line 109
    new-instance v2, Lo9/i;

    .line 110
    .line 111
    sget-object v3, LI8/n;->u:Lj9/c;

    .line 112
    .line 113
    invoke-static {v3}, Lj9/b;->j(Lj9/c;)Lj9/b;

    .line 114
    .line 115
    .line 116
    move-result-object v3

    .line 117
    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    move-result-object v1

    .line 121
    invoke-static {v1}, Lj9/f;->j(Ljava/lang/String;)Lj9/f;

    .line 122
    .line 123
    .line 124
    move-result-object v1

    .line 125
    invoke-direct {v2, v3, v1}, Lo9/i;-><init>(Lj9/b;Lj9/f;)V

    .line 126
    .line 127
    .line 128
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_4
    new-instance p0, Lo9/b;

    .line 133
    .line 134
    sget-object v1, LV8/d;->s:LV8/d;

    .line 135
    .line 136
    invoke-direct {p0, v0, v1}, Lo9/b;-><init>(Ljava/util/List;Lu8/b;)V

    .line 137
    .line 138
    .line 139
    return-object p0
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
.end method
