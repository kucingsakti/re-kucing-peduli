.class public final synthetic LE4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic s:I

.field public final synthetic t:Lcom/kcstream/cing/activity/Browser2Activity;


# direct methods
.method public synthetic constructor <init>(Lcom/kcstream/cing/activity/Browser2Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, LE4/b;->s:I

    iput-object p1, p0, LE4/b;->t:Lcom/kcstream/cing/activity/Browser2Activity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .line 1
    iget-object p1, p0, LE4/b;->t:Lcom/kcstream/cing/activity/Browser2Activity;

    .line 2
    .line 3
    iget v0, p0, LE4/b;->s:I

    .line 4
    .line 5
    packed-switch v0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    sget v0, Lcom/kcstream/cing/activity/Browser2Activity;->X:I

    .line 9
    .line 10
    iget-object v0, p1, Lcom/kcstream/cing/activity/Browser2Activity;->R:LE4/c;

    .line 11
    .line 12
    const/4 v1, 0x0

    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    iget-object p1, p1, Lcom/kcstream/cing/activity/Browser2Activity;->P:LFa/e;

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    .line 19
    iget-object p1, p1, LFa/e;->x:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Landroidx/viewpager2/widget/ViewPager2;

    .line 22
    .line 23
    invoke-virtual {p1}, Landroidx/viewpager2/widget/ViewPager2;->getCurrentItem()I

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    iget-object v0, v0, LE4/c;->n:Ljava/util/HashMap;

    .line 28
    .line 29
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 30
    .line 31
    .line 32
    move-result-object p1

    .line 33
    invoke-virtual {v0, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 34
    .line 35
    .line 36
    move-result-object p1

    .line 37
    move-object v1, p1

    .line 38
    check-cast v1, LE4/g;

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    const-string p1, "binding"

    .line 42
    .line 43
    invoke-static {p1}, Lv8/i;->n(Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    throw v1

    .line 47
    :cond_1
    :goto_0
    if-eqz v1, :cond_2

    .line 48
    .line 49
    iget-object p1, v1, LE4/g;->x0:LA1/h;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    iget-object p1, p1, LA1/h;->v:Ljava/lang/Object;

    .line 54
    .line 55
    check-cast p1, Landroid/webkit/WebView;

    .line 56
    .line 57
    invoke-virtual {p1}, Landroid/webkit/WebView;->reload()V

    .line 58
    .line 59
    .line 60
    :cond_2
    return-void

    .line 61
    :pswitch_0
    sget v0, Lcom/kcstream/cing/activity/Browser2Activity;->X:I

    .line 62
    .line 63
    const-string v0, "this$0"

    .line 64
    .line 65
    invoke-static {p1, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Landroid/app/Activity;->finish()V

    .line 69
    .line 70
    .line 71
    return-void

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
