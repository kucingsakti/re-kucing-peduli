.class public Lta/k;
.super Lta/m;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final synthetic c:I


# direct methods
.method public constructor <init>(III)V
    .locals 0

    .line 1
    iput p3, p0, Lta/k;->c:I

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput p1, p0, Lta/k;->a:I

    .line 7
    .line 8
    iput p2, p0, Lta/k;->b:I

    .line 9
    .line 10
    return-void
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
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
.end method


# virtual methods
.method public final a(Lorg/jsoup/nodes/k;Lorg/jsoup/nodes/k;)Z
    .locals 4

    .line 1
    iget-object p1, p2, Lorg/jsoup/nodes/p;->s:Lorg/jsoup/nodes/p;

    .line 2
    .line 3
    check-cast p1, Lorg/jsoup/nodes/k;

    .line 4
    .line 5
    if-eqz p1, :cond_9

    .line 6
    .line 7
    instance-of p1, p1, Lorg/jsoup/nodes/h;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    goto/16 :goto_4

    .line 12
    .line 13
    :cond_0
    iget p1, p0, Lta/k;->c:I

    .line 14
    .line 15
    packed-switch p1, :pswitch_data_0

    .line 16
    .line 17
    .line 18
    iget-object p1, p2, Lorg/jsoup/nodes/p;->s:Lorg/jsoup/nodes/p;

    .line 19
    .line 20
    check-cast p1, Lorg/jsoup/nodes/k;

    .line 21
    .line 22
    const/4 v0, 0x0

    .line 23
    if-nez p1, :cond_1

    .line 24
    .line 25
    goto/16 :goto_2

    .line 26
    .line 27
    :cond_1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 28
    .line 29
    .line 30
    new-instance v1, Lsa/C;

    .line 31
    .line 32
    invoke-virtual {p1}, Lorg/jsoup/nodes/k;->E()Ljava/util/List;

    .line 33
    .line 34
    .line 35
    move-result-object p1

    .line 36
    invoke-direct {v1, p1}, Lsa/C;-><init>(Ljava/util/Collection;)V

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    .line 40
    .line 41
    .line 42
    move-result-object p1

    .line 43
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 44
    .line 45
    .line 46
    move-result v1

    .line 47
    if-eqz v1, :cond_7

    .line 48
    .line 49
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 50
    .line 51
    .line 52
    move-result-object v1

    .line 53
    check-cast v1, Lorg/jsoup/nodes/k;

    .line 54
    .line 55
    iget-object v2, v1, Lorg/jsoup/nodes/k;->v:Lsa/E;

    .line 56
    .line 57
    iget-object v3, p2, Lorg/jsoup/nodes/k;->v:Lsa/E;

    .line 58
    .line 59
    invoke-virtual {v2, v3}, Lsa/E;->equals(Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v2

    .line 63
    if-eqz v2, :cond_3

    .line 64
    .line 65
    add-int/lit8 v0, v0, 0x1

    .line 66
    .line 67
    :cond_3
    if-ne v1, p2, :cond_2

    .line 68
    .line 69
    goto :goto_2

    .line 70
    :pswitch_0
    iget-object p1, p2, Lorg/jsoup/nodes/p;->s:Lorg/jsoup/nodes/p;

    .line 71
    .line 72
    check-cast p1, Lorg/jsoup/nodes/k;

    .line 73
    .line 74
    const/4 v0, 0x0

    .line 75
    if-nez p1, :cond_4

    .line 76
    .line 77
    goto :goto_2

    .line 78
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 79
    .line 80
    .line 81
    new-instance v1, Lsa/C;

    .line 82
    .line 83
    invoke-virtual {p1}, Lorg/jsoup/nodes/k;->E()Ljava/util/List;

    .line 84
    .line 85
    .line 86
    move-result-object p1

    .line 87
    invoke-direct {v1, p1}, Lsa/C;-><init>(Ljava/util/Collection;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Lorg/jsoup/nodes/k;->I()I

    .line 91
    .line 92
    .line 93
    move-result p1

    .line 94
    :goto_0
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 95
    .line 96
    .line 97
    move-result v2

    .line 98
    if-ge p1, v2, :cond_7

    .line 99
    .line 100
    invoke-virtual {v1, p1}, Ljava/util/AbstractList;->get(I)Ljava/lang/Object;

    .line 101
    .line 102
    .line 103
    move-result-object v2

    .line 104
    check-cast v2, Lorg/jsoup/nodes/k;

    .line 105
    .line 106
    iget-object v2, v2, Lorg/jsoup/nodes/k;->v:Lsa/E;

    .line 107
    .line 108
    iget-object v3, p2, Lorg/jsoup/nodes/k;->v:Lsa/E;

    .line 109
    .line 110
    invoke-virtual {v2, v3}, Lsa/E;->equals(Ljava/lang/Object;)Z

    .line 111
    .line 112
    .line 113
    move-result v2

    .line 114
    if-eqz v2, :cond_5

    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x1

    .line 117
    .line 118
    :cond_5
    add-int/lit8 p1, p1, 0x1

    .line 119
    .line 120
    goto :goto_0

    .line 121
    :pswitch_1
    iget-object p1, p2, Lorg/jsoup/nodes/p;->s:Lorg/jsoup/nodes/p;

    .line 122
    .line 123
    check-cast p1, Lorg/jsoup/nodes/k;

    .line 124
    .line 125
    if-nez p1, :cond_6

    .line 126
    .line 127
    const/4 p1, 0x0

    .line 128
    :goto_1
    move v0, p1

    .line 129
    goto :goto_2

    .line 130
    :cond_6
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 131
    .line 132
    .line 133
    new-instance v0, Lsa/C;

    .line 134
    .line 135
    invoke-virtual {p1}, Lorg/jsoup/nodes/k;->E()Ljava/util/List;

    .line 136
    .line 137
    .line 138
    move-result-object p1

    .line 139
    invoke-direct {v0, p1}, Lsa/C;-><init>(Ljava/util/Collection;)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    .line 143
    .line 144
    .line 145
    move-result p1

    .line 146
    invoke-virtual {p2}, Lorg/jsoup/nodes/k;->I()I

    .line 147
    .line 148
    .line 149
    move-result p2

    .line 150
    sub-int/2addr p1, p2

    .line 151
    goto :goto_1

    .line 152
    :pswitch_2
    invoke-virtual {p2}, Lorg/jsoup/nodes/k;->I()I

    .line 153
    .line 154
    .line 155
    move-result p1

    .line 156
    add-int/lit8 v0, p1, 0x1

    .line 157
    .line 158
    :cond_7
    :goto_2
    iget p1, p0, Lta/k;->b:I

    .line 159
    .line 160
    iget p2, p0, Lta/k;->a:I

    .line 161
    .line 162
    if-nez p2, :cond_8

    .line 163
    .line 164
    if-ne v0, p1, :cond_9

    .line 165
    .line 166
    goto :goto_3

    .line 167
    :cond_8
    sub-int/2addr v0, p1

    .line 168
    mul-int p1, v0, p2

    .line 169
    .line 170
    if-ltz p1, :cond_9

    .line 171
    .line 172
    rem-int/2addr v0, p2

    .line 173
    if-nez v0, :cond_9

    .line 174
    .line 175
    :goto_3
    const/4 p1, 0x1

    .line 176
    return p1

    .line 177
    :cond_9
    :goto_4
    const/4 p1, 0x0

    .line 178
    return p1

    .line 179
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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

.method public final b()Ljava/lang/String;
    .locals 1

    .line 1
    iget v0, p0, Lta/k;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string v0, "nth-of-type"

    .line 7
    .line 8
    return-object v0

    .line 9
    :pswitch_0
    const-string v0, "nth-last-of-type"

    .line 10
    .line 11
    return-object v0

    .line 12
    :pswitch_1
    const-string v0, "nth-last-child"

    .line 13
    .line 14
    return-object v0

    .line 15
    :pswitch_2
    const-string v0, "nth-child"

    .line 16
    .line 17
    return-object v0

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
.end method

.method public toString()Ljava/lang/String;
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x2

    .line 4
    iget v3, p0, Lta/k;->b:I

    .line 5
    .line 6
    iget v4, p0, Lta/k;->a:I

    .line 7
    .line 8
    if-nez v4, :cond_0

    .line 9
    .line 10
    invoke-virtual {p0}, Lta/k;->b()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v4

    .line 14
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 15
    .line 16
    .line 17
    move-result-object v3

    .line 18
    new-array v2, v2, [Ljava/lang/Object;

    .line 19
    .line 20
    aput-object v4, v2, v1

    .line 21
    .line 22
    aput-object v3, v2, v0

    .line 23
    .line 24
    const-string v0, ":%s(%d)"

    .line 25
    .line 26
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    return-object v0

    .line 31
    :cond_0
    if-nez v3, :cond_1

    .line 32
    .line 33
    invoke-virtual {p0}, Lta/k;->b()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v3

    .line 37
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    new-array v2, v2, [Ljava/lang/Object;

    .line 42
    .line 43
    aput-object v3, v2, v1

    .line 44
    .line 45
    aput-object v4, v2, v0

    .line 46
    .line 47
    const-string v0, ":%s(%dn)"

    .line 48
    .line 49
    invoke-static {v0, v2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    return-object v0

    .line 54
    :cond_1
    invoke-virtual {p0}, Lta/k;->b()Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    move-result-object v5

    .line 58
    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 59
    .line 60
    .line 61
    move-result-object v4

    .line 62
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v6, 0x3

    .line 67
    new-array v6, v6, [Ljava/lang/Object;

    .line 68
    .line 69
    aput-object v5, v6, v1

    .line 70
    .line 71
    aput-object v4, v6, v0

    .line 72
    .line 73
    aput-object v3, v6, v2

    .line 74
    .line 75
    const-string v0, ":%s(%dn%+d)"

    .line 76
    .line 77
    invoke-static {v0, v6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v0

    .line 81
    return-object v0
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
.end method
