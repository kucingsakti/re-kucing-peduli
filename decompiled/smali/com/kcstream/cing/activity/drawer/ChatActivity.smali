.class public final Lcom/kcstream/cing/activity/drawer/ChatActivity;
.super LK4/f;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/kcstream/cing/activity/drawer/ChatActivity;",
        "LK4/f;",
        "<init>",
        "()V",
        "app_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x9,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public V:LA1/h;

.field public W:LB4/g;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LK4/f;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
    .line 5
    .line 6
    .line 7
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
.method public final onCreate(Landroid/os/Bundle;)V
    .locals 4

    .line 1
    invoke-super {p0, p1}, LK4/f;->onCreate(Landroid/os/Bundle;)V

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0}, Landroid/app/Activity;->getLayoutInflater()Landroid/view/LayoutInflater;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    invoke-static {p1}, LA1/h;->i(Landroid/view/LayoutInflater;)LA1/h;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    iput-object p1, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->V:LA1/h;

    .line 13
    .line 14
    iget-object p1, p1, LA1/h;->t:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast p1, Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 17
    .line 18
    invoke-virtual {p0, p1}, Li/l;->setContentView(Landroid/view/View;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->V:LA1/h;

    .line 22
    .line 23
    const/4 v0, 0x0

    .line 24
    const-string v1, "binding"

    .line 25
    .line 26
    if-eqz p1, :cond_1

    .line 27
    .line 28
    iget-object p1, p1, LA1/h;->u:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast p1, Lcom/google/android/material/appbar/MaterialToolbar;

    .line 31
    .line 32
    invoke-virtual {p0, p1}, Li/l;->v(Landroidx/appcompat/widget/Toolbar;)V

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0}, Li/l;->l()LJ7/j;

    .line 36
    .line 37
    .line 38
    move-result-object p1

    .line 39
    invoke-static {p1}, Lv8/i;->c(Ljava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    const-string v2, "Chat"

    .line 43
    .line 44
    invoke-virtual {p1, v2}, LJ7/j;->R(Ljava/lang/CharSequence;)V

    .line 45
    .line 46
    .line 47
    const/4 v2, 0x1

    .line 48
    invoke-virtual {p1, v2}, LJ7/j;->H(Z)V

    .line 49
    .line 50
    .line 51
    invoke-static {p0}, LB4/g;->a(Landroid/app/Activity;)LB4/e;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    iget-object v3, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->V:LA1/h;

    .line 56
    .line 57
    if-eqz v3, :cond_0

    .line 58
    .line 59
    new-instance v0, Landroid/widget/LinearLayout$LayoutParams;

    .line 60
    .line 61
    const/4 v1, -0x1

    .line 62
    invoke-direct {v0, v1, v1}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 63
    .line 64
    .line 65
    iget-object v1, v3, LA1/h;->v:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v1, Landroid/widget/RelativeLayout;

    .line 68
    .line 69
    invoke-virtual {p1, v1, v0}, LB4/e;->m(Landroid/view/ViewGroup;Landroid/widget/LinearLayout$LayoutParams;)LA1/r;

    .line 70
    .line 71
    .line 72
    move-result-object p1

    .line 73
    const v0, 0x7f040134

    .line 74
    .line 75
    .line 76
    invoke-static {p0, v0}, LD3/b;->m(Landroid/content/Context;I)I

    .line 77
    .line 78
    .line 79
    move-result v0

    .line 80
    invoke-virtual {p1, v0}, LA1/r;->K(I)Le1/j;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    invoke-virtual {p1}, Le1/j;->H()LA1/J;

    .line 85
    .line 86
    .line 87
    move-result-object p1

    .line 88
    invoke-virtual {p1}, LA1/J;->j()V

    .line 89
    .line 90
    .line 91
    const-string v0, "https://hentaipoi.chatango.com/"

    .line 92
    .line 93
    invoke-virtual {p1, v0}, LA1/J;->h(Ljava/lang/String;)LB4/g;

    .line 94
    .line 95
    .line 96
    move-result-object p1

    .line 97
    iput-object p1, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->W:LB4/g;

    .line 98
    .line 99
    iget-object p1, p1, LB4/g;->c:LB1/a;

    .line 100
    .line 101
    iget-object p1, p1, LB1/a;->s:Ljava/lang/Object;

    .line 102
    .line 103
    check-cast p1, Landroid/webkit/WebSettings;

    .line 104
    .line 105
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setSupportMultipleWindows(Z)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V

    .line 109
    .line 110
    .line 111
    return-void

    .line 112
    :cond_0
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 113
    .line 114
    .line 115
    throw v0

    .line 116
    :cond_1
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 117
    .line 118
    .line 119
    throw v0
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

.method public final onOptionsItemSelected(Landroid/view/MenuItem;)Z
    .locals 4

    .line 1
    const-string v0, "item"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Landroid/view/MenuItem;->getItemId()I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    const v0, 0x102002c

    .line 11
    .line 12
    .line 13
    if-ne p1, v0, :cond_3

    .line 14
    .line 15
    invoke-virtual {p0}, Ld/m;->j()Ld/x;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    invoke-virtual {p1}, Ld/x;->a()V

    .line 20
    .line 21
    .line 22
    iget-object p1, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->W:LB4/g;

    .line 23
    .line 24
    const/4 v0, 0x0

    .line 25
    const-string v1, "agentWeb"

    .line 26
    .line 27
    if-eqz p1, :cond_2

    .line 28
    .line 29
    iget-object v2, p1, LB4/g;->b:LB4/E;

    .line 30
    .line 31
    iget-object v2, v2, LB4/E;->f:Landroid/webkit/WebView;

    .line 32
    .line 33
    iget-object p1, p1, LB4/g;->a:Landroid/app/Activity;

    .line 34
    .line 35
    if-eqz v2, :cond_0

    .line 36
    .line 37
    invoke-static {p1, v2}, LB4/f;->b(Landroid/app/Activity;Landroid/webkit/WebView;)V

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    :try_start_0
    new-instance v2, LB4/F;

    .line 42
    .line 43
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 44
    .line 45
    .line 46
    move-result-object v3

    .line 47
    invoke-direct {v2, v3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v2}, LB4/f;->b(Landroid/app/Activity;Landroid/webkit/WebView;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 51
    .line 52
    .line 53
    goto :goto_0

    .line 54
    :catch_0
    move-exception p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V

    .line 56
    .line 57
    .line 58
    :goto_0
    iget-object p1, p0, Lcom/kcstream/cing/activity/drawer/ChatActivity;->W:LB4/g;

    .line 59
    .line 60
    if-eqz p1, :cond_1

    .line 61
    .line 62
    iget-object p1, p1, LB4/g;->l:LA1/r;

    .line 63
    .line 64
    invoke-virtual {p1}, LA1/r;->I()V

    .line 65
    .line 66
    .line 67
    goto :goto_1

    .line 68
    :cond_1
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    throw v0

    .line 72
    :cond_2
    invoke-static {v1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    throw v0

    .line 76
    :cond_3
    :goto_1
    const/4 p1, 0x1

    .line 77
    return p1
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
.end method
