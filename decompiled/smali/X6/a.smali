.class public final LX6/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:LY6/a;

.field public b:LY6/b;

.field public c:LY6/b;

.field public d:LY6/a;

.field public e:LY6/b;

.field public f:LY6/a;

.field public g:LY6/c;

.field public h:LY6/b;

.field public i:LY6/b;

.field public j:LY6/b;

.field public k:I

.field public l:I

.field public m:I


# virtual methods
.method public final a(Landroid/graphics/Canvas;Z)V
    .locals 12

    .line 1
    iget-object v0, p0, LX6/a;->b:LY6/b;

    .line 2
    .line 3
    if-eqz v0, :cond_4

    .line 4
    .line 5
    iget v0, p0, LX6/a;->k:I

    .line 6
    .line 7
    iget v1, p0, LX6/a;->l:I

    .line 8
    .line 9
    iget v2, p0, LX6/a;->m:I

    .line 10
    .line 11
    iget-object v3, p0, LX6/a;->a:LY6/a;

    .line 12
    .line 13
    iget-object v4, v3, LB6/b;->t:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v4, LW6/a;

    .line 16
    .line 17
    iget v5, v4, LW6/a;->a:I

    .line 18
    .line 19
    int-to-float v5, v5

    .line 20
    iget v6, v4, LW6/a;->g:I

    .line 21
    .line 22
    iget v7, v4, LW6/a;->h:F

    .line 23
    .line 24
    iget v8, v4, LW6/a;->j:I

    .line 25
    .line 26
    iget v9, v4, LW6/a;->i:I

    .line 27
    .line 28
    iget v10, v4, LW6/a;->p:I

    .line 29
    .line 30
    invoke-virtual {v4}, LW6/a;->a()LT6/f;

    .line 31
    .line 32
    .line 33
    move-result-object v4

    .line 34
    sget-object v11, LT6/f;->u:LT6/f;

    .line 35
    .line 36
    if-ne v4, v11, :cond_0

    .line 37
    .line 38
    if-nez p2, :cond_0

    .line 39
    .line 40
    :goto_0
    mul-float/2addr v5, v7

    .line 41
    goto :goto_1

    .line 42
    :cond_0
    sget-object v11, LT6/f;->B:LT6/f;

    .line 43
    .line 44
    if-ne v4, v11, :cond_1

    .line 45
    .line 46
    if-eqz p2, :cond_1

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    :goto_1
    if-ne v0, v10, :cond_2

    .line 50
    .line 51
    goto :goto_2

    .line 52
    :cond_2
    move v8, v9

    .line 53
    :goto_2
    sget-object p2, LT6/f;->x:LT6/f;

    .line 54
    .line 55
    if-ne v4, p2, :cond_3

    .line 56
    .line 57
    if-eq v0, v10, :cond_3

    .line 58
    .line 59
    iget-object p2, v3, LY6/a;->u:Ljava/lang/Object;

    .line 60
    .line 61
    check-cast p2, Landroid/graphics/Paint;

    .line 62
    .line 63
    int-to-float v0, v6

    .line 64
    invoke-virtual {p2, v0}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 65
    .line 66
    .line 67
    goto :goto_3

    .line 68
    :cond_3
    iget-object p2, v3, LB6/b;->s:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast p2, Landroid/graphics/Paint;

    .line 71
    .line 72
    :goto_3
    invoke-virtual {p2, v8}, Landroid/graphics/Paint;->setColor(I)V

    .line 73
    .line 74
    .line 75
    int-to-float v0, v1

    .line 76
    int-to-float v1, v2

    .line 77
    invoke-virtual {p1, v0, v1, v5, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 78
    .line 79
    .line 80
    :cond_4
    return-void
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
.end method
