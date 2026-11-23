.class public final LX9/D;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public A:LP0/d;

.field public a:Lo1/m;

.field public b:LP0/d;

.field public final c:Ljava/util/ArrayList;

.field public final d:Ljava/util/ArrayList;

.field public e:LY9/a;

.field public f:Z

.field public g:LX9/b;

.field public h:Z

.field public i:Z

.field public j:LX9/r;

.field public k:LX9/g;

.field public l:LX9/b;

.field public m:Ljava/net/ProxySelector;

.field public n:LX9/b;

.field public o:Ljavax/net/SocketFactory;

.field public p:Ljavax/net/ssl/SSLSocketFactory;

.field public q:Ljavax/net/ssl/X509TrustManager;

.field public r:Ljava/util/List;

.field public s:Ljava/util/List;

.field public t:Lka/c;

.field public u:LX9/l;

.field public v:LC3/b;

.field public w:I

.field public x:I

.field public y:I

.field public z:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lo1/m;

    .line 5
    .line 6
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    new-instance v1, Ljava/util/ArrayDeque;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object v1, v0, Lo1/m;->t:Ljava/lang/Object;

    .line 15
    .line 16
    new-instance v1, Ljava/util/ArrayDeque;

    .line 17
    .line 18
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 19
    .line 20
    .line 21
    iput-object v1, v0, Lo1/m;->u:Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v1, Ljava/util/ArrayDeque;

    .line 24
    .line 25
    invoke-direct {v1}, Ljava/util/ArrayDeque;-><init>()V

    .line 26
    .line 27
    .line 28
    iput-object v1, v0, Lo1/m;->v:Ljava/lang/Object;

    .line 29
    .line 30
    iput-object v0, p0, LX9/D;->a:Lo1/m;

    .line 31
    .line 32
    new-instance v0, LP0/d;

    .line 33
    .line 34
    const/16 v1, 0xb

    .line 35
    .line 36
    invoke-direct {v0, v1}, LP0/d;-><init>(I)V

    .line 37
    .line 38
    .line 39
    iput-object v0, p0, LX9/D;->b:LP0/d;

    .line 40
    .line 41
    new-instance v0, Ljava/util/ArrayList;

    .line 42
    .line 43
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 44
    .line 45
    .line 46
    iput-object v0, p0, LX9/D;->c:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v0, Ljava/util/ArrayList;

    .line 49
    .line 50
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    .line 53
    iput-object v0, p0, LX9/D;->d:Ljava/util/ArrayList;

    .line 54
    .line 55
    new-instance v0, LY9/a;

    .line 56
    .line 57
    const/4 v1, 0x0

    .line 58
    invoke-direct {v0, v1}, LY9/a;-><init>(I)V

    .line 59
    .line 60
    .line 61
    iput-object v0, p0, LX9/D;->e:LY9/a;

    .line 62
    .line 63
    const/4 v0, 0x1

    .line 64
    iput-boolean v0, p0, LX9/D;->f:Z

    .line 65
    .line 66
    sget-object v1, LX9/b;->s:LX9/b;

    .line 67
    .line 68
    iput-object v1, p0, LX9/D;->g:LX9/b;

    .line 69
    .line 70
    iput-boolean v0, p0, LX9/D;->h:Z

    .line 71
    .line 72
    iput-boolean v0, p0, LX9/D;->i:Z

    .line 73
    .line 74
    sget-object v0, LX9/r;->h:LX9/b;

    .line 75
    .line 76
    iput-object v0, p0, LX9/D;->j:LX9/r;

    .line 77
    .line 78
    sget-object v0, LX9/b;->t:LX9/b;

    .line 79
    .line 80
    iput-object v0, p0, LX9/D;->l:LX9/b;

    .line 81
    .line 82
    iput-object v1, p0, LX9/D;->n:LX9/b;

    .line 83
    .line 84
    invoke-static {}, Ljavax/net/SocketFactory;->getDefault()Ljavax/net/SocketFactory;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    const-string v1, "getDefault()"

    .line 89
    .line 90
    invoke-static {v0, v1}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    iput-object v0, p0, LX9/D;->o:Ljavax/net/SocketFactory;

    .line 94
    .line 95
    sget-object v0, LX9/E;->U:Ljava/util/List;

    .line 96
    .line 97
    iput-object v0, p0, LX9/D;->r:Ljava/util/List;

    .line 98
    .line 99
    sget-object v0, LX9/E;->T:Ljava/util/List;

    .line 100
    .line 101
    iput-object v0, p0, LX9/D;->s:Ljava/util/List;

    .line 102
    .line 103
    sget-object v0, Lka/c;->a:Lka/c;

    .line 104
    .line 105
    iput-object v0, p0, LX9/D;->t:Lka/c;

    .line 106
    .line 107
    sget-object v0, LX9/l;->c:LX9/l;

    .line 108
    .line 109
    iput-object v0, p0, LX9/D;->u:LX9/l;

    .line 110
    .line 111
    const/16 v0, 0x2710

    .line 112
    .line 113
    iput v0, p0, LX9/D;->w:I

    .line 114
    .line 115
    iput v0, p0, LX9/D;->x:I

    .line 116
    .line 117
    iput v0, p0, LX9/D;->y:I

    .line 118
    .line 119
    const-wide/16 v0, 0x400

    .line 120
    .line 121
    iput-wide v0, p0, LX9/D;->z:J

    .line 122
    .line 123
    return-void
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
