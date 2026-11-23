.class public final enum Lsa/n;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "InFrameset"

    .line 2
    .line 3
    const/16 v1, 0x13

    .line 4
    .line 5
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 6
    .line 7
    .line 8
    return-void
    .line 9
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


# virtual methods
.method public final h(LK0/n;Lsa/b;)Z
    .locals 7

    .line 1
    const-string v0, "html"

    .line 2
    .line 3
    const-string v1, "frameset"

    .line 4
    .line 5
    const/4 v2, 0x0

    .line 6
    invoke-static {p1}, Lsa/B;->f(LK0/n;)Z

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    const/4 v4, 0x1

    .line 11
    if-eqz v3, :cond_0

    .line 12
    .line 13
    check-cast p1, Lsa/G;

    .line 14
    .line 15
    invoke-virtual {p2, p1}, Lsa/b;->s(Lsa/G;)V

    .line 16
    .line 17
    .line 18
    return v4

    .line 19
    :cond_0
    invoke-virtual {p1}, LK0/n;->h()Z

    .line 20
    .line 21
    .line 22
    move-result v3

    .line 23
    if-eqz v3, :cond_1

    .line 24
    .line 25
    check-cast p1, Lsa/H;

    .line 26
    .line 27
    invoke-virtual {p2, p1}, Lsa/b;->t(Lsa/H;)V

    .line 28
    .line 29
    .line 30
    return v4

    .line 31
    :cond_1
    invoke-virtual {p1}, LK0/n;->i()Z

    .line 32
    .line 33
    .line 34
    move-result v3

    .line 35
    if-eqz v3, :cond_2

    .line 36
    .line 37
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 38
    .line 39
    .line 40
    return v2

    .line 41
    :cond_2
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 42
    .line 43
    .line 44
    move-result v3

    .line 45
    if-eqz v3, :cond_7

    .line 46
    .line 47
    check-cast p1, Lsa/L;

    .line 48
    .line 49
    iget-object v3, p1, Lsa/M;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 52
    .line 53
    .line 54
    const/4 v5, -0x1

    .line 55
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 56
    .line 57
    .line 58
    move-result v6

    .line 59
    sparse-switch v6, :sswitch_data_0

    .line 60
    .line 61
    .line 62
    goto :goto_0

    .line 63
    :sswitch_0
    const-string v0, "noframes"

    .line 64
    .line 65
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v0

    .line 69
    if-nez v0, :cond_3

    .line 70
    .line 71
    goto :goto_0

    .line 72
    :cond_3
    const/4 v5, 0x3

    .line 73
    goto :goto_0

    .line 74
    :sswitch_1
    const-string v0, "frame"

    .line 75
    .line 76
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    if-nez v0, :cond_4

    .line 81
    .line 82
    goto :goto_0

    .line 83
    :cond_4
    const/4 v5, 0x2

    .line 84
    goto :goto_0

    .line 85
    :sswitch_2
    invoke-virtual {v3, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 86
    .line 87
    .line 88
    move-result v0

    .line 89
    if-nez v0, :cond_5

    .line 90
    .line 91
    goto :goto_0

    .line 92
    :cond_5
    move v5, v4

    .line 93
    goto :goto_0

    .line 94
    :sswitch_3
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 95
    .line 96
    .line 97
    move-result v0

    .line 98
    if-nez v0, :cond_6

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_6
    move v5, v2

    .line 102
    :goto_0
    packed-switch v5, :pswitch_data_0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 106
    .line 107
    .line 108
    return v2

    .line 109
    :pswitch_0
    sget-object v0, Lsa/B;->v:Lsa/u;

    .line 110
    .line 111
    iput-object p1, p2, Lsa/b;->g:LK0/n;

    .line 112
    .line 113
    invoke-virtual {v0, p1, p2}, Lsa/u;->h(LK0/n;Lsa/b;)Z

    .line 114
    .line 115
    .line 116
    move-result p1

    .line 117
    return p1

    .line 118
    :pswitch_1
    invoke-virtual {p2, p1}, Lsa/b;->u(Lsa/L;)Lorg/jsoup/nodes/k;

    .line 119
    .line 120
    .line 121
    return v4

    .line 122
    :pswitch_2
    sget-object v0, Lsa/B;->y:Lsa/x;

    .line 123
    .line 124
    iput-object p1, p2, Lsa/b;->g:LK0/n;

    .line 125
    .line 126
    invoke-virtual {v0, p1, p2}, Lsa/x;->h(LK0/n;Lsa/b;)Z

    .line 127
    .line 128
    .line 129
    move-result p1

    .line 130
    return p1

    .line 131
    :pswitch_3
    invoke-virtual {p2, p1}, Lsa/b;->r(Lsa/L;)Lorg/jsoup/nodes/k;

    .line 132
    .line 133
    .line 134
    return v4

    .line 135
    :cond_7
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 136
    .line 137
    .line 138
    move-result v3

    .line 139
    if-eqz v3, :cond_9

    .line 140
    .line 141
    move-object v3, p1

    .line 142
    check-cast v3, Lsa/K;

    .line 143
    .line 144
    iget-object v3, v3, Lsa/M;->c:Ljava/lang/String;

    .line 145
    .line 146
    invoke-virtual {v3, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 147
    .line 148
    .line 149
    move-result v3

    .line 150
    if-eqz v3, :cond_9

    .line 151
    .line 152
    invoke-virtual {p2, v0}, Lsa/b;->g(Ljava/lang/String;)Z

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    if-eqz p1, :cond_8

    .line 157
    .line 158
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 159
    .line 160
    .line 161
    return v2

    .line 162
    :cond_8
    invoke-virtual {p2}, Lsa/b;->A()V

    .line 163
    .line 164
    .line 165
    invoke-virtual {p2, v1}, Lsa/b;->g(Ljava/lang/String;)Z

    .line 166
    .line 167
    .line 168
    move-result p1

    .line 169
    if-nez p1, :cond_a

    .line 170
    .line 171
    sget-object p1, Lsa/B;->M:Lsa/o;

    .line 172
    .line 173
    iput-object p1, p2, Lsa/b;->l:Lsa/B;

    .line 174
    .line 175
    return v4

    .line 176
    :cond_9
    invoke-virtual {p1}, LK0/n;->j()Z

    .line 177
    .line 178
    .line 179
    move-result p1

    .line 180
    if-eqz p1, :cond_b

    .line 181
    .line 182
    invoke-virtual {p2, v0}, Lsa/b;->g(Ljava/lang/String;)Z

    .line 183
    .line 184
    .line 185
    move-result p1

    .line 186
    if-nez p1, :cond_a

    .line 187
    .line 188
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 189
    .line 190
    .line 191
    :cond_a
    return v4

    .line 192
    :cond_b
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 193
    .line 194
    .line 195
    return v2

    .line 196
    nop

    .line 197
    :sswitch_data_0
    .sparse-switch
        -0x620c002b -> :sswitch_3
        0x3107ab -> :sswitch_2
        0x5d2a96d -> :sswitch_1
        0x47177da7 -> :sswitch_0
    .end sparse-switch

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
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method
