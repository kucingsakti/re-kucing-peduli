.class public final enum Lsa/v;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "InHeadNoscript"

    .line 2
    .line 3
    const/4 v1, 0x4

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
    .locals 4

    .line 1
    invoke-virtual {p1}, LK0/n;->i()Z

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
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 9
    .line 10
    .line 11
    return v1

    .line 12
    :cond_0
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    move-object v0, p1

    .line 19
    check-cast v0, Lsa/L;

    .line 20
    .line 21
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 22
    .line 23
    const-string v2, "html"

    .line 24
    .line 25
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    sget-object v0, Lsa/B;->y:Lsa/x;

    .line 32
    .line 33
    iput-object p1, p2, Lsa/b;->g:LK0/n;

    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lsa/x;->h(LK0/n;Lsa/b;)Z

    .line 36
    .line 37
    .line 38
    move-result p1

    .line 39
    return p1

    .line 40
    :cond_1
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    sget-object v2, Lsa/B;->v:Lsa/u;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    move-object v0, p1

    .line 49
    check-cast v0, Lsa/K;

    .line 50
    .line 51
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 52
    .line 53
    const-string v3, "noscript"

    .line 54
    .line 55
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 56
    .line 57
    .line 58
    move-result v0

    .line 59
    if-eqz v0, :cond_2

    .line 60
    .line 61
    invoke-virtual {p2}, Lsa/b;->A()V

    .line 62
    .line 63
    .line 64
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 65
    .line 66
    return v1

    .line 67
    :cond_2
    invoke-static {p1}, Lsa/B;->f(LK0/n;)Z

    .line 68
    .line 69
    .line 70
    move-result v0

    .line 71
    if-nez v0, :cond_8

    .line 72
    .line 73
    invoke-virtual {p1}, LK0/n;->h()Z

    .line 74
    .line 75
    .line 76
    move-result v0

    .line 77
    if-nez v0, :cond_8

    .line 78
    .line 79
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 80
    .line 81
    .line 82
    move-result v0

    .line 83
    if-eqz v0, :cond_3

    .line 84
    .line 85
    move-object v0, p1

    .line 86
    check-cast v0, Lsa/L;

    .line 87
    .line 88
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 89
    .line 90
    sget-object v3, Lsa/A;->f:[Ljava/lang/String;

    .line 91
    .line 92
    invoke-static {v0, v3}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 93
    .line 94
    .line 95
    move-result v0

    .line 96
    if-eqz v0, :cond_3

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_3
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 100
    .line 101
    .line 102
    move-result v0

    .line 103
    if-eqz v0, :cond_4

    .line 104
    .line 105
    move-object v0, p1

    .line 106
    check-cast v0, Lsa/K;

    .line 107
    .line 108
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 109
    .line 110
    const-string v2, "br"

    .line 111
    .line 112
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    move-result v0

    .line 116
    if-eqz v0, :cond_4

    .line 117
    .line 118
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 119
    .line 120
    .line 121
    new-instance v0, Lsa/G;

    .line 122
    .line 123
    invoke-direct {v0}, Lsa/G;-><init>()V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    iput-object p1, v0, Lsa/G;->b:Ljava/lang/String;

    .line 131
    .line 132
    invoke-virtual {p2, v0}, Lsa/b;->s(Lsa/G;)V

    .line 133
    .line 134
    .line 135
    return v1

    .line 136
    :cond_4
    invoke-virtual {p1}, LK0/n;->l()Z

    .line 137
    .line 138
    .line 139
    move-result v0

    .line 140
    if-eqz v0, :cond_5

    .line 141
    .line 142
    move-object v0, p1

    .line 143
    check-cast v0, Lsa/L;

    .line 144
    .line 145
    iget-object v0, v0, Lsa/M;->c:Ljava/lang/String;

    .line 146
    .line 147
    sget-object v2, Lsa/A;->I:[Ljava/lang/String;

    .line 148
    .line 149
    invoke-static {v0, v2}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 150
    .line 151
    .line 152
    move-result v0

    .line 153
    if-nez v0, :cond_6

    .line 154
    .line 155
    :cond_5
    invoke-virtual {p1}, LK0/n;->k()Z

    .line 156
    .line 157
    .line 158
    move-result v0

    .line 159
    if-eqz v0, :cond_7

    .line 160
    .line 161
    :cond_6
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 162
    .line 163
    .line 164
    const/4 p1, 0x0

    .line 165
    return p1

    .line 166
    :cond_7
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 167
    .line 168
    .line 169
    new-instance v0, Lsa/G;

    .line 170
    .line 171
    invoke-direct {v0}, Lsa/G;-><init>()V

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 175
    .line 176
    .line 177
    move-result-object p1

    .line 178
    iput-object p1, v0, Lsa/G;->b:Ljava/lang/String;

    .line 179
    .line 180
    invoke-virtual {p2, v0}, Lsa/b;->s(Lsa/G;)V

    .line 181
    .line 182
    .line 183
    return v1

    .line 184
    :cond_8
    :goto_0
    iput-object p1, p2, Lsa/b;->g:LK0/n;

    .line 185
    .line 186
    invoke-virtual {v2, p1, p2}, Lsa/u;->h(LK0/n;Lsa/b;)Z

    .line 187
    .line 188
    .line 189
    move-result p1

    .line 190
    return p1
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
