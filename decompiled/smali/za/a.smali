.class public final Lza/a;
.super LJ7/j;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, Lza/a;->b:I

    iput-object p1, p0, Lza/a;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final V(LJ7/k;)V
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    iget v2, p0, Lza/a;->b:I

    .line 4
    .line 5
    packed-switch v2, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    iget-object v2, p0, Lza/a;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v2, Lya/t;

    .line 11
    .line 12
    invoke-virtual {v2}, Lya/t;->g()Lya/c;

    .line 13
    .line 14
    .line 15
    move-result-object v2

    .line 16
    new-instance v3, Lza/b;

    .line 17
    .line 18
    invoke-direct {v3, v2}, Lza/b;-><init>(Lya/c;)V

    .line 19
    .line 20
    .line 21
    invoke-interface {p1, v3}, LJ7/k;->b(LL7/b;)V

    .line 22
    .line 23
    .line 24
    iget-boolean v4, v3, Lza/b;->t:Z

    .line 25
    .line 26
    if-eqz v4, :cond_0

    .line 27
    .line 28
    goto :goto_2

    .line 29
    :cond_0
    :try_start_0
    check-cast v2, Lya/t;

    .line 30
    .line 31
    invoke-virtual {v2}, Lya/t;->c()Lya/L;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    iget-boolean v4, v3, Lza/b;->t:Z

    .line 36
    .line 37
    if-nez v4, :cond_1

    .line 38
    .line 39
    invoke-interface {p1, v2}, LJ7/k;->d(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    goto :goto_0

    .line 43
    :catchall_0
    move-exception v2

    .line 44
    move v4, v1

    .line 45
    goto :goto_1

    .line 46
    :cond_1
    :goto_0
    iget-boolean v2, v3, Lza/b;->t:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 47
    .line 48
    if-nez v2, :cond_3

    .line 49
    .line 50
    :try_start_1
    invoke-interface {p1}, LJ7/k;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 51
    .line 52
    .line 53
    goto :goto_2

    .line 54
    :catchall_1
    move-exception v2

    .line 55
    move v4, v0

    .line 56
    :goto_1
    invoke-static {v2}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 57
    .line 58
    .line 59
    if-eqz v4, :cond_2

    .line 60
    .line 61
    invoke-static {v2}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 62
    .line 63
    .line 64
    goto :goto_2

    .line 65
    :cond_2
    iget-boolean v3, v3, Lza/b;->t:Z

    .line 66
    .line 67
    if-nez v3, :cond_3

    .line 68
    .line 69
    :try_start_2
    invoke-interface {p1, v2}, LJ7/k;->onError(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    .line 70
    .line 71
    .line 72
    goto :goto_2

    .line 73
    :catchall_2
    move-exception p1

    .line 74
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 75
    .line 76
    .line 77
    new-instance v3, Lio/reactivex/exceptions/CompositeException;

    .line 78
    .line 79
    const/4 v4, 0x2

    .line 80
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 81
    .line 82
    aput-object v2, v4, v1

    .line 83
    .line 84
    aput-object p1, v4, v0

    .line 85
    .line 86
    invoke-direct {v3, v4}, Lio/reactivex/exceptions/CompositeException;-><init>([Ljava/lang/Throwable;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, LJ7/j;->y(Ljava/lang/Throwable;)V

    .line 90
    .line 91
    .line 92
    :cond_3
    :goto_2
    return-void

    .line 93
    :pswitch_0
    new-instance v0, Lk7/e;

    .line 94
    .line 95
    invoke-direct {v0, p1}, Lk7/e;-><init>(Ljava/lang/Object;)V

    .line 96
    .line 97
    .line 98
    iget-object p1, p0, Lza/a;->c:Ljava/lang/Object;

    .line 99
    .line 100
    check-cast p1, Lza/a;

    .line 101
    .line 102
    invoke-virtual {p1, v0}, LJ7/j;->U(LJ7/k;)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :pswitch_1
    new-instance v0, LA1/J;

    .line 107
    .line 108
    const/16 v1, 0xa

    .line 109
    .line 110
    invoke-direct {v0, p1, v1}, LA1/J;-><init>(Ljava/lang/Object;I)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lza/a;->c:Ljava/lang/Object;

    .line 114
    .line 115
    check-cast p1, Lza/a;

    .line 116
    .line 117
    invoke-virtual {p1, v0}, LJ7/j;->U(LJ7/k;)V

    .line 118
    .line 119
    .line 120
    return-void

    .line 121
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
