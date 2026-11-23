.class public final LC1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I


# direct methods
.method public constructor <init>(LC1/g;)V
    .locals 9

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iget-object v0, p1, LC1/g;->a:Landroid/content/Context;

    .line 5
    .line 6
    iget-object v1, p1, LC1/g;->b:Landroid/app/ActivityManager;

    .line 7
    .line 8
    invoke-virtual {v1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 9
    .line 10
    .line 11
    move-result v2

    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    const/high16 v2, 0x200000

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/high16 v2, 0x400000

    .line 18
    .line 19
    :goto_0
    iput v2, p0, LC1/h;->c:I

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    const/high16 v4, 0x100000

    .line 26
    .line 27
    mul-int/2addr v3, v4

    .line 28
    invoke-virtual {v1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 29
    .line 30
    .line 31
    move-result v4

    .line 32
    int-to-float v3, v3

    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    const v4, 0x3ea8f5c3    # 0.33f

    .line 36
    .line 37
    .line 38
    goto :goto_1

    .line 39
    :cond_1
    const v4, 0x3ecccccd    # 0.4f

    .line 40
    .line 41
    .line 42
    :goto_1
    mul-float/2addr v3, v4

    .line 43
    invoke-static {v3}, Ljava/lang/Math;->round(F)I

    .line 44
    .line 45
    .line 46
    move-result v3

    .line 47
    iget-object v4, p1, LC1/g;->c:LA1/r;

    .line 48
    .line 49
    iget-object v4, v4, LA1/r;->t:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v4, Landroid/util/DisplayMetrics;

    .line 52
    .line 53
    iget v5, v4, Landroid/util/DisplayMetrics;->widthPixels:I

    .line 54
    .line 55
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    .line 56
    .line 57
    mul-int/2addr v5, v4

    .line 58
    mul-int/lit8 v5, v5, 0x4

    .line 59
    .line 60
    int-to-float v4, v5

    .line 61
    iget p1, p1, LC1/g;->d:F

    .line 62
    .line 63
    mul-float v5, v4, p1

    .line 64
    .line 65
    invoke-static {v5}, Ljava/lang/Math;->round(F)I

    .line 66
    .line 67
    .line 68
    move-result v5

    .line 69
    const/high16 v6, 0x40000000    # 2.0f

    .line 70
    .line 71
    mul-float/2addr v4, v6

    .line 72
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 73
    .line 74
    .line 75
    move-result v4

    .line 76
    sub-int v7, v3, v2

    .line 77
    .line 78
    add-int v8, v4, v5

    .line 79
    .line 80
    if-gt v8, v7, :cond_2

    .line 81
    .line 82
    iput v4, p0, LC1/h;->b:I

    .line 83
    .line 84
    iput v5, p0, LC1/h;->a:I

    .line 85
    .line 86
    goto :goto_2

    .line 87
    :cond_2
    int-to-float v4, v7

    .line 88
    add-float v5, p1, v6

    .line 89
    .line 90
    div-float/2addr v4, v5

    .line 91
    mul-float/2addr v6, v4

    .line 92
    invoke-static {v6}, Ljava/lang/Math;->round(F)I

    .line 93
    .line 94
    .line 95
    move-result v5

    .line 96
    iput v5, p0, LC1/h;->b:I

    .line 97
    .line 98
    mul-float/2addr v4, p1

    .line 99
    invoke-static {v4}, Ljava/lang/Math;->round(F)I

    .line 100
    .line 101
    .line 102
    move-result p1

    .line 103
    iput p1, p0, LC1/h;->a:I

    .line 104
    .line 105
    :goto_2
    const-string p1, "MemorySizeCalculator"

    .line 106
    .line 107
    const/4 v4, 0x3

    .line 108
    invoke-static {p1, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 109
    .line 110
    .line 111
    move-result p1

    .line 112
    if-eqz p1, :cond_3

    .line 113
    .line 114
    iget p1, p0, LC1/h;->b:I

    .line 115
    .line 116
    int-to-long v4, p1

    .line 117
    invoke-static {v0, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 118
    .line 119
    .line 120
    iget p1, p0, LC1/h;->a:I

    .line 121
    .line 122
    int-to-long v4, p1

    .line 123
    invoke-static {v0, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    int-to-long v4, v2

    .line 127
    invoke-static {v0, v4, v5}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    int-to-long v2, v3

    .line 131
    invoke-static {v0, v2, v3}, Landroid/text/format/Formatter;->formatFileSize(Landroid/content/Context;J)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    invoke-virtual {v1}, Landroid/app/ActivityManager;->getMemoryClass()I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v1}, Landroid/app/ActivityManager;->isLowRamDevice()Z

    .line 138
    .line 139
    .line 140
    :cond_3
    return-void
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
