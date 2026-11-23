.class public final synthetic LE4/o;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Landroid/view/KeyEvent$Callback;

.field public final synthetic u:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILandroid/view/KeyEvent$Callback;Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LE4/o;->s:I

    iput-object p2, p0, LE4/o;->t:Landroid/view/KeyEvent$Callback;

    iput-object p3, p0, LE4/o;->u:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, LE4/o;->s:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    const-string p1, "$result"

    .line 7
    .line 8
    iget-object v0, p0, LE4/o;->u:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lcom/kcstream/cing/model/RecentItem;

    .line 11
    .line 12
    invoke-static {v0, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    new-instance p1, Landroid/content/Intent;

    .line 16
    .line 17
    iget-object v1, p0, LE4/o;->t:Landroid/view/KeyEvent$Callback;

    .line 18
    .line 19
    check-cast v1, Landroid/view/View;

    .line 20
    .line 21
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 22
    .line 23
    .line 24
    move-result-object v2

    .line 25
    const-class v3, Lcom/kcstream/cing/activity/SeriesActivity;

    .line 26
    .line 27
    invoke-direct {p1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 28
    .line 29
    .line 30
    const-string v2, "id"

    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kcstream/cing/model/RecentItem;->b()Ljava/lang/Integer;

    .line 33
    .line 34
    .line 35
    move-result-object v3

    .line 36
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/io/Serializable;)Landroid/content/Intent;

    .line 37
    .line 38
    .line 39
    const-string v2, "image"

    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/kcstream/cing/model/RecentItem;->c()Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v3

    .line 45
    invoke-virtual {p1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 46
    .line 47
    .line 48
    const-string v2, "title"

    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kcstream/cing/model/RecentItem;->d()Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    move-result-object v0

    .line 54
    invoke-virtual {p1, v2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :pswitch_0
    new-instance p1, Landroid/content/Intent;

    .line 66
    .line 67
    iget-object v0, p0, LE4/o;->t:Landroid/view/KeyEvent$Callback;

    .line 68
    .line 69
    check-cast v0, Lcom/kcstream/cing/activity/ItemActivity;

    .line 70
    .line 71
    const-class v1, Lcom/kcstream/cing/activity/CommentsActivity;

    .line 72
    .line 73
    invoke-direct {p1, v0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 74
    .line 75
    .line 76
    iget-object v1, p0, LE4/o;->u:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v1, Lcom/kcstream/cing/model/Posts;

    .line 79
    .line 80
    invoke-virtual {v1}, Lcom/kcstream/cing/model/Posts;->h()Ljava/lang/String;

    .line 81
    .line 82
    .line 83
    move-result-object v1

    .line 84
    const-string v2, "slug"

    .line 85
    .line 86
    invoke-virtual {p1, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 90
    .line 91
    .line 92
    return-void

    .line 93
    :pswitch_1
    iget-object p1, p0, LE4/o;->t:Landroid/view/KeyEvent$Callback;

    .line 94
    .line 95
    check-cast p1, Lcom/kcstream/cing/activity/ItemActivity;

    .line 96
    .line 97
    invoke-virtual {p1}, Landroid/app/Activity;->isFinishing()Z

    .line 98
    .line 99
    .line 100
    move-result v0

    .line 101
    if-nez v0, :cond_1

    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    invoke-static {v0}, LA1/h;->j(Landroid/view/LayoutInflater;)LA1/h;

    .line 108
    .line 109
    .line 110
    move-result-object v0

    .line 111
    iget-object v1, p0, LE4/o;->u:Ljava/lang/Object;

    .line 112
    .line 113
    check-cast v1, Lcom/kcstream/cing/model/PostsDownload;

    .line 114
    .line 115
    invoke-virtual {v1}, Lcom/kcstream/cing/model/PostsDownload;->b()Ljava/lang/String;

    .line 116
    .line 117
    .line 118
    move-result-object v2

    .line 119
    iget-object v3, v0, LA1/h;->v:Ljava/lang/Object;

    .line 120
    .line 121
    check-cast v3, Lcom/google/android/material/textview/MaterialTextView;

    .line 122
    .line 123
    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v1}, Lcom/kcstream/cing/model/PostsDownload;->a()Ljava/util/ArrayList;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 131
    .line 132
    .line 133
    move-result-object v2

    .line 134
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 135
    .line 136
    .line 137
    move-result v3

    .line 138
    if-eqz v3, :cond_0

    .line 139
    .line 140
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 141
    .line 142
    .line 143
    move-result-object v3

    .line 144
    check-cast v3, Lcom/kcstream/cing/model/PostsDownloadLinks;

    .line 145
    .line 146
    new-instance v4, Lcom/google/android/material/chip/Chip;

    .line 147
    .line 148
    const/4 v5, 0x0

    .line 149
    invoke-direct {v4, p1, v5}, Lcom/google/android/material/chip/Chip;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {v3}, Lcom/kcstream/cing/model/PostsDownloadLinks;->b()Ljava/lang/String;

    .line 153
    .line 154
    .line 155
    move-result-object v5

    .line 156
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 157
    .line 158
    .line 159
    new-instance v5, LA0/j;

    .line 160
    .line 161
    const/4 v6, 0x1

    .line 162
    invoke-direct {v5, p1, v1, v3, v6}, LA0/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    .line 163
    .line 164
    .line 165
    invoke-static {v4, v5}, LD3/b;->e(Landroid/view/View;Lu8/a;)V

    .line 166
    .line 167
    .line 168
    iget-object v3, v0, LA1/h;->u:Ljava/lang/Object;

    .line 169
    .line 170
    check-cast v3, Lcom/google/android/material/chip/ChipGroup;

    .line 171
    .line 172
    invoke-virtual {v3, v4}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 173
    .line 174
    .line 175
    goto :goto_0

    .line 176
    :cond_0
    new-instance v1, LX2/h;

    .line 177
    .line 178
    invoke-direct {v1, p1}, LX2/h;-><init>(Landroid/content/Context;)V

    .line 179
    .line 180
    .line 181
    iget-object p1, v0, LA1/h;->t:Ljava/lang/Object;

    .line 182
    .line 183
    check-cast p1, Landroid/widget/ScrollView;

    .line 184
    .line 185
    invoke-virtual {v1, p1}, LX2/h;->setContentView(Landroid/view/View;)V

    .line 186
    .line 187
    .line 188
    invoke-virtual {v1}, Landroid/app/Dialog;->show()V

    .line 189
    .line 190
    .line 191
    :cond_1
    return-void

    .line 192
    :pswitch_2
    iget-object p1, p0, LE4/o;->u:Ljava/lang/Object;

    .line 193
    .line 194
    check-cast p1, Lcom/kcstream/cing/model/PostsStream;

    .line 195
    .line 196
    invoke-virtual {p1}, Lcom/kcstream/cing/model/PostsStream;->a()Ljava/lang/String;

    .line 197
    .line 198
    .line 199
    move-result-object p1

    .line 200
    iget-object v0, p0, LE4/o;->t:Landroid/view/KeyEvent$Callback;

    .line 201
    .line 202
    check-cast v0, Lcom/kcstream/cing/activity/ItemActivity;

    .line 203
    .line 204
    iput-object p1, v0, Lcom/kcstream/cing/activity/ItemActivity;->f0:Ljava/lang/String;

    .line 205
    .line 206
    iget-object v0, v0, Lcom/kcstream/cing/activity/ItemActivity;->j0:LB4/g;

    .line 207
    .line 208
    if-eqz v0, :cond_2

    .line 209
    .line 210
    iget-object v0, v0, LB4/g;->k:Lo1/c;

    .line 211
    .line 212
    invoke-virtual {v0, p1}, Lo1/c;->s(Ljava/lang/String;)V

    .line 213
    .line 214
    .line 215
    return-void

    .line 216
    :cond_2
    const-string p1, "agentWeb"

    .line 217
    .line 218
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    const/4 p1, 0x0

    .line 222
    throw p1

    .line 223
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
