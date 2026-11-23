.class public final LT7/k;
.super LJ7/o;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LJ7/n;)V
    .locals 1

    const/4 v0, 0x4

    iput v0, p0, LT7/k;->a:I

    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LT7/k;->b:Ljava/lang/Object;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LT7/k;->a:I

    iput-object p1, p0, LT7/k;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final c(LJ7/p;)V
    .locals 4

    .line 1
    iget v0, p0, LT7/k;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LS7/b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LS7/b;-><init>(LJ7/p;)V

    .line 9
    .line 10
    .line 11
    invoke-interface {p1, v0}, LJ7/p;->b(LL7/b;)V

    .line 12
    .line 13
    .line 14
    sget-object p1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    .line 15
    .line 16
    iget-object v1, p0, LT7/k;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LJ7/n;

    .line 19
    .line 20
    const-wide/16 v2, 0x2

    .line 21
    .line 22
    invoke-virtual {v1, v0, v2, v3, p1}, LJ7/n;->c(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)LL7/b;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-static {v0, p1}, LO7/b;->i(Ljava/util/concurrent/atomic/AtomicReference;LL7/b;)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :pswitch_0
    sget-object v0, LO7/c;->s:LO7/c;

    .line 31
    .line 32
    invoke-interface {p1, v0}, LJ7/p;->b(LL7/b;)V

    .line 33
    .line 34
    .line 35
    iget-object v0, p0, LT7/k;->b:Ljava/lang/Object;

    .line 36
    .line 37
    invoke-interface {p1, v0}, LJ7/p;->c(Ljava/lang/Object;)V

    .line 38
    .line 39
    .line 40
    return-void

    .line 41
    :pswitch_1
    :try_start_0
    iget-object v0, p0, LT7/k;->b:Ljava/lang/Object;

    .line 42
    .line 43
    check-cast v0, LM2/J;

    .line 44
    .line 45
    iget-object v0, v0, LM2/J;->t:Ljava/lang/Object;

    .line 46
    .line 47
    check-cast v0, Ljava/lang/Throwable;

    .line 48
    .line 49
    const-string v1, "Callable returned null throwable. Null values are generally not allowed in 2.x operators and sources."

    .line 50
    .line 51
    invoke-static {v0, v1}, LP7/a;->a(Ljava/lang/Object;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    goto :goto_0

    .line 55
    :catchall_0
    move-exception v0

    .line 56
    invoke-static {v0}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    :goto_0
    sget-object v1, LO7/c;->s:LO7/c;

    .line 60
    .line 61
    invoke-interface {p1, v1}, LJ7/p;->b(LL7/b;)V

    .line 62
    .line 63
    .line 64
    invoke-interface {p1, v0}, LJ7/p;->onError(Ljava/lang/Throwable;)V

    .line 65
    .line 66
    .line 67
    return-void

    .line 68
    :pswitch_2
    new-instance v0, LW7/a;

    .line 69
    .line 70
    const/4 v1, 0x1

    .line 71
    invoke-direct {v0, p1, v1}, LW7/a;-><init>(Ljava/lang/Object;I)V

    .line 72
    .line 73
    .line 74
    iget-object p1, p0, LT7/k;->b:Ljava/lang/Object;

    .line 75
    .line 76
    check-cast p1, LJ7/j;

    .line 77
    .line 78
    invoke-virtual {p1, v0}, LJ7/j;->U(LJ7/k;)V

    .line 79
    .line 80
    .line 81
    return-void

    .line 82
    :pswitch_3
    new-instance v0, LT7/j;

    .line 83
    .line 84
    const/4 v1, 0x1

    .line 85
    invoke-direct {v0, p1, v1}, LT7/j;-><init>(Ljava/lang/Object;I)V

    .line 86
    .line 87
    .line 88
    iget-object p1, p0, LT7/k;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast p1, LJ7/c;

    .line 91
    .line 92
    invoke-virtual {p1, v0}, LJ7/c;->a(LJ7/f;)V

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    nop

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
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
.end method
