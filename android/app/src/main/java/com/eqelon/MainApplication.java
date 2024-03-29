package com.eqelon;

import android.app.Application;

import com.facebook.react.ReactApplication;
import com.rnfs.RNFSPackage;
import io.github.elyx0.reactnativedocumentpicker.DocumentPickerPackage;
import com.rssignaturecapture.RSSignatureCapturePackage;
// import com.benwixen.rnfilesystem.RNFileSystemPackage;
import com.airbnb.android.react.maps.MapsPackage;
import io.realm.react.RealmReactPackage;
import com.oblador.vectoricons.VectorIconsPackage;
import com.facebook.react.ReactNativeHost;
import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainReactPackage;
import com.facebook.soloader.SoLoader;
//import io.realm.react.RealmReactPackage;
import java.util.Arrays;
import java.util.List;

//import org.pgsqlite.SQLitePluginPackage;

public class MainApplication extends Application implements ReactApplication {

  private final ReactNativeHost mReactNativeHost = new ReactNativeHost(this) {
    @Override
    public boolean getUseDeveloperSupport() {
      return BuildConfig.DEBUG;
    }

    @Override
    protected List<ReactPackage> getPackages() {
      // return Arrays.<ReactPackage>asList(new SQLitePluginPackage(),
      // register SQLite Plugin here
      return Arrays.<ReactPackage>asList(new MainReactPackage(),
            new RNFSPackage(),
            new DocumentPickerPackage(),
            new RSSignatureCapturePackage(),
          // new RNFileSystemPackage(),
          new MapsPackage(), new RealmReactPackage(), new VectorIconsPackage() // add this line to fix missing
                                                                               // realm constructor
      );
    }

    @Override
    protected String getJSMainModuleName() {
      return "index";
    }
  };

  @Override
  public ReactNativeHost getReactNativeHost() {
    return mReactNativeHost;
  }

  @Override
  public void onCreate() {
    super.onCreate();
    SoLoader.init(this, /* native exopackage */ false);
  }
}
