.class public final enum Lsa/c;
.super Lsa/B;
.source "SourceFile"


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    const-string v0, "InTableText"

    .line 2
    .line 3
    const/16 v1, 0x9

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
    .locals 6

    .line 1
    iget v0, p1, LK0/n;->a:I

    .line 2
    .line 3
    const/4 v1, 0x5

    .line 4
    const/4 v2, 0x1

    .line 5
    const/4 v3, 0x0

    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    .line 8
    check-cast p1, Lsa/G;

    .line 9
    .line 10
    iget-object v0, p1, Lsa/G;->b:Ljava/lang/String;

    .line 11
    .line 12
    sget-object v1, Lsa/B;->P:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result v0

    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 21
    .line 22
    .line 23
    return v3

    .line 24
    :cond_0
    iget-object p2, p2, Lsa/b;->s:Ljava/util/ArrayList;

    .line 25
    .line 26
    iget-object p1, p1, Lsa/G;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    return v2

    .line 32
    :cond_1
    iget-object v0, p2, Lsa/b;->s:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 35
    .line 36
    .line 37
    move-result v0

    .line 38
    if-lez v0, :cond_5

    .line 39
    .line 40
    iget-object v0, p2, Lsa/b;->s:Ljava/util/ArrayList;

    .line 41
    .line 42
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-eqz v1, :cond_4

    .line 51
    .line 52
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v1

    .line 56
    check-cast v1, Ljava/lang/String;

    .line 57
    .line 58
    invoke-static {v1}, Lra/a;->d(Ljava/lang/String;)Z

    .line 59
    .line 60
    .line 61
    move-result v4

    .line 62
    if-nez v4, :cond_3

    .line 63
    .line 64
    invoke-virtual {p2, p0}, Lsa/b;->h(Lsa/B;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lsa/b;->f()Lorg/jsoup/nodes/k;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    iget-object v4, v4, Lorg/jsoup/nodes/k;->v:Lsa/E;

    .line 72
    .line 73
    iget-object v4, v4, Lsa/E;->t:Ljava/lang/String;

    .line 74
    .line 75
    sget-object v5, Lsa/A;->A:[Ljava/lang/String;

    .line 76
    .line 77
    invoke-static {v4, v5}, Lra/a;->c(Ljava/lang/String;[Ljava/lang/String;)Z

    .line 78
    .line 79
    .line 80
    move-result v4

    .line 81
    sget-object v5, Lsa/B;->y:Lsa/x;

    .line 82
    .line 83
    if-eqz v4, :cond_2

    .line 84
    .line 85
    iput-boolean v2, p2, Lsa/b;->v:Z

    .line 86
    .line 87
    new-instance v4, Lsa/G;

    .line 88
    .line 89
    invoke-direct {v4}, Lsa/G;-><init>()V

    .line 90
    .line 91
    .line 92
    iput-object v1, v4, Lsa/G;->b:Ljava/lang/String;

    .line 93
    .line 94
    invoke-virtual {p2, v4, v5}, Lsa/b;->E(LK0/n;Lsa/B;)Z

    .line 95
    .line 96
    .line 97
    iput-boolean v3, p2, Lsa/b;->v:Z

    .line 98
    .line 99
    goto :goto_0

    .line 100
    :cond_2
    new-instance v4, Lsa/G;

    .line 101
    .line 102
    invoke-direct {v4}, Lsa/G;-><init>()V

    .line 103
    .line 104
    .line 105
    iput-object v1, v4, Lsa/G;->b:Ljava/lang/String;

    .line 106
    .line 107
    invoke-virtual {p2, v4, v5}, Lsa/b;->E(LK0/n;Lsa/B;)Z

    .line 108
    .line 109
    .line 110
    goto :goto_0

    .line 111
    :cond_3
    new-instance v4, Lsa/G;

    .line 112
    .line 113
    invoke-direct {v4}, Lsa/G;-><init>()V

    .line 114
    .line 115
    .line 116
    iput-object v1, v4, Lsa/G;->b:Ljava/lang/String;

    .line 117
    .line 118
    invoke-virtual {p2, v4}, Lsa/b;->s(Lsa/G;)V

    .line 119
    .line 120
    .line 121
    goto :goto_0

    .line 122
    :cond_4
    new-instance v0, Ljava/util/ArrayList;

    .line 123
    .line 124
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 125
    .line 126
    .line 127
    iput-object v0, p2, Lsa/b;->s:Ljava/util/ArrayList;

    .line 128
    .line 129
    :cond_5
    iget-object v0, p2, Lsa/b;->m:Lsa/B;

    .line 130
    .line 131
    iput-object v0, p2, Lsa/b;->l:Lsa/B;

    .line 132
    .line 133
    invoke-virtual {p2, p1}, Lsa/b;->D(LK0/n;)Z

    .line 134
    .line 135
    .line 136
    move-result p1

    .line 137
    return p1
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
.end method
