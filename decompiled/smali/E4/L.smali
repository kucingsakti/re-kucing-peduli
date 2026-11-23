.class public final synthetic LE4/L;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LE4/L;->s:I

    iput-object p1, p0, LE4/L;->t:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lu8/a;)V
    .locals 1

    .line 2
    const/4 v0, 0x2

    iput v0, p0, LE4/L;->s:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    check-cast p1, Lv8/k;

    iput-object p1, p0, LE4/L;->t:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .line 1
    const/4 p1, 0x0

    .line 2
    iget-object v0, p0, LE4/L;->t:Ljava/lang/Object;

    .line 3
    .line 4
    iget v1, p0, LE4/L;->s:I

    .line 5
    .line 6
    packed-switch v1, :pswitch_data_0

    .line 7
    .line 8
    .line 9
    check-cast v0, Lw3/s;

    .line 10
    .line 11
    iget-object v1, v0, Lw3/s;->f:Landroid/widget/EditText;

    .line 12
    .line 13
    if-nez v1, :cond_0

    .line 14
    .line 15
    goto :goto_1

    .line 16
    :cond_0
    invoke-virtual {v1}, Landroid/widget/TextView;->getSelectionEnd()I

    .line 17
    .line 18
    .line 19
    move-result v1

    .line 20
    iget-object v2, v0, Lw3/s;->f:Landroid/widget/EditText;

    .line 21
    .line 22
    if-eqz v2, :cond_1

    .line 23
    .line 24
    invoke-virtual {v2}, Landroid/widget/TextView;->getTransformationMethod()Landroid/text/method/TransformationMethod;

    .line 25
    .line 26
    .line 27
    move-result-object v2

    .line 28
    instance-of v2, v2, Landroid/text/method/PasswordTransformationMethod;

    .line 29
    .line 30
    if-eqz v2, :cond_1

    .line 31
    .line 32
    iget-object v2, v0, Lw3/s;->f:Landroid/widget/EditText;

    .line 33
    .line 34
    invoke-virtual {v2, p1}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 35
    .line 36
    .line 37
    goto :goto_0

    .line 38
    :cond_1
    iget-object p1, v0, Lw3/s;->f:Landroid/widget/EditText;

    .line 39
    .line 40
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    .line 41
    .line 42
    .line 43
    move-result-object v2

    .line 44
    invoke-virtual {p1, v2}, Landroid/widget/TextView;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 45
    .line 46
    .line 47
    :goto_0
    if-ltz v1, :cond_2

    .line 48
    .line 49
    iget-object p1, v0, Lw3/s;->f:Landroid/widget/EditText;

    .line 50
    .line 51
    invoke-virtual {p1, v1}, Landroid/widget/EditText;->setSelection(I)V

    .line 52
    .line 53
    .line 54
    :cond_2
    invoke-virtual {v0}, Lw3/m;->q()V

    .line 55
    .line 56
    .line 57
    :goto_1
    return-void

    .line 58
    :pswitch_0
    check-cast v0, Lw3/i;

    .line 59
    .line 60
    invoke-virtual {v0}, Lw3/i;->u()V

    .line 61
    .line 62
    .line 63
    return-void

    .line 64
    :pswitch_1
    check-cast v0, Lw3/c;

    .line 65
    .line 66
    iget-object p1, v0, Lw3/c;->i:Landroid/widget/EditText;

    .line 67
    .line 68
    if-nez p1, :cond_3

    .line 69
    .line 70
    goto :goto_2

    .line 71
    :cond_3
    invoke-virtual {p1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    .line 72
    .line 73
    .line 74
    move-result-object p1

    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    invoke-interface {p1}, Landroid/text/Editable;->clear()V

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-virtual {v0}, Lw3/m;->q()V

    .line 81
    .line 82
    .line 83
    :goto_2
    return-void

    .line 84
    :pswitch_2
    check-cast v0, Lcom/google/android/material/datepicker/n;

    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/google/android/material/datepicker/n;->o0()V

    .line 87
    .line 88
    .line 89
    throw p1

    .line 90
    :pswitch_3
    check-cast v0, Lv8/k;

    .line 91
    .line 92
    invoke-interface {v0}, Lu8/a;->invoke()Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    return-void

    .line 96
    :pswitch_4
    sget v1, LJ4/h;->M:I

    .line 97
    .line 98
    const-string v1, "this$0"

    .line 99
    .line 100
    check-cast v0, LJ4/h;

    .line 101
    .line 102
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 103
    .line 104
    .line 105
    const-string v0, "viewEventListener"

    .line 106
    .line 107
    invoke-static {v0}, Lv8/i;->n(Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    throw p1

    .line 111
    :pswitch_5
    check-cast v0, Lcom/kcstream/cing/activity/SeriesActivity;

    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 114
    .line 115
    .line 116
    move-result-object v1

    .line 117
    iget-object v1, v1, LI4/c;->l:Ljava/lang/Object;

    .line 118
    .line 119
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 120
    .line 121
    const v2, 0x7fffffff

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 128
    .line 129
    .line 130
    move-result-object v1

    .line 131
    iget-object v1, v1, LI4/c;->l:Ljava/lang/Object;

    .line 132
    .line 133
    check-cast v1, Lcom/google/android/material/textview/MaterialTextView;

    .line 134
    .line 135
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0}, Lcom/kcstream/cing/activity/SeriesActivity;->z()LI4/c;

    .line 139
    .line 140
    .line 141
    move-result-object p1

    .line 142
    iget-object p1, p1, LI4/c;->d:Ljava/lang/Object;

    .line 143
    .line 144
    check-cast p1, Landroid/widget/RelativeLayout;

    .line 145
    .line 146
    const/16 v0, 0x8

    .line 147
    .line 148
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 149
    .line 150
    .line 151
    return-void

    .line 152
    nop

    .line 153
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
