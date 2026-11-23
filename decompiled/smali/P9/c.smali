.class public abstract LP9/c;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LP9/i;

.field public static final b:I

.field public static final c:I

.field public static final d:LO3/y;

.field public static final e:LO3/y;

.field public static final f:LO3/y;

.field public static final g:LO3/y;

.field public static final h:LO3/y;

.field public static final i:LO3/y;

.field public static final j:LO3/y;

.field public static final k:LO3/y;

.field public static final l:LO3/y;

.field public static final m:LO3/y;

.field public static final n:LO3/y;

.field public static final o:LO3/y;

.field public static final p:LO3/y;

.field public static final q:LO3/y;

.field public static final r:LO3/y;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, LP9/i;

    .line 2
    .line 3
    const-wide/16 v1, -0x1

    .line 4
    .line 5
    const/4 v3, 0x0

    .line 6
    const/4 v4, 0x0

    .line 7
    const/4 v5, 0x0

    .line 8
    invoke-direct/range {v0 .. v5}, LP9/i;-><init>(JLP9/i;LP9/a;I)V

    .line 9
    .line 10
    .line 11
    sput-object v0, LP9/c;->a:LP9/i;

    .line 12
    .line 13
    const-string v0, "kotlinx.coroutines.bufferedChannel.segmentSize"

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    const/16 v2, 0xc

    .line 18
    .line 19
    invoke-static {v1, v0, v2}, LS9/a;->j(ILjava/lang/String;I)I

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    sput v0, LP9/c;->b:I

    .line 24
    .line 25
    const-string v0, "kotlinx.coroutines.bufferedChannel.expandBufferCompletionWaitIterations"

    .line 26
    .line 27
    const/16 v1, 0x2710

    .line 28
    .line 29
    invoke-static {v1, v0, v2}, LS9/a;->j(ILjava/lang/String;I)I

    .line 30
    .line 31
    .line 32
    move-result v0

    .line 33
    sput v0, LP9/c;->c:I

    .line 34
    .line 35
    new-instance v0, LO3/y;

    .line 36
    .line 37
    const-string v1, "BUFFERED"

    .line 38
    .line 39
    const/4 v2, 0x1

    .line 40
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 41
    .line 42
    .line 43
    sput-object v0, LP9/c;->d:LO3/y;

    .line 44
    .line 45
    new-instance v0, LO3/y;

    .line 46
    .line 47
    const-string v1, "SHOULD_BUFFER"

    .line 48
    .line 49
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 50
    .line 51
    .line 52
    sput-object v0, LP9/c;->e:LO3/y;

    .line 53
    .line 54
    new-instance v0, LO3/y;

    .line 55
    .line 56
    const-string v1, "S_RESUMING_BY_RCV"

    .line 57
    .line 58
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 59
    .line 60
    .line 61
    sput-object v0, LP9/c;->f:LO3/y;

    .line 62
    .line 63
    new-instance v0, LO3/y;

    .line 64
    .line 65
    const-string v1, "RESUMING_BY_EB"

    .line 66
    .line 67
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 68
    .line 69
    .line 70
    sput-object v0, LP9/c;->g:LO3/y;

    .line 71
    .line 72
    new-instance v0, LO3/y;

    .line 73
    .line 74
    const-string v1, "POISONED"

    .line 75
    .line 76
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 77
    .line 78
    .line 79
    sput-object v0, LP9/c;->h:LO3/y;

    .line 80
    .line 81
    new-instance v0, LO3/y;

    .line 82
    .line 83
    const-string v1, "DONE_RCV"

    .line 84
    .line 85
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 86
    .line 87
    .line 88
    sput-object v0, LP9/c;->i:LO3/y;

    .line 89
    .line 90
    new-instance v0, LO3/y;

    .line 91
    .line 92
    const-string v1, "INTERRUPTED_SEND"

    .line 93
    .line 94
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 95
    .line 96
    .line 97
    sput-object v0, LP9/c;->j:LO3/y;

    .line 98
    .line 99
    new-instance v0, LO3/y;

    .line 100
    .line 101
    const-string v1, "INTERRUPTED_RCV"

    .line 102
    .line 103
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 104
    .line 105
    .line 106
    sput-object v0, LP9/c;->k:LO3/y;

    .line 107
    .line 108
    new-instance v0, LO3/y;

    .line 109
    .line 110
    const-string v1, "CHANNEL_CLOSED"

    .line 111
    .line 112
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 113
    .line 114
    .line 115
    sput-object v0, LP9/c;->l:LO3/y;

    .line 116
    .line 117
    new-instance v0, LO3/y;

    .line 118
    .line 119
    const-string v1, "SUSPEND"

    .line 120
    .line 121
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 122
    .line 123
    .line 124
    sput-object v0, LP9/c;->m:LO3/y;

    .line 125
    .line 126
    new-instance v0, LO3/y;

    .line 127
    .line 128
    const-string v1, "SUSPEND_NO_WAITER"

    .line 129
    .line 130
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 131
    .line 132
    .line 133
    sput-object v0, LP9/c;->n:LO3/y;

    .line 134
    .line 135
    new-instance v0, LO3/y;

    .line 136
    .line 137
    const-string v1, "FAILED"

    .line 138
    .line 139
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 140
    .line 141
    .line 142
    sput-object v0, LP9/c;->o:LO3/y;

    .line 143
    .line 144
    new-instance v0, LO3/y;

    .line 145
    .line 146
    const-string v1, "CLOSE_HANDLER_CLOSED"

    .line 147
    .line 148
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 149
    .line 150
    .line 151
    sput-object v0, LP9/c;->p:LO3/y;

    .line 152
    .line 153
    new-instance v0, LO3/y;

    .line 154
    .line 155
    const-string v1, "CLOSE_HANDLER_INVOKED"

    .line 156
    .line 157
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 158
    .line 159
    .line 160
    sput-object v0, LP9/c;->q:LO3/y;

    .line 161
    .line 162
    new-instance v0, LO3/y;

    .line 163
    .line 164
    const-string v1, "NO_CLOSE_CAUSE"

    .line 165
    .line 166
    invoke-direct {v0, v1, v2}, LO3/y;-><init>(Ljava/lang/String;I)V

    .line 167
    .line 168
    .line 169
    sput-object v0, LP9/c;->r:LO3/y;

    .line 170
    .line 171
    return-void
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
