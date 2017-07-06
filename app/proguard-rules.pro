
# avidly
-keep class com.avidly.ads.** {*;}
-keep class com.sm.avid.decode.** {*;}
-keep class com.avidly.ads.unity.** {*;}
-keep interface com.avidly.ads.** {*;}
-keep interface com.sm.avid.decode.** {*;}
-keepclasseswithmembernames class * {
    native <methods>;
}
-dontwarn com.avidly.**
# avidly end

# support
-keep public class * extends android.support.v4.app.Fragment
-dontwarn android.support.**
# support end

# facebook
-keep class com.facebook.ads.InterstitialAd
-keep class com.facebook.ads.AdView
-keep class com.facebook.ads.Ad
-dontwarn com.facebook.ads.internal.**
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
-keep class com.google.android.gms.ads.AdRequest
-keep class com.google.android.gms.ads.reward.RewardedVideoAd
-keep class com.google.android.gms.ads.InterstitialAd
-keep class com.google.android.gms.ads.AdView
-dontwarn com.google.android.gms.**
# google end

# adcolony
-keep class com.adcolony.** { *; }
-dontwarn com.adcolony.**
-dontnote com.adcolony.**
# adcolony end

# vungle
-keep class com.vungle.** { *; }
-keep class javax.inject.*
-keepattributes *Annotation*
-keepattributes Signature
-keep class dagger.*
-dontwarn com.vungle.**
-dontnote com.vungle.**
# vungle end

# mobvista
-keepattributes Signature
-keepattributes *Annotation*
-keep class com.mobvista.** {*; }
-keep interface com.mobvista.** {*; }
-keep class android.support.v4.** { *; }
-dontwarn com.mobvista.**
-keep class **.R$* { public static final int mobvista*; }
# mobvista end

# unity
-keepattributes SourceFile,LineNumberTable
-keepattributes JavascriptInterface
-keep class android.webkit.JavascriptInterface {*;}
-keep class com.unity3d.ads.** {*;}
# unity end

# appnext
-keep class com.appnext.** { *; }
-dontwarn com.appnext.**
# appnext end

# applovin
-keep class com.applovin.** { *; }
-dontwarn com.applovin.**
# applovin end
