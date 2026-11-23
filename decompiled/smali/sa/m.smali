.class public final enum Lsa/m;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "Initial"

    .line 2
    .line 3
    const/4 v1, 0x0

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
    .locals 7

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
    return v1

    .line 9
    :cond_0
    invoke-virtual {p1}, LK0/n;->h()Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    check-cast p1, Lsa/H;

    .line 16
    .line 17
    invoke-virtual {p2, p1}, Lsa/b;->t(Lsa/H;)V

    .line 18
    .line 19
    .line 20
    return v1

    .line 21
    :cond_1
    invoke-virtual {p1}, LK0/n;->i()Z

    .line 22
    .line 23
    .line 24
    move-result v0

    .line 25
    sget-object v2, Lsa/B;->t:Lsa/s;

    .line 26
    .line 27
    if-eqz v0, :cond_7

    .line 28
    .line 29
    check-cast p1, Lsa/I;

    .line 30
    .line 31
    new-instance v0, Lorg/jsoup/nodes/i;

    .line 32
    .line 33
    iget-object v3, p2, Lsa/b;->h:Lsa/D;

    .line 34
    .line 35
    iget-object v4, p1, Lsa/I;->b:Ljava/lang/StringBuilder;

    .line 36
    .line 37
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4

    .line 48
    iget-boolean v3, v3, Lsa/D;->a:Z

    .line 49
    .line 50
    if-nez v3, :cond_2

    .line 51
    .line 52
    invoke-static {v4}, LJ7/j;->t(Ljava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    :cond_2
    iget-object v3, p1, Lsa/I;->d:Ljava/lang/StringBuilder;

    .line 57
    .line 58
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    .line 60
    .line 61
    move-result-object v3

    .line 62
    iget-object v5, p1, Lsa/I;->e:Ljava/lang/StringBuilder;

    .line 63
    .line 64
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    .line 66
    .line 67
    move-result-object v5

    .line 68
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 69
    .line 70
    .line 71
    invoke-static {v4}, Lqa/b;->w(Ljava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    invoke-static {v3}, Lqa/b;->w(Ljava/lang/Object;)V

    .line 75
    .line 76
    .line 77
    invoke-static {v5}, Lqa/b;->w(Ljava/lang/Object;)V

    .line 78
    .line 79
    .line 80
    const-string v6, "name"

    .line 81
    .line 82
    invoke-virtual {v0, v6, v4}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 83
    .line 84
    .line 85
    const-string v4, "publicId"

    .line 86
    .line 87
    invoke-virtual {v0, v4, v3}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 88
    .line 89
    .line 90
    const-string v3, "systemId"

    .line 91
    .line 92
    invoke-virtual {v0, v3, v5}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v4}, Lorg/jsoup/nodes/i;->E(Ljava/lang/String;)Z

    .line 96
    .line 97
    .line 98
    move-result v4

    .line 99
    const-string v5, "pubSysKey"

    .line 100
    .line 101
    if-eqz v4, :cond_3

    .line 102
    .line 103
    const-string v3, "PUBLIC"

    .line 104
    .line 105
    invoke-virtual {v0, v5, v3}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_3
    invoke-virtual {v0, v3}, Lorg/jsoup/nodes/i;->E(Ljava/lang/String;)Z

    .line 110
    .line 111
    .line 112
    move-result v3

    .line 113
    if-eqz v3, :cond_4

    .line 114
    .line 115
    const-string v3, "SYSTEM"

    .line 116
    .line 117
    invoke-virtual {v0, v5, v3}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 118
    .line 119
    .line 120
    :cond_4
    :goto_0
    iget-object v3, p1, Lsa/I;->c:Ljava/lang/String;

    .line 121
    .line 122
    if-eqz v3, :cond_5

    .line 123
    .line 124
    invoke-virtual {v0, v5, v3}, Lorg/jsoup/nodes/o;->B(Ljava/lang/String;Ljava/lang/String;)Lorg/jsoup/nodes/o;

    .line 125
    .line 126
    .line 127
    :cond_5
    iget-object v3, p2, Lsa/b;->d:Lorg/jsoup/nodes/h;

    .line 128
    .line 129
    invoke-virtual {v3, v0}, Lorg/jsoup/nodes/k;->B(Lorg/jsoup/nodes/p;)V

    .line 130
    .line 131
    .line 132
    iget-boolean p1, p1, Lsa/I;->f:Z

    .line 133
    .line 134
    if-eqz p1, :cond_6

    .line 135
    .line 136
    iget-object p1, p2, Lsa/b;->d:Lorg/jsoup/nodes/h;

    .line 137
    .line 138
    const/4 v0, 0x2

    .line 139
    iput v0, p1, Lorg/jsoup/nodes/h;->D:I

    .line 140
    .line 141
    :cond_6
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 142
    .line 143
    return v1

    .line 144
    :cond_7
    iput-object v2, p2, Lsa/b;->l:Lsa/B;

    .line 145
    .line 146
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 147
    .line 148
    .line 149
    move-result p1

    .line 150
    return p1
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
