.class public final Lcom/onesignal/session/internal/outcomes/impl/l$d$a;
.super Lv8/k;
.source "SourceFile"

# interfaces
.implements Lu8/b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/onesignal/session/internal/outcomes/impl/l$d;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic $events:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/onesignal/session/internal/outcomes/impl/f;",
            ">;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lcom/onesignal/session/internal/outcomes/impl/l;


# direct methods
.method public constructor <init>(Lcom/onesignal/session/internal/outcomes/impl/l;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/onesignal/session/internal/outcomes/impl/l;",
            "Ljava/util/List<",
            "Lcom/onesignal/session/internal/outcomes/impl/f;",
            ">;)V"
        }
    .end annotation

    iput-object p1, p0, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->this$0:Lcom/onesignal/session/internal/outcomes/impl/l;

    iput-object p2, p0, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->$events:Ljava/util/List;

    const/4 p1, 0x1

    invoke-direct {p0, p1}, Lv8/k;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, La5/a;

    invoke-virtual {p0, p1}, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->invoke(La5/a;)V

    sget-object p1, Lh8/m;->a:Lh8/m;

    return-object p1
.end method

.method public final invoke(La5/a;)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "cursor"

    invoke-static {v2, v0}, Lv8/i;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-interface {v2}, La5/a;->moveToFirst()Z

    move-result v0

    if-eqz v0, :cond_4

    .line 3
    :cond_0
    const-string v0, "notification_influence_type"

    invoke-interface {v2, v0}, La5/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 4
    sget-object v3, Lh6/d;->Companion:Lh6/d$a;

    invoke-virtual {v3, v0}, Lh6/d$a;->fromString(Ljava/lang/String;)Lh6/d;

    move-result-object v0

    .line 5
    const-string v4, "iam_influence_type"

    invoke-interface {v2, v4}, La5/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 6
    invoke-virtual {v3, v4}, Lh6/d$a;->fromString(Ljava/lang/String;)Lh6/d;

    move-result-object v6

    .line 7
    const-string v3, "notification_ids"

    invoke-interface {v2, v3}, La5/a;->getOptString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v4, "[]"

    if-nez v3, :cond_1

    move-object v3, v4

    .line 8
    :cond_1
    const-string v5, "iam_ids"

    invoke-interface {v2, v5}, La5/a;->getOptString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_2

    move-object v9, v4

    goto :goto_0

    :cond_2
    move-object v9, v5

    .line 9
    :goto_0
    const-string v4, "name"

    invoke-interface {v2, v4}, La5/a;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    .line 10
    const-string v4, "weight"

    invoke-interface {v2, v4}, La5/a;->getFloat(Ljava/lang/String;)F

    move-result v13

    .line 11
    const-string v4, "timestamp"

    invoke-interface {v2, v4}, La5/a;->getLong(Ljava/lang/String;)J

    move-result-wide v16

    .line 12
    const-string v4, "session_time"

    invoke-interface {v2, v4}, La5/a;->getLong(Ljava/lang/String;)J

    move-result-wide v14

    .line 13
    :try_start_0
    new-instance v7, Lcom/onesignal/session/internal/outcomes/impl/n;

    const/4 v4, 0x3

    const/4 v12, 0x0

    invoke-direct {v7, v12, v12, v4, v12}, Lcom/onesignal/session/internal/outcomes/impl/n;-><init>(Lorg/json/JSONArray;Lorg/json/JSONArray;ILv8/e;)V

    .line 14
    new-instance v8, Lcom/onesignal/session/internal/outcomes/impl/n;

    invoke-direct {v8, v12, v12, v4, v12}, Lcom/onesignal/session/internal/outcomes/impl/n;-><init>(Lorg/json/JSONArray;Lorg/json/JSONArray;ILv8/e;)V

    .line 15
    iget-object v4, v1, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->this$0:Lcom/onesignal/session/internal/outcomes/impl/l;

    invoke-static {v4, v0, v7, v8, v3}, Lcom/onesignal/session/internal/outcomes/impl/l;->access$getNotificationInfluenceSource(Lcom/onesignal/session/internal/outcomes/impl/l;Lh6/d;Lcom/onesignal/session/internal/outcomes/impl/n;Lcom/onesignal/session/internal/outcomes/impl/n;Ljava/lang/String;)Lcom/onesignal/session/internal/outcomes/impl/m;

    move-result-object v10

    .line 16
    iget-object v5, v1, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->this$0:Lcom/onesignal/session/internal/outcomes/impl/l;

    .line 17
    invoke-static/range {v5 .. v10}, Lcom/onesignal/session/internal/outcomes/impl/l;->access$getIAMInfluenceSource(Lcom/onesignal/session/internal/outcomes/impl/l;Lh6/d;Lcom/onesignal/session/internal/outcomes/impl/n;Lcom/onesignal/session/internal/outcomes/impl/n;Ljava/lang/String;Lcom/onesignal/session/internal/outcomes/impl/m;)Lcom/onesignal/session/internal/outcomes/impl/m;

    if-nez v10, :cond_3

    .line 18
    new-instance v10, Lcom/onesignal/session/internal/outcomes/impl/m;

    invoke-direct {v10, v12, v12}, Lcom/onesignal/session/internal/outcomes/impl/m;-><init>(Lcom/onesignal/session/internal/outcomes/impl/n;Lcom/onesignal/session/internal/outcomes/impl/n;)V

    :cond_3
    move-object v12, v10

    goto :goto_1

    :catch_0
    move-exception v0

    goto :goto_2

    .line 19
    :goto_1
    new-instance v10, Lcom/onesignal/session/internal/outcomes/impl/f;

    invoke-direct/range {v10 .. v17}, Lcom/onesignal/session/internal/outcomes/impl/f;-><init>(Ljava/lang/String;Lcom/onesignal/session/internal/outcomes/impl/m;FJJ)V

    iget-object v0, v1, Lcom/onesignal/session/internal/outcomes/impl/l$d$a;->$events:Ljava/util/List;

    .line 20
    invoke-interface {v0, v10}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Lorg/json/JSONException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_3

    .line 21
    :goto_2
    const-string v3, "Generating JSONArray from notifications ids outcome:JSON Failed."

    .line 22
    invoke-static {v3, v0}, Lcom/onesignal/debug/internal/logging/b;->error(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 23
    :goto_3
    invoke-interface {v2}, La5/a;->moveToNext()Z

    move-result v0

    if-nez v0, :cond_0

    :cond_4
    return-void
.end method
