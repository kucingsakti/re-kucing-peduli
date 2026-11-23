.class public final synthetic LA0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lq0/O;


# instance fields
.field public final synthetic s:LA0/d;


# direct methods
.method public synthetic constructor <init>(LA0/d;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA0/a;->s:LA0/d;

    return-void
.end method


# virtual methods
.method public final b(Landroidx/fragment/app/e;Landroidx/fragment/app/b;)V
    .locals 2

    .line 1
    iget-object v0, p0, LA0/a;->s:LA0/d;

    .line 2
    .line 3
    const-string v1, "this$0"

    .line 4
    .line 5
    invoke-static {v0, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "<anonymous parameter 0>"

    .line 9
    .line 10
    invoke-static {p1, v1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    const-string p1, "childFragment"

    .line 14
    .line 15
    invoke-static {p2, p1}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    iget-object p1, v0, LA0/d;->e:Ljava/util/LinkedHashSet;

    .line 19
    .line 20
    iget-object v1, p2, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 21
    .line 22
    invoke-static {p1}, Lv8/x;->a(Ljava/util/Collection;)Ljava/util/Collection;

    .line 23
    .line 24
    .line 25
    move-result-object p1

    .line 26
    invoke-interface {p1, v1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result p1

    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    iget-object p1, p2, Landroidx/fragment/app/b;->l0:Landroidx/lifecycle/u;

    .line 33
    .line 34
    iget-object v1, v0, LA0/d;->f:LN0/b;

    .line 35
    .line 36
    invoke-virtual {p1, v1}, Landroidx/lifecycle/u;->a(Landroidx/lifecycle/r;)V

    .line 37
    .line 38
    .line 39
    :cond_0
    iget-object p1, v0, LA0/d;->g:Ljava/util/LinkedHashMap;

    .line 40
    .line 41
    iget-object p2, p2, Landroidx/fragment/app/b;->T:Ljava/lang/String;

    .line 42
    .line 43
    invoke-static {p1}, Lv8/x;->c(Ljava/util/LinkedHashMap;)Ljava/util/Map;

    .line 44
    .line 45
    .line 46
    invoke-interface {p1, p2}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    return-void
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
.end method
