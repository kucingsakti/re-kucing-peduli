.class public final LT7/f;
.super LJ7/c;
.source "SourceFile"


# instance fields
.field public final synthetic b:I

.field public final c:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LT7/f;->b:I

    iput-object p1, p0, LT7/f;->c:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final b(LJ7/f;)V
    .locals 2

    .line 1
    iget v0, p0, LT7/f;->b:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    new-instance v0, LV7/b;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LV7/b;-><init>(LJ7/f;)V

    .line 9
    .line 10
    .line 11
    iget-object p1, p0, LT7/f;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast p1, LT7/n;

    .line 14
    .line 15
    invoke-virtual {p1, v0}, LJ7/c;->a(LJ7/f;)V

    .line 16
    .line 17
    .line 18
    return-void

    .line 19
    :pswitch_0
    new-instance v0, Lo1/c;

    .line 20
    .line 21
    invoke-direct {v0, p1}, Lo1/c;-><init>(LJ7/f;)V

    .line 22
    .line 23
    .line 24
    iget-object p1, p0, LT7/f;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, LJ7/j;

    .line 27
    .line 28
    invoke-virtual {p1, v0}, LJ7/j;->U(LJ7/k;)V

    .line 29
    .line 30
    .line 31
    return-void

    .line 32
    :pswitch_1
    const/4 v0, 0x5

    .line 33
    invoke-static {v0}, Lz/e;->d(I)I

    .line 34
    .line 35
    .line 36
    move-result v0

    .line 37
    if-eqz v0, :cond_3

    .line 38
    .line 39
    const/4 v1, 0x1

    .line 40
    if-eq v0, v1, :cond_2

    .line 41
    .line 42
    const/4 v1, 0x3

    .line 43
    if-eq v0, v1, :cond_1

    .line 44
    .line 45
    const/4 v1, 0x4

    .line 46
    if-eq v0, v1, :cond_0

    .line 47
    .line 48
    new-instance v0, LT7/c;

    .line 49
    .line 50
    sget v1, LJ7/c;->a:I

    .line 51
    .line 52
    invoke-direct {v0, p1, v1}, LT7/c;-><init>(LJ7/f;I)V

    .line 53
    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    new-instance v0, LT7/c;

    .line 57
    .line 58
    invoke-direct {v0, p1}, LT7/c;-><init>(LJ7/f;)V

    .line 59
    .line 60
    .line 61
    goto :goto_0

    .line 62
    :cond_1
    new-instance v0, LT7/d;

    .line 63
    .line 64
    const/4 v1, 0x0

    .line 65
    invoke-direct {v0, p1, v1}, LT7/d;-><init>(LJ7/f;I)V

    .line 66
    .line 67
    .line 68
    goto :goto_0

    .line 69
    :cond_2
    new-instance v0, LT7/d;

    .line 70
    .line 71
    const/4 v1, 0x1

    .line 72
    invoke-direct {v0, p1, v1}, LT7/d;-><init>(LJ7/f;I)V

    .line 73
    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_3
    new-instance v0, LT7/e;

    .line 77
    .line 78
    invoke-direct {v0, p1}, LT7/b;-><init>(LJ7/f;)V

    .line 79
    .line 80
    .line 81
    :goto_0
    invoke-interface {p1, v0}, LJ7/f;->c(Lua/a;)V

    .line 82
    .line 83
    .line 84
    :try_start_0
    iget-object p1, p0, LT7/f;->c:Ljava/lang/Object;

    .line 85
    .line 86
    check-cast p1, LJ7/e;

    .line 87
    .line 88
    invoke-interface {p1, v0}, LJ7/e;->c(LT7/b;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 89
    .line 90
    .line 91
    goto :goto_1

    .line 92
    :catchall_0
    move-exception p1

    .line 93
    invoke-static {p1}, Lga/l;->n(Ljava/lang/Throwable;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, p1}, LT7/b;->c(Ljava/lang/Throwable;)V

    .line 97
    .line 98
    .line 99
    :goto_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
