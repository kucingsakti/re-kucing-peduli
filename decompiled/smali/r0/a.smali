.class public final enum Lr0/a;
.super Ljava/lang/Enum;
.source "SourceFile"


# static fields
.field public static final enum s:Lr0/a;

.field public static final enum t:Lr0/a;

.field public static final enum u:Lr0/a;

.field public static final enum v:Lr0/a;

.field public static final enum w:Lr0/a;

.field public static final enum x:Lr0/a;

.field public static final enum y:Lr0/a;

.field public static final synthetic z:[Lr0/a;


# direct methods
.method static constructor <clinit>()V
    .locals 19

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    const/4 v1, 0x7

    .line 4
    const/4 v2, 0x6

    .line 5
    const/4 v3, 0x5

    .line 6
    const/4 v4, 0x4

    .line 7
    const/4 v5, 0x3

    .line 8
    const/4 v6, 0x2

    .line 9
    const/4 v7, 0x1

    .line 10
    const/4 v8, 0x0

    .line 11
    new-instance v9, Lr0/a;

    .line 12
    .line 13
    const-string v10, "PENALTY_LOG"

    .line 14
    .line 15
    invoke-direct {v9, v10, v8}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 16
    .line 17
    .line 18
    new-instance v10, Lr0/a;

    .line 19
    .line 20
    const-string v11, "PENALTY_DEATH"

    .line 21
    .line 22
    invoke-direct {v10, v11, v7}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 23
    .line 24
    .line 25
    new-instance v11, Lr0/a;

    .line 26
    .line 27
    const-string v12, "DETECT_FRAGMENT_REUSE"

    .line 28
    .line 29
    invoke-direct {v11, v12, v6}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 30
    .line 31
    .line 32
    sput-object v11, Lr0/a;->s:Lr0/a;

    .line 33
    .line 34
    new-instance v12, Lr0/a;

    .line 35
    .line 36
    const-string v13, "DETECT_FRAGMENT_TAG_USAGE"

    .line 37
    .line 38
    invoke-direct {v12, v13, v5}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 39
    .line 40
    .line 41
    sput-object v12, Lr0/a;->t:Lr0/a;

    .line 42
    .line 43
    new-instance v13, Lr0/a;

    .line 44
    .line 45
    const-string v14, "DETECT_WRONG_NESTED_HIERARCHY"

    .line 46
    .line 47
    invoke-direct {v13, v14, v4}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    .line 50
    sput-object v13, Lr0/a;->u:Lr0/a;

    .line 51
    .line 52
    new-instance v14, Lr0/a;

    .line 53
    .line 54
    const-string v15, "DETECT_RETAIN_INSTANCE_USAGE"

    .line 55
    .line 56
    invoke-direct {v14, v15, v3}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 57
    .line 58
    .line 59
    sput-object v14, Lr0/a;->v:Lr0/a;

    .line 60
    .line 61
    new-instance v15, Lr0/a;

    .line 62
    .line 63
    move/from16 v16, v3

    .line 64
    .line 65
    const-string v3, "DETECT_SET_USER_VISIBLE_HINT"

    .line 66
    .line 67
    invoke-direct {v15, v3, v2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    sput-object v15, Lr0/a;->w:Lr0/a;

    .line 71
    .line 72
    new-instance v3, Lr0/a;

    .line 73
    .line 74
    move/from16 v17, v2

    .line 75
    .line 76
    const-string v2, "DETECT_TARGET_FRAGMENT_USAGE"

    .line 77
    .line 78
    invoke-direct {v3, v2, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 79
    .line 80
    .line 81
    sput-object v3, Lr0/a;->x:Lr0/a;

    .line 82
    .line 83
    new-instance v2, Lr0/a;

    .line 84
    .line 85
    move/from16 v18, v1

    .line 86
    .line 87
    const-string v1, "DETECT_WRONG_FRAGMENT_CONTAINER"

    .line 88
    .line 89
    invoke-direct {v2, v1, v0}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 90
    .line 91
    .line 92
    sput-object v2, Lr0/a;->y:Lr0/a;

    .line 93
    .line 94
    const/16 v1, 0x9

    .line 95
    .line 96
    new-array v1, v1, [Lr0/a;

    .line 97
    .line 98
    aput-object v9, v1, v8

    .line 99
    .line 100
    aput-object v10, v1, v7

    .line 101
    .line 102
    aput-object v11, v1, v6

    .line 103
    .line 104
    aput-object v12, v1, v5

    .line 105
    .line 106
    aput-object v13, v1, v4

    .line 107
    .line 108
    aput-object v14, v1, v16

    .line 109
    .line 110
    aput-object v15, v1, v17

    .line 111
    .line 112
    aput-object v3, v1, v18

    .line 113
    .line 114
    aput-object v2, v1, v0

    .line 115
    .line 116
    sput-object v1, Lr0/a;->z:[Lr0/a;

    .line 117
    .line 118
    return-void
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

.method public static valueOf(Ljava/lang/String;)Lr0/a;
    .locals 1

    .line 1
    const-class v0, Lr0/a;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lr0/a;

    .line 8
    .line 9
    return-object p0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
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

.method public static values()[Lr0/a;
    .locals 1

    .line 1
    sget-object v0, Lr0/a;->z:[Lr0/a;

    .line 2
    .line 3
    invoke-virtual {v0}, [Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lr0/a;

    .line 8
    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method
