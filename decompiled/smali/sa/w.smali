.class public final enum Lsa/w;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "AfterHead"

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    invoke-direct {p0, v0, v1}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 5
    .line 6
    .line 7
    return-void
    .line 8
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
    .locals 8

    .line 1
    invoke-static {p1}, Lsa/B;->f(LK0/n;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    check-cast p1, Lsa/G;

    .line 9
    .line 10
    invoke-virtual {p2, p1}, Lsa/b;->s(Lsa/G;)V

    .line 11
    .line 12
    .line 13
    goto/16 :goto_0

    .line 14
    .line 15
    :cond_0
    invoke-virtual {p1}, LK0/n;->h()Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    check-cast p1, Lsa/H;

    .line 22
    .line 23
    invoke-virtual {p2, p1}, Lsa/b;->t(Lsa/H;)V

    .line 24
    .line 25
    .line 26
    goto/16 :goto_0

    .line 27
    .line 28
    :cond_1
    invoke-virtual {p1}, LK0/n;->i()Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 35
    .line 36
    .line 37
    goto/16 :goto_0

    .line 38
    .line 39
    :cond_2
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    sget-object v2, Lsa/B;->v:Lsa/u;

    .line 44
    .line 45
    const-string v3, "body"

    .line 46
    .line 47
    const/4 v4, 0x0

    .line 48
    if-eqz v0, :cond_8

    .line 49
    .line 50
    move-object v0, p1

    .line 51
    check-cast v0, Lsa/L;

    .line 52
    .line 53
    iget-object v5, v0, Lsa/M;->c:Ljava/lang/String;

    .line 54
    .line 55
    const-string v6, "html"

    .line 56
    .line 57
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result v6

    .line 61
    sget-object v7, Lsa/B;->y:Lsa/x;

    .line 62
    .line 63
    if-eqz v6, :cond_3

    .line 64
    .line 65
    iput-object p1, p2, Lsa/b;->g:LK0/n;

    .line 66
    .line 67
    invoke-virtual {v7, p1, p2}, Lsa/x;->h(LK0/n;Lsa/b;)Z

    .line 68
    .line 69
    .line 70
    move-result p1

    .line 71
    return p1

    .line 72
    :cond_3
    invoke-virtual {v5, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v6

    .line 76
    if-eqz v6, :cond_4

    .line 77
    .line 78
    invoke-virtual {p2, v0}, Lsa/b;->r(Lsa/L;)Lorg/jsoup/nodes/k;

    .line 79
    .line 80
    .line 81
    iput-boolean v4, p2, Lsa/b;->u:Z

    .line 82
    .line 83
    iput-object v7, p2, Lsa/b;->l:Lsa/B;

    .line 84
    .line 85
    goto/16 :goto_0

    .line 86
    .line 87
    :cond_4
    const-string v6, "frameset"

    .line 88
    .line 89
    invoke-virtual {v5, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 90
    .line 91
    .line 92
    move-result v6

    .line 93
    if-eqz v6, :cond_5

    .line 94
    .line 95
    invoke-virtual {p2, v0}, Lsa/b;->r(Lsa/L;)Lorg/jsoup/nodes/k;

    .line 96
    .line 97
    .line 98
    sget-object p1, Lsa/B;->L:Lsa/n;

    .line 99
    .line 100
    iput-object p1, p2, Lsa/b;->l:Lsa/B;

    .line 101
    .line 102
    goto :goto_0

    .line 103
    :cond_5
    sget-object v0, Lsa/A;->g:[Ljava/lang/String;

    .line 104
    .line 105
    invoke-static {v5, v0}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 106
    .line 107
    .line 108
    move-result v0

    .line 109
    if-eqz v0, :cond_6

    .line 110
    .line 111
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 112
    .line 113
    .line 114
    iget-object v0, p2, Lsa/b;->o:Lorg/jsoup/nodes/k;

    .line 115
    .line 116
    iget-object v3, p2, Lsa/b;->e:Ljava/util/ArrayList;

    .line 117
    .line 118
    invoke-virtual {v3, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    .line 121
    invoke-virtual {p2, p1, v2}, Lsa/b;->E(LK0/n;Lsa/B;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {p2, v0}, Lsa/b;->K(Lorg/jsoup/nodes/k;)V

    .line 125
    .line 126
    .line 127
    goto :goto_0

    .line 128
    :cond_6
    const-string v0, "head"

    .line 129
    .line 130
    invoke-virtual {v5, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 131
    .line 132
    .line 133
    move-result v0

    .line 134
    if-eqz v0, :cond_7

    .line 135
    .line 136
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 137
    .line 138
    .line 139
    return v4

    .line 140
    :cond_7
    invoke-virtual {p2, v3}, Lsa/b;->G(Ljava/lang/String;)V

    .line 141
    .line 142
    .line 143
    iput-boolean v1, p2, Lsa/b;->u:Z

    .line 144
    .line 145
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 146
    .line 147
    .line 148
    goto :goto_0

    .line 149
    :cond_8
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-eqz v0, :cond_b

    .line 154
    .line 155
    move-object v0, p1

    .line 156
    check-cast v0, Lsa/K;

    .line 157
    .line 158
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 159
    .line 160
    sget-object v5, Lsa/A;->d:[Ljava/lang/String;

    .line 161
    .line 162
    invoke-static {v0, v5}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 163
    .line 164
    .line 165
    move-result v5

    .line 166
    if-eqz v5, :cond_9

    .line 167
    .line 168
    invoke-virtual {p2, v3}, Lsa/b;->G(Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    iput-boolean v1, p2, Lsa/b;->u:Z

    .line 172
    .line 173
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 174
    .line 175
    .line 176
    goto :goto_0

    .line 177
    :cond_9
    const-string v3, "template"

    .line 178
    .line 179
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 180
    .line 181
    .line 182
    move-result v0

    .line 183
    if-eqz v0, :cond_a

    .line 184
    .line 185
    invoke-virtual {p2, p1, v2}, Lsa/b;->E(LK0/n;Lsa/B;)Z

    .line 186
    .line 187
    .line 188
    goto :goto_0

    .line 189
    :cond_a
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 190
    .line 191
    .line 192
    return v4

    .line 193
    :cond_b
    invoke-virtual {p2, v3}, Lsa/b;->G(Ljava/lang/String;)V

    .line 194
    .line 195
    .line 196
    iput-boolean v1, p2, Lsa/b;->u:Z

    .line 197
    .line 198
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 199
    .line 200
    .line 201
    :goto_0
    return v1
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
.end method
