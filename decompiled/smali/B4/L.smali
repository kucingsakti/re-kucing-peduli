.class public final LB4/L;
.super Landroid/animation/AnimatorListenerAdapter;
.source "SourceFile"


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public constructor <init>(LU/e0;Landroid/view/View;)V
    .locals 0

    const/4 p2, 0x1

    iput p2, p0, LB4/L;->a:I

    .line 2
    iput-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 0

    .line 1
    iput p2, p0, LB4/L;->a:I

    iput-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    invoke-direct {p0}, Landroid/animation/AnimatorListenerAdapter;-><init>()V

    return-void
.end method


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1

    .line 1
    iget v0, p0, LB4/L;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationCancel(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    const/4 p1, 0x0

    .line 11
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 14
    .line 15
    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->O:Landroid/view/ViewPropertyAnimator;

    .line 16
    .line 17
    const/4 p1, 0x0

    .line 18
    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 19
    .line 20
    return-void

    .line 21
    :sswitch_1
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast p1, LU/e0;

    .line 24
    .line 25
    invoke-interface {p1}, LU/e0;->b()V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_1
        0xa -> :sswitch_0
    .end sparse-switch
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, LB4/L;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationEnd(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_1
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast p1, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;

    .line 13
    .line 14
    const/4 v0, 0x0

    .line 15
    iput-object v0, p1, Lcom/google/android/material/transformation/ExpandableTransformationBehavior;->t:Landroid/animation/AnimatorSet;

    .line 16
    .line 17
    return-void

    .line 18
    :pswitch_2
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 19
    .line 20
    check-cast p1, Lw3/i;

    .line 21
    .line 22
    invoke-virtual {p1}, Lw3/m;->q()V

    .line 23
    .line 24
    .line 25
    iget-object p1, p1, Lw3/i;->r:Landroid/animation/ValueAnimator;

    .line 26
    .line 27
    invoke-virtual {p1}, Landroid/animation/ValueAnimator;->start()V

    .line 28
    .line 29
    .line 30
    return-void

    .line 31
    :pswitch_3
    const/4 p1, 0x5

    .line 32
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;

    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/google/android/material/sidesheet/SideSheetBehavior;->x(I)V

    .line 37
    .line 38
    .line 39
    iget-object p1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->H:Ljava/lang/ref/WeakReference;

    .line 40
    .line 41
    if-eqz p1, :cond_0

    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 44
    .line 45
    .line 46
    move-result-object p1

    .line 47
    if-eqz p1, :cond_0

    .line 48
    .line 49
    iget-object p1, v0, Lcom/google/android/material/sidesheet/SideSheetBehavior;->H:Ljava/lang/ref/WeakReference;

    .line 50
    .line 51
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    check-cast p1, Landroid/view/View;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 58
    .line 59
    .line 60
    :cond_0
    return-void

    .line 61
    :pswitch_4
    const/4 p1, 0x0

    .line 62
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;

    .line 65
    .line 66
    iput-object p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->O:Landroid/view/ViewPropertyAnimator;

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    iput-boolean p1, v0, Landroidx/appcompat/widget/ActionBarOverlayLayout;->B:Z

    .line 70
    .line 71
    return-void

    .line 72
    :pswitch_5
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 73
    .line 74
    check-cast p1, Ll3/f;

    .line 75
    .line 76
    iget-object v0, p1, Ll3/a;->b:Landroid/view/View;

    .line 77
    .line 78
    const/4 v1, 0x0

    .line 79
    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v1}, Ll3/f;->b(F)V

    .line 83
    .line 84
    .line 85
    return-void

    .line 86
    :pswitch_6
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 87
    .line 88
    check-cast v0, LY1/c;

    .line 89
    .line 90
    iget-object v1, v0, LY1/c;->u:Ljava/lang/Object;

    .line 91
    .line 92
    check-cast v1, Landroid/animation/ValueAnimator;

    .line 93
    .line 94
    if-ne v1, p1, :cond_1

    .line 95
    .line 96
    const/4 p1, 0x0

    .line 97
    iput-object p1, v0, LY1/c;->u:Ljava/lang/Object;

    .line 98
    .line 99
    :cond_1
    return-void

    .line 100
    :pswitch_7
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 101
    .line 102
    check-cast p1, Li3/i;

    .line 103
    .line 104
    const/4 v0, 0x0

    .line 105
    iput v0, p1, Li3/i;->r:I

    .line 106
    .line 107
    const/4 v0, 0x0

    .line 108
    iput-object v0, p1, Li3/i;->l:Landroid/animation/Animator;

    .line 109
    .line 110
    return-void

    .line 111
    :pswitch_8
    const/4 p1, 0x5

    .line 112
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 113
    .line 114
    check-cast v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 115
    .line 116
    invoke-virtual {v0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->J(I)V

    .line 117
    .line 118
    .line 119
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:Ljava/lang/ref/WeakReference;

    .line 120
    .line 121
    if-eqz p1, :cond_2

    .line 122
    .line 123
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 124
    .line 125
    .line 126
    move-result-object p1

    .line 127
    if-eqz p1, :cond_2

    .line 128
    .line 129
    iget-object p1, v0, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->m0:Ljava/lang/ref/WeakReference;

    .line 130
    .line 131
    invoke-virtual {p1}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 132
    .line 133
    .line 134
    move-result-object p1

    .line 135
    check-cast p1, Landroid/view/View;

    .line 136
    .line 137
    invoke-virtual {p1}, Landroid/view/View;->requestLayout()V

    .line 138
    .line 139
    .line 140
    :cond_2
    return-void

    .line 141
    :pswitch_9
    new-instance p1, Ljava/util/ArrayList;

    .line 142
    .line 143
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 144
    .line 145
    check-cast v0, LW0/e;

    .line 146
    .line 147
    iget-object v1, v0, LW0/e;->w:Ljava/util/ArrayList;

    .line 148
    .line 149
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 153
    .line 154
    .line 155
    move-result v1

    .line 156
    const/4 v2, 0x0

    .line 157
    :goto_0
    if-ge v2, v1, :cond_3

    .line 158
    .line 159
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 160
    .line 161
    .line 162
    move-result-object v3

    .line 163
    check-cast v3, Ln3/c;

    .line 164
    .line 165
    invoke-virtual {v3, v0}, Ln3/c;->a(Landroid/graphics/drawable/Drawable;)V

    .line 166
    .line 167
    .line 168
    add-int/lit8 v2, v2, 0x1

    .line 169
    .line 170
    goto :goto_0

    .line 171
    :cond_3
    return-void

    .line 172
    :pswitch_a
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 173
    .line 174
    check-cast v0, LV0/p;

    .line 175
    .line 176
    invoke-virtual {v0}, LV0/p;->p()V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 180
    .line 181
    .line 182
    return-void

    .line 183
    :pswitch_b
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 184
    .line 185
    check-cast p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;

    .line 186
    .line 187
    const/4 v0, 0x0

    .line 188
    iput-object v0, p1, Lcom/google/android/material/behavior/HideBottomViewOnScrollBehavior;->z:Landroid/view/ViewPropertyAnimator;

    .line 189
    .line 190
    return-void

    .line 191
    :pswitch_c
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 192
    .line 193
    check-cast p1, LU/e0;

    .line 194
    .line 195
    invoke-interface {p1}, LU/e0;->a()V

    .line 196
    .line 197
    .line 198
    return-void

    .line 199
    :pswitch_d
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 200
    .line 201
    check-cast p1, LB4/M;

    .line 202
    .line 203
    iget v0, p1, LB4/M;->z:I

    .line 204
    .line 205
    const/4 v1, 0x2

    .line 206
    if-ne v0, v1, :cond_4

    .line 207
    .line 208
    iget v0, p1, LB4/M;->A:F

    .line 209
    .line 210
    const/high16 v1, 0x42c80000    # 100.0f

    .line 211
    .line 212
    cmpl-float v0, v0, v1

    .line 213
    .line 214
    if-nez v0, :cond_4

    .line 215
    .line 216
    const/16 v0, 0x8

    .line 217
    .line 218
    invoke-virtual {p1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 219
    .line 220
    .line 221
    const/4 v0, 0x0

    .line 222
    iput v0, p1, LB4/M;->A:F

    .line 223
    .line 224
    const/high16 v0, 0x3f800000    # 1.0f

    .line 225
    .line 226
    invoke-virtual {p1, v0}, Landroid/view/View;->setAlpha(F)V

    .line 227
    .line 228
    .line 229
    :cond_4
    const/4 v0, 0x0

    .line 230
    iput v0, p1, LB4/M;->z:I

    .line 231
    .line 232
    return-void

    .line 233
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
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

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 3

    .line 1
    iget v0, p0, LB4/L;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationRepeat(Landroid/animation/Animator;)V

    .line 11
    .line 12
    .line 13
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast p1, Ln3/m;

    .line 16
    .line 17
    iget v0, p1, Ln3/m;->x:I

    .line 18
    .line 19
    const/4 v1, 0x1

    .line 20
    add-int/2addr v0, v1

    .line 21
    iget-object v2, p1, Ln3/m;->w:Ln3/p;

    .line 22
    .line 23
    iget-object v2, v2, Ln3/p;->c:[I

    .line 24
    .line 25
    array-length v2, v2

    .line 26
    rem-int/2addr v0, v2

    .line 27
    iput v0, p1, Ln3/m;->x:I

    .line 28
    .line 29
    iput-boolean v1, p1, Ln3/m;->y:Z

    .line 30
    .line 31
    return-void

    .line 32
    nop

    .line 33
    :pswitch_data_0
    .packed-switch 0x9
        :pswitch_0
    .end packed-switch
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 4

    .line 1
    iget v0, p0, LB4/L;->a:I

    .line 2
    .line 3
    sparse-switch v0, :sswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Landroid/animation/AnimatorListenerAdapter;->onAnimationStart(Landroid/animation/Animator;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :sswitch_0
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 11
    .line 12
    check-cast v0, Li3/i;

    .line 13
    .line 14
    iget-object v1, v0, Li3/i;->s:Lcom/google/android/material/floatingactionbutton/FloatingActionButton;

    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    invoke-virtual {v1, v2, v2}, Lj3/F;->a(IZ)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x2

    .line 21
    iput v1, v0, Li3/i;->r:I

    .line 22
    .line 23
    iput-object p1, v0, Li3/i;->l:Landroid/animation/Animator;

    .line 24
    .line 25
    return-void

    .line 26
    :sswitch_1
    new-instance p1, Ljava/util/ArrayList;

    .line 27
    .line 28
    iget-object v0, p0, LB4/L;->b:Ljava/lang/Object;

    .line 29
    .line 30
    check-cast v0, LW0/e;

    .line 31
    .line 32
    iget-object v1, v0, LW0/e;->w:Ljava/util/ArrayList;

    .line 33
    .line 34
    invoke-direct {p1, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Ljava/util/ArrayList;->size()I

    .line 38
    .line 39
    .line 40
    move-result v1

    .line 41
    const/4 v2, 0x0

    .line 42
    :goto_0
    if-ge v2, v1, :cond_0

    .line 43
    .line 44
    invoke-virtual {p1, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    check-cast v3, Ln3/c;

    .line 49
    .line 50
    invoke-virtual {v3, v0}, Ln3/c;->b(Landroid/graphics/drawable/Drawable;)V

    .line 51
    .line 52
    .line 53
    add-int/lit8 v2, v2, 0x1

    .line 54
    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return-void

    .line 57
    :sswitch_2
    iget-object p1, p0, LB4/L;->b:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast p1, LU/e0;

    .line 60
    .line 61
    invoke-interface {p1}, LU/e0;->c()V

    .line 62
    .line 63
    .line 64
    return-void

    .line 65
    :sswitch_data_0
    .sparse-switch
        0x1 -> :sswitch_2
        0x4 -> :sswitch_1
        0x6 -> :sswitch_0
    .end sparse-switch
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
.end method
