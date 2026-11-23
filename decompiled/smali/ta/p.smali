.class public final Lta/p;
.super Lta/r;
.source "SourceFile"


# instance fields
.field public final b:LY1/c;


# direct methods
.method public constructor <init>(Lta/m;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lta/r;->a:Lta/m;

    .line 5
    .line 6
    new-instance v0, LY1/c;

    .line 7
    .line 8
    invoke-direct {v0, p1}, LY1/c;-><init>(Lta/m;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lta/p;->b:LY1/c;

    .line 12
    .line 13
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Lorg/jsoup/nodes/k;Lorg/jsoup/nodes/k;)Z
    .locals 10

    .line 1
    const/4 p1, 0x0

    .line 2
    move v0, p1

    .line 3
    :goto_0
    iget-object v1, p2, Lorg/jsoup/nodes/k;->x:Ljava/util/List;

    .line 4
    .line 5
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    if-ge v0, v1, :cond_e

    .line 10
    .line 11
    invoke-virtual {p2}, Lorg/jsoup/nodes/k;->l()Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 16
    .line 17
    .line 18
    move-result-object v1

    .line 19
    check-cast v1, Lorg/jsoup/nodes/p;

    .line 20
    .line 21
    instance-of v2, v1, Lorg/jsoup/nodes/k;

    .line 22
    .line 23
    if-eqz v2, :cond_d

    .line 24
    .line 25
    check-cast v1, Lorg/jsoup/nodes/k;

    .line 26
    .line 27
    iget-object v2, p0, Lta/p;->b:LY1/c;

    .line 28
    .line 29
    iput-object p2, v2, LY1/c;->t:Ljava/lang/Object;

    .line 30
    .line 31
    const/4 v3, 0x0

    .line 32
    iput-object v3, v2, LY1/c;->u:Ljava/lang/Object;

    .line 33
    .line 34
    move v4, p1

    .line 35
    move-object v3, v1

    .line 36
    :goto_1
    const/4 v5, 0x1

    .line 37
    if-eqz v3, :cond_c

    .line 38
    .line 39
    instance-of v6, v3, Lorg/jsoup/nodes/k;

    .line 40
    .line 41
    const/4 v7, 0x5

    .line 42
    if-eqz v6, :cond_0

    .line 43
    .line 44
    move-object v6, v3

    .line 45
    check-cast v6, Lorg/jsoup/nodes/k;

    .line 46
    .line 47
    iget-object v8, v2, LY1/c;->v:Ljava/lang/Object;

    .line 48
    .line 49
    check-cast v8, Lta/m;

    .line 50
    .line 51
    iget-object v9, v2, LY1/c;->t:Ljava/lang/Object;

    .line 52
    .line 53
    check-cast v9, Lorg/jsoup/nodes/k;

    .line 54
    .line 55
    invoke-virtual {v8, v9, v6}, Lta/m;->a(Lorg/jsoup/nodes/k;Lorg/jsoup/nodes/k;)Z

    .line 56
    .line 57
    .line 58
    move-result v8

    .line 59
    if-eqz v8, :cond_0

    .line 60
    .line 61
    iput-object v6, v2, LY1/c;->u:Ljava/lang/Object;

    .line 62
    .line 63
    move v6, v7

    .line 64
    goto :goto_2

    .line 65
    :cond_0
    move v6, v5

    .line 66
    :goto_2
    if-ne v6, v7, :cond_1

    .line 67
    .line 68
    goto :goto_5

    .line 69
    :cond_1
    if-ne v6, v5, :cond_2

    .line 70
    .line 71
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->h()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    if-lez v7, :cond_2

    .line 76
    .line 77
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->l()Ljava/util/List;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    move-result-object v3

    .line 85
    check-cast v3, Lorg/jsoup/nodes/p;

    .line 86
    .line 87
    add-int/lit8 v4, v4, 0x1

    .line 88
    .line 89
    goto :goto_1

    .line 90
    :cond_2
    :goto_3
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->r()Lorg/jsoup/nodes/p;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const/4 v8, 0x4

    .line 95
    const/4 v9, 0x2

    .line 96
    if-nez v7, :cond_7

    .line 97
    .line 98
    if-gtz v4, :cond_3

    .line 99
    .line 100
    goto :goto_4

    .line 101
    :cond_3
    if-eq v6, v5, :cond_4

    .line 102
    .line 103
    if-ne v6, v9, :cond_5

    .line 104
    .line 105
    :cond_4
    move v6, v5

    .line 106
    :cond_5
    iget-object v7, v3, Lorg/jsoup/nodes/p;->s:Lorg/jsoup/nodes/p;

    .line 107
    .line 108
    add-int/lit8 v4, v4, -0x1

    .line 109
    .line 110
    if-ne v6, v8, :cond_6

    .line 111
    .line 112
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->y()V

    .line 113
    .line 114
    .line 115
    :cond_6
    move v6, v5

    .line 116
    move-object v3, v7

    .line 117
    goto :goto_3

    .line 118
    :cond_7
    :goto_4
    if-eq v6, v5, :cond_8

    .line 119
    .line 120
    if-ne v6, v9, :cond_9

    .line 121
    .line 122
    :cond_8
    move v6, v5

    .line 123
    :cond_9
    if-ne v3, v1, :cond_a

    .line 124
    .line 125
    goto :goto_5

    .line 126
    :cond_a
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->r()Lorg/jsoup/nodes/p;

    .line 127
    .line 128
    .line 129
    move-result-object v5

    .line 130
    if-ne v6, v8, :cond_b

    .line 131
    .line 132
    invoke-virtual {v3}, Lorg/jsoup/nodes/p;->y()V

    .line 133
    .line 134
    .line 135
    :cond_b
    move-object v3, v5

    .line 136
    goto :goto_1

    .line 137
    :cond_c
    :goto_5
    iget-object v1, v2, LY1/c;->u:Ljava/lang/Object;

    .line 138
    .line 139
    check-cast v1, Lorg/jsoup/nodes/k;

    .line 140
    .line 141
    if-eqz v1, :cond_d

    .line 142
    .line 143
    return v5

    .line 144
    :cond_d
    add-int/lit8 v0, v0, 0x1

    .line 145
    .line 146
    goto/16 :goto_0

    .line 147
    .line 148
    :cond_e
    return p1
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

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-object v0, p0, Lta/r;->a:Lta/m;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    new-array v1, v1, [Ljava/lang/Object;

    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    aput-object v0, v1, v2

    .line 8
    .line 9
    const-string v0, ":has(%s)"

    .line 10
    .line 11
    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    return-object v0
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
