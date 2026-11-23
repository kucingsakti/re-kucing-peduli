.class public final LG4/b;
.super LGa/c;
.source "SourceFile"


# static fields
.field public static final synthetic M:I


# direct methods
.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 3

    .line 1
    const-string v0, "parentView"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    const v1, 0x7f0d00b9

    .line 15
    .line 16
    .line 17
    const/4 v2, 0x0

    .line 18
    invoke-virtual {v0, v1, p1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 19
    .line 20
    .line 21
    move-result-object p1

    .line 22
    const-string v0, "inflate(...)"

    .line 23
    .line 24
    invoke-static {p1, v0}, Lv8/i;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    .line 26
    .line 27
    invoke-direct {p0, p1}, LGa/c;-><init>(Landroid/view/View;)V

    .line 28
    .line 29
    .line 30
    return-void
    .line 31
    .line 32
    .line 33
.end method


# virtual methods
.method public final a(Ljava/lang/Object;)V
    .locals 6

    .line 1
    check-cast p1, LM4/a;

    .line 2
    .line 3
    const-string v0, "item"

    .line 4
    .line 5
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, Landroidx/recyclerview/widget/RecyclerView$a;->s:Landroid/view/View;

    .line 9
    .line 10
    const v1, 0x7f0a0163

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object v2

    .line 17
    check-cast v2, Lcom/google/android/material/textview/MaterialTextView;

    .line 18
    .line 19
    if-eqz v2, :cond_5

    .line 20
    .line 21
    const v1, 0x7f0a0172

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    check-cast v3, Landroid/widget/ImageView;

    .line 29
    .line 30
    if-eqz v3, :cond_5

    .line 31
    .line 32
    const v1, 0x7f0a0174

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 36
    .line 37
    .line 38
    move-result-object v4

    .line 39
    check-cast v4, Landroid/widget/ImageView;

    .line 40
    .line 41
    if-eqz v4, :cond_5

    .line 42
    .line 43
    const v1, 0x7f0a0194

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 47
    .line 48
    .line 49
    move-result-object v5

    .line 50
    check-cast v5, Landroid/widget/LinearLayout;

    .line 51
    .line 52
    if-eqz v5, :cond_5

    .line 53
    .line 54
    const v1, 0x7f0a032a

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v1}, Loa/b;->c(Landroid/view/View;I)Landroid/view/View;

    .line 58
    .line 59
    .line 60
    move-result-object v5

    .line 61
    check-cast v5, Lcom/google/android/material/textview/MaterialTextView;

    .line 62
    .line 63
    if-eqz v5, :cond_5

    .line 64
    .line 65
    move-object v1, v0

    .line 66
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 67
    .line 68
    iget-object v1, p1, LM4/a;->e:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {v5, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    .line 73
    const/4 v1, 0x1

    .line 74
    invoke-virtual {v3, v1}, Landroid/view/View;->setClipToOutline(Z)V

    .line 75
    .line 76
    .line 77
    iget-object v5, p1, LM4/a;->f:Ljava/lang/String;

    .line 78
    .line 79
    invoke-static {v3, v5}, LD3/b;->t(Landroid/widget/ImageView;Ljava/lang/Object;)V

    .line 80
    .line 81
    .line 82
    iget v3, p1, LM4/a;->b:I

    .line 83
    .line 84
    if-eq v3, v1, :cond_2

    .line 85
    .line 86
    const/4 v1, 0x2

    .line 87
    if-eq v3, v1, :cond_1

    .line 88
    .line 89
    const/4 v1, 0x3

    .line 90
    if-eq v3, v1, :cond_0

    .line 91
    .line 92
    const-string v1, "#00000000"

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_0
    const-string v1, "#64B5F6"

    .line 96
    .line 97
    goto :goto_0

    .line 98
    :cond_1
    const-string v1, "#FFF176"

    .line 99
    .line 100
    goto :goto_0

    .line 101
    :cond_2
    const-string v1, "#81C784"

    .line 102
    .line 103
    :goto_0
    invoke-static {v1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 104
    .line 105
    .line 106
    move-result v1

    .line 107
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    invoke-virtual {v4, v1}, Landroid/view/View;->setBackgroundTintList(Landroid/content/res/ColorStateList;)V

    .line 112
    .line 113
    .line 114
    new-instance v1, Ljava/text/SimpleDateFormat;

    .line 115
    .line 116
    new-instance v3, Ljava/util/Locale;

    .line 117
    .line 118
    const-string v4, "id"

    .line 119
    .line 120
    const-string v5, "ID"

    .line 121
    .line 122
    invoke-direct {v3, v4, v5}, Ljava/util/Locale;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    const-string v4, "EEEE, dd-MMM-yy"

    .line 126
    .line 127
    invoke-direct {v1, v4, v3}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 128
    .line 129
    .line 130
    iget-wide v3, p1, LM4/a;->g:J

    .line 131
    .line 132
    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    invoke-virtual {v1, v3}, Ljava/text/Format;->format(Ljava/lang/Object;)Ljava/lang/String;

    .line 137
    .line 138
    .line 139
    move-result-object v1

    .line 140
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 141
    .line 142
    .line 143
    iget-object v1, p1, LM4/a;->c:Ljava/lang/String;

    .line 144
    .line 145
    const-string v2, "episodes"

    .line 146
    .line 147
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 148
    .line 149
    .line 150
    move-result v2

    .line 151
    if-eqz v2, :cond_3

    .line 152
    .line 153
    new-instance v1, LG4/a;

    .line 154
    .line 155
    const/4 v2, 0x0

    .line 156
    invoke-direct {v1, v0, p1, v2}, LG4/a;-><init>(Landroid/view/View;LM4/a;I)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 160
    .line 161
    .line 162
    return-void

    .line 163
    :cond_3
    const-string v2, "series"

    .line 164
    .line 165
    invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 166
    .line 167
    .line 168
    move-result v1

    .line 169
    if-eqz v1, :cond_4

    .line 170
    .line 171
    new-instance v1, LG4/a;

    .line 172
    .line 173
    const/4 v2, 0x1

    .line 174
    invoke-direct {v1, v0, p1, v2}, LG4/a;-><init>(Landroid/view/View;LM4/a;I)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 178
    .line 179
    .line 180
    :cond_4
    return-void

    .line 181
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 182
    .line 183
    .line 184
    move-result-object p1

    .line 185
    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 186
    .line 187
    .line 188
    move-result-object p1

    .line 189
    new-instance v0, Ljava/lang/NullPointerException;

    .line 190
    .line 191
    const-string v1, "Missing required view with ID: "

    .line 192
    .line 193
    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 194
    .line 195
    .line 196
    move-result-object p1

    .line 197
    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 198
    .line 199
    .line 200
    throw v0
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
