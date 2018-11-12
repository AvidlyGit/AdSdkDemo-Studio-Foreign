
# avidly
-keep class com.avidly.ads.** {*;}
-keep class com.up.ads.** {*;}
-keep interface com.up.ads.** {*;}
-keep class com.avidly.channel.** { *; }
-keep class com.up.channel.** { *; }
-keep class com.sm.avid.decode.** {*;}
-keep class com.avidly.playablead.ext.** {*;}
-keep interface com.avidly.ads.** {*;}
-keep interface com.sm.avid.decode.** {*;}
-keep class com.hola.sdk.* {*;}
-keep class com.statistics.channel.* {*;}
-keep class com.aly.analysis.sdk.api.* {*;}
-keepclasseswithmembernames class * {
    native <methods>;
}
-dontwarn com.avidly.**
-dontwarn com.up.**
-keep class com.statistics.channel.* {*;}
# avidly end

# support
-keep public class * extends android.support.v4.app.Fragment
-keep class android.support.** {*;}
-keep class com.google.gson.** {*;}
-dontwarn android.support.**
# support end

# facebook
-keep class com.facebook.ads.InterstitialAd {*;}
-keep class com.facebook.ads.AdView {*;}
-keep class com.facebook.ads.Ad {*;}
-keep class com.facebook.ads.RewardedVideoAd {*;}
-keep class com.facebook.ads.AdListener {*;}
-keep class com.facebook.ads.BuildConfig {*;}
-dontwarn com.facebook.ads.internal.**
-keep class com.facebook.bidding.** {*;}
-keep class com.google.android.exoplayer2.** {*;}
-dontwarn com.google.android.exoplayer2.**
# facebook end

# google
-keep class * extends java.util.ListResourceBundle {
    protected java.lang.Object[][] getContents();
}
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
    public static final *** NULL;
}
-keepclassmembers enum * {
  public static **[] values();
  public static ** valueOf(java.lang.String);
}
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
    @com.google.android.gms.common.annotation.KeepName *;
}
-keepnames class * implements android.os.Parcelable {
    public static final ** CREATOR;
}
-keep class * extends java.util.ListResourceBundle {
    protected java.lang.Object[][] getContents();
}
-keep class com.google.android.gms.ads.** {*;}
-keep class com.google.android.gms.common.** {*;}
-dontwarn com.google.android.gms.**
-dontwarn com.google.protobuf.**
# google end

# adcolony
-keep class com.adcolony.** { *; }
-dontwarn com.adcolony.**
-dontnote com.adcolony.**
# adcolony end

# vungle
-keep class com.vungle.warren.** { *; }
-keep class com.moat.** { *; }
-keep class com.google.android.gms.internal.** { *; }
-dontwarn com.vungle.warren.error.VungleError$ErrorCode
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-dontwarn retrofit2.Platform$Java8
-keepattributes Signature
-keepattributes *Annotation*
-dontwarn sun.misc.**
-dontwarn com.vungle.warren.**
-dontwarn okio.**
-dontwarn retrofit2.**
-dontwarn com.moat.**
-dontwarn com.google.android.gms.ads.identifier.**
-dontwarn org.codehaus.mojo.animal_sniffer.IgnoreJRERequirement
-keeppackagenames 'net.vrallev.android.cat'
-keeppackagenames 'retrofit2.converter.gson'
-keeppackagenames 'com.tonyodev.fetch'
-keeppackagenames 'okhttp3.logging'
-keeppackagenames 'okhttp3'
-keeppackagenames 'okio'
-keeppackagenames 'retrofit2'
# vungle end

# mobvista
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.mintegral.** {*;}
-keep interface com.mintegral.** {*;}

-keep class com.mobvista.** {*; }
-keep interface com.mobvista.** {*; }
-keep class android.support.v4.** { *; }
-dontwarn com.mobvista.**
-dontwarn com.mintegral.**
-keep class **.R$* { public static final int mintegral*; }
-keep class com.alphab.** {*; }
-keep interface com.alphab.** {*; }
# mobvista end

# unity
-keepattributes SourceFile,LineNumberTable
-keepattributes JavascriptInterface
-keep class android.webkit.JavascriptInterface {*;}
-keep class com.unity3d.ads.** {*;}
-keep class com.unity3d.services.** {*;}
-dontwarn com.google.ar.core.**
# unity end

# appnext
-keep class com.appnext.** { *; }
-dontwarn com.appnext.**
# appnext end

# applovin
-keep class com.applovin.** { *; }
-dontwarn com.applovin.**
# applovin end

# chartboost
-keep class com.chartboost.** { *; }
-dontwarn com.chartboost.**
# chartboost end

# playable
-keep class com.avidly.playablead.app.** { *; }
# playable end

# ironsource
-keep class com.ironsource.mediationsdk.IronSource
-keep class com.moat.** { *; }
-keepclassmembers class com.ironsource.sdk.controller.IronSourceWebView$JSInterface {
    public *;
}
-keepclassmembers class * implements android.os.Parcelable {
    public static final android.os.Parcelable$Creator *;
}
-keep public class com.google.android.gms.ads.** {
   public *;
}
-keep public class com.google.ads.** {
   public *;
}

-keep class com.ironsource.adapters.** { *;
}
# ironsource end

# vk
-keep class com.my.target.** {*;}
-dontwarn com.my.target.**
-dontwarn com.mopub.**
# vk end

# batmobi
-keep class com.batmobi.** { *;}
-dontwarn com.batmobi.**
# batmobi end

# inmobi
-keepattributes SourceFile,LineNumberTable
-keep class com.inmobi.** { *; }
-dontwarn com.inmobi.**
-keep public class com.google.android.gms.**
-dontwarn com.google.android.gms.**
-dontwarn com.squareup.picasso.**
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient{
     public *;
}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient$Info{
     public *;
}
-keep class com.squareup.picasso.** {*;}
-dontwarn com.squareup.picasso.**
-dontwarn com.squareup.okhttp.**
-keep class com.moat.** {*;}
-dontwarn com.moat.**
-keep class com.integralads.avid.library.* {*;}
# inmobi end

# dap
-keep class com.duapps.ad.**{*;}
-dontwarn com.duapps.ad.**
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.content.ContentProvider
-keep class com.dianxinos.DXStatService.stat.TokenManager {public static java.lang.String getToken(android.content.Context); }
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {@com.google.android.gms.common.annotation.KeepName *;}
-keep class com.google.android.gms.common.GooglePlayServicesUtil {public <methods>;}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient {public <methods>;}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient$Info {public <methods>;}
-keep class com.duapps.ad.banner.BannerListener {*;}
# dap end

# maio
-keep class jp.maio.sdk.android.** { *; }
-dontwarn jp.maio.sdk.android.**
-dontnote jp.maio.sdk.android.**
# maio end

# nend
-keep class net.nend.android.** { *; }
-dontwarn net.nend.android.**
-dontnote net.nend.android.**
# nend end

# oneway
-keepattributes *Annotation*
-keep enum mobi.oneway.sdk.* {*;}
-keep class mobi.oneway.sdk.** {*;}
# oneway end

# dap
-keep class com.duapps.ad.**{*;}
-dontwarn com.duapps.ad.**
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.content.ContentProvider
-keep class com.dianxinos.DXStatService.stat.TokenManager {public static java.lang.String getToken(android.content.Context); }
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {@com.google.android.gms.common.annotation.KeepName *;}
-keep class com.google.android.gms.common.GooglePlayServicesUtil {public <methods>;}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient {public <methods>;}
-keep class com.google.android.gms.ads.identifier.AdvertisingIdClient$Info {public <methods>;}
-keep class com.duapps.ad.banner.BannerListener {*;}
# dap end

# domob
-dontwarn cn.domob.**
-keep class cn.domob.** { *; }
-dontwarn com.dvx.**
-keep class com.dvx.**{ *; }
-dontwarn com.pad.android_independent_video_sdk.**
-keep class com.pad.android_independent_video_sdk.** { *; }
-dontwarn android.support.v4.**
-keep class android.support.v4.** { *; }
# domob end

# gdt
-keep class com.qq.e.** {
    public protected *;
}
-keep class android.support.v4.app.NotificationCompat**{
    public *;
}
-keep class android.support.v4.**{ *;}
# gdt end

# youappi
-keep class com.google.gson.**{ *;}
-keep class com.google.android.gms.**{*;}
-keep class com.youappi.sdk.**{*;}
-keep class com.moat.** { *; }
-keep class com.ai.t.** { *; }
-keep interface com.youappi.sdk.**{*;}
-keep enum com.youappi.sdk.**{*;}
-keepclassmembers class * {
   @android.webkit.JavascriptInterface <methods>;
}
-dontwarn com.youappi.sdk.**
-dontwarn com.ai.t.network.**
# youappi end

# tapjoy
-keep class com.tapjoy.** { *; }
-keepattributes JavascriptInterface
-keepattributes *Annotation*
-keep class * extends java.util.ListResourceBundle {
protected Object[][] getContents();
}
-keep public class com.google.android.gms.common.internal.safeparcel.SafeParcelable {
public static final *** NULL;
}
-keepnames @com.google.android.gms.common.annotation.KeepName class *
-keepclassmembernames class * {
@com.google.android.gms.common.annotation.KeepName *;
}
-keepnames class * implements android.os.Parcelable {
public static final ** CREATOR;
}
-keep class com.google.android.gms.ads.identifier.** { *; }
-dontwarn com.tapjoy.**
# tapjoy end

# centrixlink
-dontwarn com.centrixlink.**
-keep class com.centrixlink.**  { *; }
# centrixlink end

# youlan
-keep class com.youlan.youlansdk.** { *;}
# youlan end

# toutiao
-keep class com.bytedance.sdk.openadsdk.** { *; }
-keep class com.androidquery.callback.** {*;}
-dontwarn com.bytedance.sdk.**
-dontwarn com.androidquery.**
-dontwarn com.ss.android.**
# toutiao end

# amazon
-keep class com.amazon.device.ads.** { *; }
# amazon end

# mobpower
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.mobpower.** {*; }
-keep class com.mrad.** {*; }
-keep class com.power.** {*; }
-keepclassmembers class * implements android.os.Parcelable {
    public static final ** CREATOR;
}
# mobpower end
