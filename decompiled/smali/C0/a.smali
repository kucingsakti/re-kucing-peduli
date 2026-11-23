.class public final LC0/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/preference/TwoStatePreference;


# direct methods
.method public synthetic constructor <init>(Landroidx/preference/TwoStatePreference;I)V
    .locals 0

    .line 1
    iput p2, p0, LC0/a;->a:I

    iput-object p1, p0, LC0/a;->b:Landroidx/preference/TwoStatePreference;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onCheckedChanged(Landroid/widget/CompoundButton;Z)V
    .locals 1

    .line 1
    iget p1, p0, LC0/a;->a:I

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    iget-object v0, p0, LC0/a;->b:Landroidx/preference/TwoStatePreference;

    .line 11
    .line 12
    check-cast v0, Landroidx/preference/SwitchPreferenceCompat;

    .line 13
    .line 14
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->f(Ljava/io/Serializable;)Z

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p2}, Landroidx/preference/TwoStatePreference;->C(Z)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :pswitch_0
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    iget-object v0, p0, LC0/a;->b:Landroidx/preference/TwoStatePreference;

    .line 26
    .line 27
    check-cast v0, Landroidx/preference/SwitchPreference;

    .line 28
    .line 29
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->f(Ljava/io/Serializable;)Z

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p2}, Landroidx/preference/TwoStatePreference;->C(Z)V

    .line 33
    .line 34
    .line 35
    return-void

    .line 36
    :pswitch_1
    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 37
    .line 38
    .line 39
    move-result-object p1

    .line 40
    iget-object v0, p0, LC0/a;->b:Landroidx/preference/TwoStatePreference;

    .line 41
    .line 42
    check-cast v0, Landroidx/preference/CheckBoxPreference;

    .line 43
    .line 44
    invoke-virtual {v0, p1}, Landroidx/preference/Preference;->f(Ljava/io/Serializable;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, p2}, Landroidx/preference/TwoStatePreference;->C(Z)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
