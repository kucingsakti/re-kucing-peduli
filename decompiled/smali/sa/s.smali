.class public final enum Lsa/s;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "BeforeHtml"

    .line 2
    .line 3
    const/4 v1, 0x1

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
    .locals 6

    .line 1
    invoke-virtual {p1}, LK0/n;->i()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {p1}, LK0/n;->h()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    check-cast p1, Lsa/H;

    .line 19
    .line 20
    invoke-virtual {p2, p1}, Lsa/b;->t(Lsa/H;)V

    .line 21
    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_1
    invoke-static {p1}, Lsa/B;->f(LK0/n;)Z

    .line 25
    .line 26
    .line 27
    move-result v0

    .line 28
    if-eqz v0, :cond_2

    .line 29
    .line 30
    check-cast p1, Lsa/G;

    .line 31
    .line 32
    invoke-virtual {p2, p1}, Lsa/b;->s(Lsa/G;)V

    .line 33
    .line 34
    .line 35
    goto :goto_0

    .line 36
    :cond_2
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 37
    .line 38
    .line 39
    move-result v0

    .line 40
    sget-object v2, Lsa/B;->u:Lsa/t;

    .line 41
    .line 42
    const-string v3, "html"

    .line 43
    .line 44
    if-eqz v0, :cond_3

    .line 45
    .line 46
    move-object v0, p1

    .line 47
    check-cast v0, Lsa/L;

    .line 48
    .line 49
    iget-object v4, v0, Lsa/M;->c:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 52
    .line 53
    .line 54
    move-result v4

    .line 55
    if-eqz v4, :cond_3

    .line 56
    .line 57
    invoke-virtual {p2, v0}, Lsa/b;->r(Lsa/L;)Lorg/jsoup/nodes/k;

    .line 58
    .line 59
    .line 60
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 61
    .line 62
    :goto_0
    const/4 p1, 0x1

    .line 63
    return p1

    .line 64
    :cond_3
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    const/4 v4, 0x0

    .line 69
    if-eqz v0, :cond_4

    .line 70
    .line 71
    move-object v0, p1

    .line 72
    check-cast v0, Lsa/K;

    .line 73
    .line 74
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 75
    .line 76
    sget-object v5, Lsa/A;->e:[Ljava/lang/String;

    .line 77
    .line 78
    invoke-static {v0, v5}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 79
    .line 80
    .line 81
    move-result v0

    .line 82
    if-eqz v0, :cond_4

    .line 83
    .line 84
    new-instance v0, Lorg/jsoup/nodes/k;

    .line 85
    .line 86
    iget-object v1, p2, Lsa/b;->h:Lsa/D;

    .line 87
    .line 88
    invoke-virtual {p2, v3, v1}, Lsa/b;->N(Ljava/lang/String;Lsa/D;)Lsa/E;

    .line 89
    .line 90
    .line 91
    move-result-object v1

    .line 92
    invoke-direct {v0, v1, v4, v4}, Lorg/jsoup/nodes/k;-><init>(Lsa/E;Ljava/lang/String;Lorg/jsoup/nodes/c;)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, v0}, Lsa/b;->x(Lorg/jsoup/nodes/p;)V

    .line 96
    .line 97
    .line 98
    iget-object v1, p2, Lsa/b;->e:Ljava/util/ArrayList;

    .line 99
    .line 100
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 101
    .line 102
    .line 103
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 104
    .line 105
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 106
    .line 107
    .line 108
    move-result p1

    .line 109
    return p1

    .line 110
    :cond_4
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 111
    .line 112
    .line 113
    move-result v0

    .line 114
    if-eqz v0, :cond_5

    .line 115
    .line 116
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 117
    .line 118
    .line 119
    return v1

    .line 120
    :cond_5
    new-instance v0, Lorg/jsoup/nodes/k;

    .line 121
    .line 122
    iget-object v1, p2, Lsa/b;->h:Lsa/D;

    .line 123
    .line 124
    invoke-virtual {p2, v3, v1}, Lsa/b;->N(Ljava/lang/String;Lsa/D;)Lsa/E;

    .line 125
    .line 126
    .line 127
    move-result-object v1

    .line 128
    invoke-direct {v0, v1, v4, v4}, Lorg/jsoup/nodes/k;-><init>(Lsa/E;Ljava/lang/String;Lorg/jsoup/nodes/c;)V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, v0}, Lsa/b;->x(Lorg/jsoup/nodes/p;)V

    .line 132
    .line 133
    .line 134
    iget-object v1, p2, Lsa/b;->e:Ljava/util/ArrayList;

    .line 135
    .line 136
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 137
    .line 138
    .line 139
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 140
    .line 141
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 142
    .line 143
    .line 144
    move-result p1

    .line 145
    return p1
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
.end method
